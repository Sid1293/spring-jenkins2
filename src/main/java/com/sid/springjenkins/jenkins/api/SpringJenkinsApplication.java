package com.sid.springjenkins.jenkins.api;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJenkinsApplication {
	
	
	public static Logger Logger=LoggerFactory.getLogger(SpringJenkinsApplication.class);
	
     @PostConstruct
	public void init() {
		Logger.info("application started.......");
	}
	
	
	
	public static void main(String[] args) {
		
		Logger.info("application excuted.......");
		SpringApplication.run(SpringJenkinsApplication.class, args);
	}

}
