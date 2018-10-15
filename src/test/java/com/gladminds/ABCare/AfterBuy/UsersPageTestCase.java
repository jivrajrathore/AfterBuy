package com.gladminds.ABCare.AfterBuy;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.gladminds.ABCare.AfterBuy.GenericLib.GenericFunctions;
import com.gladminds.ABCare.AfterBuy.MyCompanyDetails.POM.UsersPage;

public class UsersPageTestCase extends GenericFunctions{

	 @Test
	 public void verify_users() throws InterruptedException {
		 UsersPage obj = PageFactory.initElements(driver, UsersPage.class);
		 
		System.out.println("submit user is verifying...");
		 obj.check_add_users();
		String Actual = "pavan ingalkar"; 
		String expected = driver.findElement(By.xpath("(.//a[@class='clickableRow'])[1]")).getText();
		Assert.assertEquals(Actual, expected);
		System.out.println("submit user is verified...");
		
		Thread.sleep(10);
	    System.out.println("upload users is veryfing...");
	    obj.check_upload_user_button();
	    System.out.println("upload user is veryfied...");
	   
	    Thread.sleep(25);
	    System.out.println("activate/deactivate button is verifying...");
	    obj.check_acti_deactivate_btn();
	    System.out.println("activate/deactivate button is verified...");
	 }
}
