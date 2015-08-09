package org.begincode.task.queue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ViewCountOnTimeUpdate {
	@Autowired
	CountOperator countOperator;
	 @Scheduled(cron="0 0/10 * * * ? ") //间隔10分钟刷新浏览次数执行  
	  public void updateViewCountOnTime(){  
		 countOperator.changeBatViewCount();  
	  }  
}
