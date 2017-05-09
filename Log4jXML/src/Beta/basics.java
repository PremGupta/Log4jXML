package Beta;
import org.apache.log4j.LogManager;
import static org.hamcrest.Matchers.equalTo;

import org.apache.log4j.Logger;
import org.apache.logging.log4j.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.python.antlr.PythonParser.and_expr_return;

import cucumber.api.java.en.Given;

public class basics {

	private static Logger logger=LogManager.getLogger(basics.class.getName());
	public static void main(String[] args) {

	//Logger logger=Logger.getLogger("basics");
	
	        logger.info("This is info");
		    logger.debug("This is debug");
			logger.warn("This is warning");
			logger.error("this is error");
			logger.fatal("this is fatal");
		
	}
}
