package testcases1;

import org.testng.annotations.Test;

import pageobjectclasses.Addproductsincart;

public class TC0011_Addproductsincart extends Baseclass1 {
	@Test
	public void testcaseeleven() {
		Addproductsincart pl = new Addproductsincart(driver);
		pl.productspage();
		pl.scrolldown(500);
		//pl.scrollToElement(houverfirstproduct);
		pl.hoverelemntfirstproduct();
		pl.continuebtn();
		pl.hoverelementsecondproduct();
		pl.scrollupandclickviewcart();
		pl.getproductnames();
		pl.calculateTotalPrice();
		
		
	}
	

}
