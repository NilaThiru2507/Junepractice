package testcases1;

import org.testng.annotations.Test;

import pageobjectclasses.Accountinformation;
import pageobjectclasses.Homepageclass;
import pageobjectclasses.Logginedin;
import pageobjectclasses.Signuppageclass;

public class TC0001_accountinfo extends Baseclass1 {
	@Test
public void verifytheaccountdetails() {
	Homepageclass hpc = new Homepageclass(driver);
	hpc.clicksignuplogin();
	//hpc.verifyhomepagevisible();
	Signuppageclass spc = new Signuppageclass(driver);
	spc.setfirstname("Phoebe");
	
	spc.setemailaddress("phoebe123@gmail.com");
	spc.clickingthebutton();
	Accountinformation ac = new Accountinformation(driver);
	ac.selectmrs();
	ac.setpassword("Account@123");
	ac.selectdayofbirth("16","July","2000");
	ac.clcickingnewsletter();
	ac.clickingspecialoffers();
	ac.setfirstname("Phoebe");
	ac.setlastname("buffay");
	ac.address("16 Siru Saluvar street,Orathanadu");
	ac.entercompnyname("Automaticinfotech");
	ac.dropdowncountry("India");
	ac. enterstate("Tamilnadu");
	ac.entercity("Thanjavur");
	ac.zipcode("61300");
	ac.entermobilenumber("7339354321");
	ac.clickingbutton();
	ac.verifyaccountiscreatedornot();
	ac.butnclick();
	Logginedin ln = new Logginedin(driver);
	ln.checklogin();
	ln.deletbtn();
	ln.checkingdeleteaccount();
	ln.pressbtn();
}
}
