package testcases1;

import org.testng.annotations.Test;

import pageobjectclasses.Registeruserwithexistingemail;

public class TC0005_registeruserwithmail extends Baseclass1 {
	@Test
	
	public void existingaddress() {
		Registeruserwithexistingemail register = new Registeruserwithexistingemail(driver);
		register.signupclick();
		register.verifysignup();
		register.entername("Rachel");
		register.entermail("rachel2023@gmail.com");
		register.clicksignupbtn();
		register.verifyerrormsg();
		 
	}
	
	

}
