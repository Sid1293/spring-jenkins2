package com.sid.springjenkins.jenkins.api;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class SpringJenkinsApplicationTests {

	public static Logger Logger=LoggerFactory.getLogger(SpringJenkinsApplicationTests.class);
	
	
	@Test
	void contextLoads() {
		Logger.info("Test case exuting......... ");
		Logger.info("Test case exuting secound log nstatement......... ");
		Logger.info("Test case exuting third  log nstatement......... ");
		assertEquals(true, true);
	}
	

}
