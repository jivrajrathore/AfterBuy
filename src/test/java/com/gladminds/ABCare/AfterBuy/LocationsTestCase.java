package com.gladminds.ABCare.AfterBuy;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.gladminds.ABCare.AfterBuy.GenericLib.GenericFunctions;
import com.gladminds.ABCare.AfterBuy.MyCompanyDetails.POM.LocationsPage;

public class LocationsTestCase extends GenericFunctions{
	
	@Test
	 public void locations_page() throws InterruptedException{
		LocationsPage obj = PageFactory.initElements(driver, LocationsPage.class); 
		
		System.out.println("submit branch is verifying...");
		obj.check_Add_Branch();
		String actual = driver.findElement(By.xpath(".//*[@id='CorporateLocationTypeInfoform']/div[1]/label")).getText();
		String expected = "Corporate Location Type *";
		Assert.assertEquals(actual, expected);
		System.out.println("submit branch is verified...");
		Thread.sleep(10);
		System.out.println("submit building is verifying...");
		obj.check_add_building();
		System.out.println("submit building is verified....");
		Thread.sleep(10);
		System.out.println("submit block is verifying...");
		obj.check_add_block();
		System.out.println("submit block is verified...");
		Thread.sleep(10);
		System.out.println("submit floor is verifying...");
		obj.check_add_floor();
		System.out.println("submit floor is verified...");
		Thread.sleep(10);
		System.out.println("submit room is verifying...");
		obj.check_add_room();
		System.out.println("submit room is verified...");
		Thread.sleep(10);
		System.out.println("submit pillar is verifying...");
		obj.check_add_piller();
		System.out.println("submit pillar is verifyied...");
}
	    
}
