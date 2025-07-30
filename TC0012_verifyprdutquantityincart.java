package testcases1;

import org.testng.annotations.Test;

import pageobjectclasses.Verifyallproducts;
import pageobjectclasses.Verifyproductquantity;

public class TC0012_verifyprdutquantityincart extends Baseclass1 {
	@Test
	public void quantitychecking() {
		
		//Verifyproductquantity quantity = new Verifyaproductquantity(driver);
		
		Verifyproductquantity qty = new Verifyproductquantity(driver);
		qty.Verifyproductquantity();
		qty.verifyprdtdetailopen();
		qty.increaseqty();
		qty.clickaddbtn();
		qty.clickviewcartbtn();
		qty.verifyprodtdisplay();
		
	}

}
