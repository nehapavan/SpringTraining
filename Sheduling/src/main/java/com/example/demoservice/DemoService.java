package com.example.demoservice;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.example.demo.ShedulingConcept;
import com.example.demoentity.DemoEntity;
import com.example.demorepository.DemoRepo;

@Service
@Configuration
@EnableScheduling
public class DemoService {

	private static final Logger logger = LoggerFactory.getLogger(ShedulingConcept.class);
	@Autowired
	DemoRepo demorepo;

	@Scheduled(fixedDelay = 3000)
	public void AddUser() {
		DemoEntity userobj = new DemoEntity();
		logger.info("Now userdetails created at every 3 seconds Current time is :" + new java.util.Date().toString());
		userobj.setName("user" + new Random().nextInt(50));
		demorepo.findAll();
	}

	@Scheduled(fixedDelay = 3000)
	public void fetchUser() {
		List<DemoEntity> listuser = new ArrayList<>();
		logger.info(
				"Now userdetails are fetched at every 3 seconds Current time is :" + new java.util.Date().toString());
		logger.info("no.of of user records" + listuser.size());
	}
}
