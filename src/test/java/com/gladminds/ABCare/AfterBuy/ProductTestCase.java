
 package com.gladminds.ABCare.AfterBuy;

import org.openqa.selenium.support.PageFactory;

import com.gladminds.ABCare.AfterBuy.GenericLib.GenericFunctions;
import com.gladminds.ABCare.AfterBuy.MyCompanyDetails.POM.ProductPage;

public class ProductTestCase extends GenericFunctions{

	public void verify_Product() throws InterruptedException {
		ProductPage obj = PageFactory.initElements(driver, ProductPage.class);
		obj.check_Add_Product();
	}
}
