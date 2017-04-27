package com.github.luismoramedina;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class FlumeKafkaLoggingApplication {

	static final Logger logger = LogManager.getLogger(FlumeKafkaLoggingApplication.class.getName());

	public static void main(String[] args) {
		logger.info("Hello kafka");
	}

}
