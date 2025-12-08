package com.Scheduler.Scheduler.scheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class SchedulerClass {
    @Scheduled(fixedDelay = 5000)
    public void printHello(){
        System.out.println("Hello");
    }
}
