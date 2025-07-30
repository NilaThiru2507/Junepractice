package testcases1;

import org.testng.annotations.Test;

import pageobjectclasses.Verifyallproducts;

public class TC0008_verifyallproductdetailspage extends Baseclass1 {
	@Test
	public void testcaseeight() {
		Verifyallproducts vp = new Verifyallproducts(driver);
		vp.productbtn();
		vp.scrollToProductList();
		vp.navigationverify();
		vp.productsarevisible();
		vp.prodctvisible();
		vp.checkuserisonlanding();
		vp.checkingallproductlists();
		
		
	}

}
