package testcases1;

import org.testng.annotations.Test;

import pageobjectclasses.Verifysubscription;

public class TC0009_Subscription extends Baseclass1 {
	@Test
	public void testcasenine() {
		Verifysubscription vs = new Verifysubscription(driver);
		vs.scrolltofooter();
		vs.verifysubscriptiontext();
		vs.enteremailandsubscribe();
		vs.verifysuccesmsg();
	}

}
