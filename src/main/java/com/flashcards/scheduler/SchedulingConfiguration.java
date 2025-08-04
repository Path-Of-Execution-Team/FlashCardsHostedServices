package com.flashcards.scheduler;

import java.util.concurrent.TimeUnit;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@Configuration
@EnableAsync
@EnableScheduling
public class SchedulingConfiguration {

    @Scheduled(fixedRate = 3, timeUnit = TimeUnit.SECONDS)
    public void helloWorld() {
        System.out.println("Siemano!");
    }
}
