package com.gladminds.ABCare.AfterBuy.MyCompanyDetails.POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.gladminds.ABCare.AfterBuy.GenericLib.GenericFunctions;

public class ProductPage {
  
	 @FindBy(xpath=".//*[@id='side']/li[3]/a")
	 WebElement My_Company_Detail;
	 @FindBy(xpath="html/body/div[5]/div/div/div[2]/div[3]/div/a/div/i")
	 WebElement Products;
	 @FindBy(xpath="html/body/div[4]/div/div/div[2]/div/div/div[1]/a/div")
	 WebElement add_Products;
	 @FindBy(xpath="html/body/div[4]/div/div/div[2]/div[6]/div/div/div[1]/div[1]/div/select")
	 WebElement Product_Group;
	 @FindBy(xpath="html/body/div[4]/div/div/div[2]/div[6]/div/div/div[2]/div[1]/div/select")
	 WebElement Product;
	 @FindBy(xpath="html/body/div[4]/div/div/div[2]/div[6]/div/div/button")
	 WebElement submit_1;
	 @FindBy(xpath="html/body/div[4]/div/div/div[2]/div[6]/div/div/a/button")
	 WebElement cancel_1;
	 
	 @FindBy(xpath="html/body/div[4]/div/div/div[2]/div[7]/div/div/div/form/div/div/div/div[1]/ul/li[1]/a")
	 WebElement General;
	 @FindBy(xpath="html/body/div[4]/div/div/div[2]/div[7]/div/div/div/form/div/div/div/div[2]/div/div[1]/div/div/select[1]")
	 WebElement Brand;
	 @FindBy(xpath="html/body/div[4]/div/div/div[2]/div[7]/div/div/div/form/div/div/div/div[2]/div/div[1]/div/div/input[4]")
	 WebElement model_Number;
	 @FindBy(xpath=".//*[@id='model_name']")
	 WebElement model_Name;
	 @FindBy(xpath=".//*[@id='serial_number']")
	 WebElement serial_Number;
	 @FindBy(xpath=".//*[@id='admin']")
	 WebElement Admin;
	 @FindBy(xpath=".//*[@id='manager']")
	 WebElement Manager;
	 @FindBy(xpath=".//*[@id='asset_type']")
	 WebElement User;
	 @FindBy(xpath=".//*[@id='asset_status']")
	 WebElement Product_Status;
	 @FindBy(xpath=".//*[@id='asset_location_id']")
	 WebElement Product_Location;
	 @FindBy(xpath=".//*[@id='asset_id']")
	 WebElement asset_ID;
	 @FindBy(xpath=".//*[@id='erp_id']")
	 WebElement erp_ID;
	 @FindBy(xpath=".//*[@id='tag_type']")
	 WebElement tag_Type;
	 @FindBy(xpath=".//*[@id='asset_location_id']")
	 WebElement qr_Group;
	 @FindBy(xpath=".//*[@id='product_image_1']")
	 WebElement product_Image_1;
	 @FindBy(xpath=".//*[@id='product_image_2']")
	 WebElement product_Image_2;
	 @FindBy(xpath=".//*[@id='asset_type']")
	 WebElement product_Type;
	 
	 @FindBy(xpath=".//*[@id='audit_parameter_container']/div/div/div[1]/ul/li[2]/a")
	 WebElement pdt_Specific;
	 @FindBy(xpath=".//*[@id='product_subcategory']")
	 WebElement sub_Asset;
	 @FindBy(xpath=".//*[@id='wireless_type']")
	 WebElement wireless_Type;
	 @FindBy(xpath=".//*[@id='number_of_ports']")
	 WebElement Number_Of_Ports;
	 @FindBy(xpath=".//*[@id='data_transfer_rate']")
	 WebElement data_Transfer_Rate;
	 
	 @FindBy(xpath=".//*[@id='audit_parameter_container']/div/div/div[1]/ul/li[3]/a")
	 WebElement ownership;
	 @FindBy(xpath=".//*[@id='asset_location_id']")
	 WebElement owner_Type;
	 @FindBy(xpath=".//*[@id='seller_name']")
	 WebElement seller_Name;
	 @FindBy(xpath=".//*[@id='invoice_no']")
	 WebElement invoice_No;
	 @FindBy(xpath=".//*[@id='invoice_date']")
	 WebElement invoice_Date;
	 @FindBy(xpath=".//*[@id='invoice_value']")
	 WebElement invoice_Value;
	 @FindBy(xpath=".//select[@name='tab3[32]']")
	 WebElement disposal_Method;
	 @FindBy(xpath=".//*[@id='date']")
	 WebElement Date;
	 @FindBy(xpath=".//*[@id='selling_price']")
	 WebElement selling_Price;
	 
	 @FindBy(xpath=".//*[@id='audit_parameter_container']/div/div/div[1]/ul/li[4]/a")
	 WebElement Documents;
	 @FindBy(xpath=".//*[@id='invoice_no']")
	 WebElement invoice_No_1;
	 @FindBy(xpath=".//*[@id='user_manual_document']")
	 WebElement user_Mannual_Document;
	 @FindBy(xpath=".//*[@id='warranty_card']")
	 WebElement warranty_Card;
	 @FindBy(xpath=".//*[@id='warranty_card_expiry']")
	 WebElement warrenty_Care_Expiry;
	 @FindBy(xpath=".//*[@id='amc_contract']")
	 WebElement amc_Contract;
	 @FindBy(xpath=".//*[@id='amc_contract_expiry']")
	 WebElement amc_Contract_Expiry;
	 
	 @FindBy(xpath=".//*[@id='audit_parameter_container']/div/div/div[1]/ul/li[5]/a")
	 WebElement support;
	 @FindBy(xpath="(.//*[@id='contract_type_id'])[1]")
	 WebElement service_Provider;
	 @FindBy(xpath="(.//*[@id='contract_type_id'])[2]")
	 WebElement contract_Type;
	 @FindBy(xpath=".//*[@id='sla']")
	 WebElement sla;
	 @FindBy(xpath=".//*[@id='support_end_date']")
	 WebElement support_End_Date;
	 @FindBy(xpath=".//*[@id='last_service']")
	 WebElement last_Service;
	 @FindBy(xpath=".//*[@id='total_service_amount']")
	 WebElement total_Service_Amount;
	 @FindBy(xpath=".//*[@id='total_parts_consumed']")
	 WebElement total_Parts_Consumed;
	 @FindBy(xpath=".//*[@id='support_start_date']")
	 WebElement support_Start_Date;
	 @FindBy(xpath=".//*[@id='insurance_start_date']")
	 WebElement insurence_Start_Date;
	 @FindBy(xpath=".//*[@id='insurance_end_date']")
	 WebElement insurence_End_Date;
	 @FindBy(xpath=".//*[@id='corporateAssetChecklistform']/input")
	 WebElement submit_2;
	 @FindBy(xpath=".//*[@id='corporateAssetChecklistform']/a/button")
	 WebElement cancel_2;
	 
	 @FindBy(xpath="(.//input[@class='product-id'])[1]")
	 WebElement product_Checkbox;
	 @FindBy(xpath=".//*[@id='deactivateCorporateproduct']")
	 WebElement activate_Deactivate;
	 
	 @FindBy(xpath=".//*[@id='page-wrapper']/div/div[2]/div/div/div[1]/div[3]")
	 WebElement upload_Product;
	 @FindBy(xpath=".//*[@id='assetUploadfile']")
	 WebElement browse;
	 @FindBy(xpath=".//*[@id='uploadAssetbtn']")
	 WebElement submit_3;
	 
		 public void check_Add_Product() throws InterruptedException
		 {
			  GenericFunctions.implicitlyWait(20);
			My_Company_Detail.click();
			Products.click();
			add_Products.click();
			GenericFunctions.selectValue(Product_Group, "IT");
			GenericFunctions.selectValue(Product, "Router");
			submit_1.click();
			
			General.click();
			GenericFunctions.selectValue(Brand, "Beetel");
			model_Number.sendKeys("9432091");
			model_Name.sendKeys("pan_013");
			serial_Number.sendKeys("9432081");
			Admin.sendKeys("virendra sharma");
			Manager.sendKeys("virendra dubey");
			GenericFunctions.selectValue(User, "suraj shekhawat (463835)");
		GenericFunctions.selectValue(Product_Status, "ACTIVE");
		GenericFunctions.selectValue(Product_Location, "ghotteri (3020)");
		asset_ID.sendKeys("asset_01");
		erp_ID.sendKeys("erp_01");
		tag_Type.sendKeys("QR_code_011");
		GenericFunctions.selectValue(qr_Group, "QR_Group");
		product_Image_1.sendKeys("C:\\Users\\DELL\\Desktop\\ABcare data\\product image 1.jpg");
		GenericFunctions.selectValue(product_Type, "PRODUCT");
		
		pdt_Specific.click();
		GenericFunctions.selectValue(sub_Asset, "iphone 6 ( A-123 )");
		wireless_Type.sendKeys("wire_123");
		Number_Of_Ports.sendKeys("5");
		data_Transfer_Rate.sendKeys("10");
		
		ownership.click();
		GenericFunctions.selectValue(owner_Type, "Company Owned");
		seller_Name.sendKeys("Ramaswamy");
		invoice_No.sendKeys("inv_011");
		
		Documents.click();
		invoice_No_1.sendKeys("rou_271");
		
		support.click();
		GenericFunctions.selectValue(service_Provider, "ACS");
		GenericFunctions.selectValue(contract_Type, "AMC");
		sla.sendKeys("556");
		support_End_Date.sendKeys("2018-10-13 10:00");
		last_Service.sendKeys("2");
		total_Service_Amount.sendKeys("10000");
		total_Parts_Consumed.sendKeys("5");
		support_Start_Date.sendKeys("2018-10-20 10:00");
		insurence_Start_Date.sendKeys("2018-10-11 07:00");
		insurence_End_Date.sendKeys("2018-11-24 13:00");
		
		submit_2.click();
		Thread.sleep(10);
		
		 }
		 
	 public void check_activate_deactivate() {
		  GenericFunctions.implicitlyWait(20);
			My_Company_Detail.click();
			Products.click();
			product_Checkbox.click();
			activate_Deactivate.click();
	 }
	  
	 public void check_upload_Product()
	 {
		 upload_Product.click();
		 browse.sendKeys("C:\\Users\\DELL\\Desktop\\ABcare data\\IT-Product-Template.csv");
		 submit_3.click();
	 }
	 	 
	 
}
