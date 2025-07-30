package testcases1;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Baseclass1 {
	public WebDriver driver;
	
	@BeforeClass
	 public void setup() {
		 driver = new ChromeDriver();
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("http://automationexercise.com/");
		 driver.manage().window().maximize();
	 
	
	}
	 @AfterClass
	 public void teardown() {
		 driver.quit();

}
	 public String randomestring() {
		 String generatedstring = RandomStringUtils.randomAlphabetic(5);
		 return generatedstring;
	 }
	 public String randomenumber() {
		 String generatednumber = RandomStringUtils.randomNumeric(3);
		 return generatednumber;
	 }
	 public String Alphanumeric() {
		 String generatedstring = RandomStringUtils.randomAlphabetic(5);
		 String generatednumber = RandomStringUtils.randomNumeric(3);
		 return (generatedstring+"@"+generatednumber);
	 }
}
