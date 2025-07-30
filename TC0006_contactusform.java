package testcases1;

import org.testng.annotations.Test;

import pageobjectclasses.Contactusdetails;

public class TC0006_contactusform extends Baseclass1 {
	
 @Test
public void contactingform() {
	 Contactusdetails cf = new Contactusdetails(driver);
	 cf.gotocontact();
	 cf.checkgetintouch();
	 cf.entername();
	 cf.entermail();
	 cf.entersubject();
	 cf.othermsg();
	 cf.uploadFile();
	 cf.submitbtn();
	 cf.alertaccept();
	 
 }
}
