package org.suresh.server.dummy.test;

import org.apache.log4j.Logger;

public class TestLog4jDemo {

	public static void main(String[] args) {
		System.out.println("Hello World!");
		
		Logger logger = Logger.getLogger(TestLog4jDemo.class);
		logger.trace("trace message");
		logger.debug("debug message");
		logger.info("info message");
		logger.warn("warning message");
		logger.error("error message");
		logger.fatal("fatal message");
	}
}
