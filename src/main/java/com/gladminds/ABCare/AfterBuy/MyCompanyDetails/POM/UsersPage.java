package com.gladminds.ABCare.AfterBuy.MyCompanyDetails.POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.gladminds.ABCare.AfterBuy.GenericLib.GenericFunctions;

public class UsersPage {
		
	@FindBy(xpath = ".//*[@id='side']/li[3]/a")
	WebElement my_company_details;
	   @FindBy(xpath=".//*[@id='page-wrapper']/div/div[2]/div[2]/div/a/div/i")
	   WebElement users;
	   @FindBy(xpath=".//*[@id='page-wrapper']/div/div[2]/div/div/div[1]/a/div")
	   WebElement Add_user;
	   @FindBy(xpath=".//*[@id='corporateUserform']/div[1]/input")
	   WebElement first_name;
	   @FindBy(xpath=".//*[@id='corporateUserform']/div[2]/input")
	   WebElement last_name;
	   @FindBy(xpath=".//*[@id='corporateUserform']/div[3]/input")
	   WebElement employee_code;
	   @FindBy(xpath=".//*[@id='corporateUserform']/div[4]/select")
	   WebElement user_type;
	   @FindBy(xpath=".//*[@id='corporateUserform']/div[5]/input")
	   WebElement email;
	   @FindBy(xpath=".//*[@id='corporateUserform']/div[6]/input")
	   WebElement mobile_number;
	   @FindBy(xpath=".//*[@id='corporateUserform']/div[7]/input")
	   WebElement designation;
	   @FindBy(xpath=".//*[@id='corporateUserform']/div[8]/select")
	   WebElement location;
	   @FindBy(xpath=".//*[@id='corporateUserform']/div[9]/input")
	   WebElement office_number;
	   @FindBy(xpath=".//*[@id='corporateUserform']/div[10]/input")
	   WebElement reporting_manager;
	   @FindBy(xpath=".//*[@id='corporateUserform']/div[11]/select")
	   WebElement second_line_off;
	  @FindBy(xpath=".//*[@id='corporateUserform']/div[12]/input")
	  WebElement department;
	  @FindBy(xpath=".//*[@id='corporateUserform']/div[13]/input")
	  WebElement project;
	  @FindBy(xpath=".//*[@id='corporateUserform']/div[14]/input")
	  WebElement team;
	  @FindBy(xpath=".//*[@id='corporateUserform']/div[15]/input")
	  WebElement image;
	  @FindBy(xpath=".//*[@id='corporateUserform']/div[16]/label/input")
	  WebElement is_active;
	  @FindBy(xpath=".//*[@id='corporateUserform']/button")
	  WebElement submit_user;
	  @FindBy(xpath=".//*[@id='page-wrapper']/div/div[1]/div/div/ol/li[2]/a")
	  WebElement UsersTab;  
	  @FindBy(xpath=".//*[@id='corporateUserform']/a/button")
	  WebElement cancel_user;
	  
	  @FindBy(xpath=".//*[@id='page-wrapper']/div/div[2]/div/div/div[1]/div[3]")
	  WebElement upload_user_button;
	  @FindBy(xpath=".//*[@id='userUploadfile']")
	  WebElement browse_button;
	  @FindBy(xpath=".//*[@id='uploadUserBtn']")
	  WebElement upload_user;
	  @FindBy(xpath=".//*[@id='uploadUserForm']/div[3]/button[1]")
	  WebElement close;
	  
	  @FindBy(xpath="(.//input[@class='user-id'])[1]")
	  WebElement check_box;
	  @FindBy(xpath=".//*[@id='deactivateCorporateuser']")
	  WebElement activate_deactivate_button;
	   
	   public void check_add_users() {
		   GenericFunctions.implicitlyWait(20);
		   my_company_details.click();
		   users.click();
		   Add_user.click();
		   first_name.sendKeys("pavan");
		   last_name.sendKeys("ingalkar");
		   employee_code.sendKeys("2345068");
		   GenericFunctions.selectValue(user_type, "Corporate User");
		   email.sendKeys("pavan@gmail.com");
		   mobile_number.sendKeys("7737691424");
		   designation.sendKeys("Sr dev");
		   GenericFunctions.selectValue(location, "ghotteri(3020)");
		   office_number.sendKeys("7737691323");
		   reporting_manager.sendKeys("Asish");
		   GenericFunctions.selectValue(second_line_off, "suraj shekhawat");
		   department.sendKeys("IT");
		   project.sendKeys("HRMS");
		   team.sendKeys("alpha");
		   image.sendKeys("C:\\Users\\DELL\\Desktop\\ABcare data\\user_image.jpg");
		   is_active.click();
		   submit_user.click();
		   UsersTab.click();
		     
	   }
	   
	    public void check_upload_user_button() {
	    	 GenericFunctions.implicitlyWait(20);
	    	 my_company_details.click();
			 users.click();
	    	 upload_user_button.click();
	    	 browse_button.sendKeys("C:\\Users\\DELL\\Desktop\\ABcare data\\corporate_user_upload_template.csv");
	         GenericFunctions.elementTOBeVisible(20,upload_user);
	    	 upload_user.click();
	         close.click();
	    }
	     
	    public void check_acti_deactivate_btn() {
	    	 GenericFunctions.implicitlyWait(20);
	    	 GenericFunctions.move_on_element(check_box);
			   activate_deactivate_button.click();
	    }
}
