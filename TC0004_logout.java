package testcases1;

import org.testng.annotations.Test;

import pageobjectclasses.Logoutuser;

public class TC0004_logout extends Baseclass1 {
	@Test
	public void logoutverification() {
		Logoutuser lcp3 = new Logoutuser(driver);
		lcp3.goclickthesugnup();
		lcp3.giveemail("rachel2023@gmail.com");
		lcp3.givepswd("Automation@2023"); 
		lcp3.submitlogin();
		lcp3.verifyloggedin();
		lcp3.gotologout();
		lcp3.loginheaderverification();
	}

}
