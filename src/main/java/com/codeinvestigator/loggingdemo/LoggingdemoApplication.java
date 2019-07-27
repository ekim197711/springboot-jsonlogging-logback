package com.codeinvestigator.loggingdemo;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
@Slf4j
public class LoggingdemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(LoggingdemoApplication.class, args);
    }

    @EventListener
    private void onApplicationStarted(ApplicationStartedEvent applicationStartedEvent) {
        log.info("Application has started...");
    }
}
