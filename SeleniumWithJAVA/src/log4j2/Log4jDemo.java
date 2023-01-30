package log4j2;

import org.apache.logging.log4j.*;


public class Log4jDemo {

	public static void main(String[] args) {
		Logger logger = LogManager.getLogger(Log4jDemo.class.getName());
	
		logger.info("you are in Main method");

	}

}
