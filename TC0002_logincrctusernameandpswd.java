package testcases1;

import org.testng.annotations.Test;

import pageobjectclasses.Homepageclass;
import pageobjectclasses.Loginuserwithcrctemailandpswd;

public class TC0002_logincrctusernameandpswd extends Baseclass1{
	@Test
	public void loginuser() {
		Loginuserwithcrctemailandpswd lcp = new Loginuserwithcrctemailandpswd(driver);
		lcp.goclick();
		lcp.enteremail("rachel123@gmail.com");
		lcp.enterpswd("Automation@123");
		lcp.enterlogbtn();
		lcp.checkusername();
		lcp.clicktiondelte();
		lcp.verifydeleteisvisible();

		
	}
	
	
}
