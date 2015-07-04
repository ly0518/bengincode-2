generater 工程使用方法：
1、External Tools Configurations --> Program --> new 
2、起名，如：Generator
3、指定Location路径为maven的批处理文件，如：D:\work\apache-maven-3.2.3\bin\mvn.bat
4、指定Working Diretory为"${workspace_loc:/begincode-generator}"
5、设置Arguments为"mybatis-generator:generate"
6、Apply --> Run

generatorConfig.xml
1、classPathEntry location属性指定为本地jdbc驱动jar包的绝对路径，如："F:\mvnres\mysql\mysql-connector-java\5.1.34\mysql-connector-java-5.1.34.jar"
2、javaModelGenerator、sqlMapGenerator、javaClientGenerator三个节点的targetProject，
可以配置成目标工程的绝对路径，如：F:/work/begincode/begincode-2/begincode/begincode-core/src/main/java。
这样代码即可在该路径下生成，使用时候要注意不要将原有代码覆盖。
【注意】：一定要检查targetPackage和table节点的tableName属性的是否正确修改。