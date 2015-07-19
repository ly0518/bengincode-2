package org.begincode.core.paginator;

import java.io.StringReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import net.sf.jsqlparser.parser.CCJSqlParserManager;
import net.sf.jsqlparser.schema.Column;
import net.sf.jsqlparser.statement.select.AllColumns;
import net.sf.jsqlparser.statement.select.PlainSelect;
import net.sf.jsqlparser.statement.select.Select;
import net.sf.jsqlparser.statement.select.SelectExpressionItem;
import net.sf.jsqlparser.statement.select.SelectItem;

import org.apache.ibatis.executor.ErrorContext;
import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.executor.ExecutorException;
import org.apache.ibatis.executor.statement.StatementHandler;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.mapping.MappedStatement.Builder;
import org.apache.ibatis.mapping.ParameterMapping;
import org.apache.ibatis.mapping.ParameterMode;
import org.apache.ibatis.mapping.SqlSource;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Intercepts;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Plugin;
import org.apache.ibatis.plugin.Signature;
import org.apache.ibatis.reflection.MetaObject;
import org.apache.ibatis.reflection.property.PropertyTokenizer;
import org.apache.ibatis.scripting.xmltags.ForEachSqlNode;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.type.TypeHandler;
import org.apache.ibatis.type.TypeHandlerRegistry;
import org.apache.log4j.Logger;
import org.begincode.core.paginator.domain.PageList;
import org.begincode.core.paginator.domain.Paginator;

@Intercepts({ @Signature(type = Executor.class, method = "query", args = {
		MappedStatement.class, Object.class, RowBounds.class,
		ResultHandler.class }) })
public class BeginCodeInterceptor implements Interceptor {
	private static Logger logger = Logger.getLogger(BeginCodeInterceptor.class);
	public static final ThreadLocal<Paginator> localPage = new ThreadLocal<Paginator>();

	@Override
	public Object intercept(Invocation invocation) throws Throwable {
		MappedStatement mappedStatement = (MappedStatement) invocation
				.getArgs()[0];
		Object parameter = invocation.getArgs()[1];
		// 判断查询方法，如果以Page结尾，说明是分页方法，返回分页数据，如果不是则继续执行原有方法
		Paginator pageInfo = localPage.get();
		if (pageInfo != null) {
			BoundSql boundSql = mappedStatement.getBoundSql(parameter);
			String originalSql = boundSql.getSql().trim();
			// 分页逻辑 开始
			StringBuffer sb = new StringBuffer();
			sb.append(originalSql);
			//校验是否有排序，有排序先插入排序
			if(pageInfo.getOrderStr() != null && !pageInfo.getOrderStr().equals("")){
				sb.append(" ").append(pageInfo.getOrderStr()).append(" ");
			}
			//校验是否有分页，如果有增加分页
			if(pageInfo.getLimit() != 0){
				sb.append(" limit ")
				.append(pageInfo.getPage() * pageInfo.getLimit())
				.append(",").append(pageInfo.getLimit());
			}
			BoundSql newBoundSql = copyFromBoundSql(mappedStatement, boundSql,
					sb.toString());
			MappedStatement newMs = copyFromMappedStatement(mappedStatement,
					new BoundSqlSqlSource(newBoundSql));
			invocation.getArgs()[0] = newMs;
			Object object = invocation.proceed();
			if(pageInfo.getLimit() == 0){
					//如果不分页直接返回
					localPage.set(null);
					return new PageList((List)object,pageInfo);
			}
			//判断是否是多from 类型语句，如果不是 则用 select count(0) 代替
			int totalCount = 0;
			StringBuilder countSql = new StringBuilder();
			if(originalSql.indexOf("from") == originalSql.lastIndexOf("from")){
				countSql.append(" select count(0)   ").append(originalSql.substring(originalSql.indexOf("from")));
			}else{
				countSql.append(" select count(0)   from (").append(originalSql).append(") a");
			}
			  Connection connection=mappedStatement.getConfiguration().getEnvironment().getDataSource().getConnection()  ;            
              PreparedStatement countStmt = connection.prepareStatement(countSql.toString());    
              BoundSql countBS = new BoundSql(mappedStatement.getConfiguration(),countSql.toString(),boundSql.getParameterMappings(),boundSql.getParameterObject());    
              setParameters(countStmt,mappedStatement,countBS,boundSql.getParameterObject());    
              ResultSet rs = countStmt.executeQuery();    
              if (rs.next()) {    
            	  totalCount = rs.getInt(1);    
              }    
              rs.close();    
              countStmt.close();    
              connection.close();  
              pageInfo.setTotalCount(totalCount);
			// 分页逻辑 结束
			localPage.set(null);
			return new PageList((List)object,pageInfo);
		} else {
			return invocation.proceed();
		}

	}

	@Override
	public Object plugin(Object target) {
		return Plugin.wrap(target, this);
	}

	@Override
	public void setProperties(Properties arg0) {
		// TODO Auto-generated method stub

	}
	/**  
     * 对SQL参数(?)设值,参考org.apache.ibatis.executor.parameter.DefaultParameterHandler  
     * @param ps  
     * @param mappedStatement  
     * @param boundSql  
     * @param parameterObject  
     * @throws SQLException  
     */    
    private void setParameters(PreparedStatement ps,MappedStatement mappedStatement,BoundSql boundSql,Object parameterObject) throws SQLException {    
        ErrorContext.instance().activity("setting parameters").object(mappedStatement.getParameterMap().getId());    
        List<ParameterMapping> parameterMappings = boundSql.getParameterMappings();    
        if (parameterMappings != null) {    
            Configuration configuration = mappedStatement.getConfiguration();    
            TypeHandlerRegistry typeHandlerRegistry = configuration.getTypeHandlerRegistry();    
            MetaObject metaObject = parameterObject == null ? null: configuration.newMetaObject(parameterObject);    
            for (int i = 0; i < parameterMappings.size(); i++) {    
                ParameterMapping parameterMapping = parameterMappings.get(i);    
                if (parameterMapping.getMode() != ParameterMode.OUT) {    
                    Object value;    
                    String propertyName = parameterMapping.getProperty();    
                    PropertyTokenizer prop = new PropertyTokenizer(propertyName);    
                    if (parameterObject == null) {    
                        value = null;    
                    } else if (typeHandlerRegistry.hasTypeHandler(parameterObject.getClass())) {    
                        value = parameterObject;    
                    } else if (boundSql.hasAdditionalParameter(propertyName)) {    
                        value = boundSql.getAdditionalParameter(propertyName);    
                    } else if (propertyName.startsWith(ForEachSqlNode.ITEM_PREFIX)&& boundSql.hasAdditionalParameter(prop.getName())) {    
                        value = boundSql.getAdditionalParameter(prop.getName());    
                        if (value != null) {    
                            value = configuration.newMetaObject(value).getValue(propertyName.substring(prop.getName().length()));    
                        }    
                    } else {    
                        value = metaObject == null ? null : metaObject.getValue(propertyName);    
                    }    
                    TypeHandler typeHandler = parameterMapping.getTypeHandler();    
                    if (typeHandler == null) {    
                        throw new ExecutorException("There was no TypeHandler found for parameter "+ propertyName + " of statement "+ mappedStatement.getId());    
                    }    
                    typeHandler.setParameter(ps, i + 1, value, parameterMapping.getJdbcType());    
                }    
            }    
        }    
    }  
	/**
	 * 复制MappedStatement对象
	 */
	private MappedStatement copyFromMappedStatement(MappedStatement ms,
			SqlSource newSqlSource) {
		Builder builder = new Builder(ms.getConfiguration(), ms.getId(),
				newSqlSource, ms.getSqlCommandType());

		builder.resource(ms.getResource());
		builder.fetchSize(ms.getFetchSize());
		builder.statementType(ms.getStatementType());
		builder.keyGenerator(ms.getKeyGenerator());

		builder.timeout(ms.getTimeout());
		builder.parameterMap(ms.getParameterMap());
		builder.resultMaps(ms.getResultMaps());
		builder.resultSetType(ms.getResultSetType());
		builder.cache(ms.getCache());
		builder.flushCacheRequired(ms.isFlushCacheRequired());
		builder.useCache(ms.isUseCache());
		builder.keyProperty(getKeyProperty(ms.getKeyProperties()));
		return builder.build();
	}

	public String getKeyProperty(String[] properties) {
		if (properties == null) {
			return "";
		}
		StringBuilder sb = new StringBuilder();
		int i = 0;
		for (String str : properties) {
			if (i == 0) {
				sb.append(str);
			} else {
				sb.append(",").append(str);
			}
			i++;
		}
		return sb.toString();
	}

	public class BoundSqlSqlSource implements SqlSource {
		BoundSql boundSql;

		public BoundSqlSqlSource(BoundSql boundSql) {
			this.boundSql = boundSql;
		}

		public BoundSql getBoundSql(Object parameterObject) {
			return boundSql;
		}
	}

	/**
	 * 复制BoundSql对象
	 */
	private BoundSql copyFromBoundSql(MappedStatement ms, BoundSql boundSql,
			String sql) {
		BoundSql newBoundSql = new BoundSql(ms.getConfiguration(), sql,
				boundSql.getParameterMappings(), boundSql.getParameterObject());
		for (ParameterMapping mapping : boundSql.getParameterMappings()) {
			String prop = mapping.getProperty();
			if (boundSql.hasAdditionalParameter(prop)) {
				newBoundSql.setAdditionalParameter(prop,
						boundSql.getAdditionalParameter(prop));
			}
		}
		return newBoundSql;
	}

}

