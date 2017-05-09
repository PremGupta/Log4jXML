package Alpha;
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

	//Logger logger=Logger.getLogger("basics"); -not use here when using xml
		
	/*	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prem\\Downloads\\Study\\Selenium Files\\Zip Files\\chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");*/
		    logger.info("Google page opened");
		    logger.debug("This is Google page debug");
			logger.warn("This is Google page warning");
			logger.error("this is Google page error");
			logger.fatal("this is Google page fatal");
		
	}
}
