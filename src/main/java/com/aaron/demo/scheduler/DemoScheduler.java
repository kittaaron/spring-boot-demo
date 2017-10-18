package com.aaron.demo.scheduler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by kittaaron on 2017/10/18.
 * DemoScheduler
 */
@Component
public class DemoScheduler {

    private static final Logger logger = LoggerFactory.getLogger(DemoScheduler.class);

    @Scheduled(cron="0 0/2 * * * ?")
    public void executeFileDownLoadTask() {
        // 间隔2分钟,执行任务
        Thread current = Thread.currentThread();
        System.out.println("scheduler1: "+current.getId());
        logger.info("DemoScheduler1: "+current.getId()+ ", name:"+current.getName());
    }
}
