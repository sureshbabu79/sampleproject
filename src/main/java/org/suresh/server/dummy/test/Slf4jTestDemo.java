package org.suresh.server.dummy.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Slf4jTestDemo {

	final static Logger logger = LoggerFactory.getLogger(Slf4jTestDemo.class);
	
	public static void main(String[] args) {
		
		System.out.println("Hello World!!!!");
		
		//slf4j implementation
		logger.debug("debug message");
		logger.trace("trace message");
		logger.debug("debug message");
		logger.info("info message");
		logger.warn("warning message");
		logger.error("error message");
		
		//TODO:Suresh
		//need to check why fatal is not working when used slf4j
		//logger.fatal("fatal message");
	}
}
