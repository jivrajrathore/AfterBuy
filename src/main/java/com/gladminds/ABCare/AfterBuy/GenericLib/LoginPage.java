package com.gladminds.ABCare.AfterBuy.GenericLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.gladminds.ABCare.AfterBuy.GenericLib.ReadProperties;

public class LoginPage {
   
	 @FindBy(xpath=".//*[@id='identity']")
	 WebElement email;
	 @FindBy(xpath=".//*[@id='password']")
	 WebElement password;
	 @FindBy(xpath="html/body/div[1]/div/div/div[2]/div/div[2]/div/div/form/p[5]/input")
	 WebElement login;
	 
	 public void check_Login()
{
		 ReadProperties obj = ReadProperties.getInstence();
		email.sendKeys(obj.getStringValue("userName"));
		password.sendKeys(obj.getStringValue("passWord"));
		login.click();
}
}
