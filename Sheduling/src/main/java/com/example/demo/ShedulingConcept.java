package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@Configuration
@EnableScheduling
@ConditionalOnProperty(name = "scheduling.enabled", matchIfMissing = true)
public class ShedulingConcept {

	private static final Logger logger = LoggerFactory.getLogger(ShedulingConcept.class);

//	@Scheduled(fixedDelay = 3000)
//	 @Scheduled(fixedRate = 3000)
//	 @Scheduled(fixedDelayString="PT2S")
	@Scheduled(cron = "0 0 * * * *")
	public void ShedulingMethod() {
		logger.info("Now Method executed at every 3 seconds Current time is :" + new java.util.Date());
//		Thread.sleep(1000L);

	}
}
