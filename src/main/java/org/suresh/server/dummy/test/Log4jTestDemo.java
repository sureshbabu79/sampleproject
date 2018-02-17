package org.suresh.server.dummy.test;

import org.apache.log4j.Logger;

public class Log4jTestDemo {

	public static void main(String[] args) {
		
		System.out.println("Hello World!");
		
		//direct log4j implementation
		Logger logger = Logger.getLogger(Log4jTestDemo.class);
		logger.trace("trace message");
		logger.debug("debug message");
		logger.info("info message");
		logger.warn("warning message");
		logger.error("error message");
		logger.fatal("fatal message");
		
	}
}
