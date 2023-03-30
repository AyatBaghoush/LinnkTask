package Steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

		static WebDriver driver = null;

		@Before
		public void browserSetup()
		{
			String projPath = System.getProperty("user.dir");
		    System.setProperty("webdriver.chrome.driver", projPath+ "/src/test/java/Driver/chromedriver.exe");
		    driver = new ChromeDriver();
		    driver.manage().window().maximize();
		}
		
		@After
		public void tearDown()
		{
			driver.close();
			driver.quit();
		}
		

		public static WebDriver getDriver() {
			return driver;
		}
}
