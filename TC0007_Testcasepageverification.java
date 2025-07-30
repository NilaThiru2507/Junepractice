package testcases1;

import org.testng.annotations.Test;

import pageobjectclasses.Testcasespage;

public class TC0007_Testcasepageverification extends Baseclass1 {
	
	@Test
	public void testcaseseven() {
		Testcasespage tp = new Testcasespage(driver);
		tp.clicktestcase();
		tp.verifytestcase();
		
	}
	

}
