package com.viveknaskar.springloggingwithlog4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringLog4jApplication {

	private static final Logger LOGGER = LogManager.getLogger(SpringLog4jApplication.class);

	public static void main(String[] args) {

		try {
			SpringApplication.run(SpringLog4jApplication.class, args);
			LOGGER.info("RESTFul Application Started");
		}
		catch(Exception e) {
			LOGGER.error("RESTFul Application Failed to Start.");
		}
	}

}
