package testcases1;

import org.testng.annotations.Test;

import pageobjectclasses.Loginincorrectemailandpswd;
import pageobjectclasses.Loginuserwithcrctemailandpswd;

public class TC0003_loginincrctusernameandpswd extends Baseclass1 {
	@Test
	public void Incorrectaddress() {
		Loginincorrectemailandpswd lcp2 = new Loginincorrectemailandpswd(driver);
		lcp2. goclick1();
		lcp2.verifytheloginmsg();
		lcp2.emailgiving("rachel123@gamil.com");
		lcp2.pswdgiving("Automated@123");
		lcp2.pushloginbtn();
		lcp2.checkingthemsg();
	}

}
