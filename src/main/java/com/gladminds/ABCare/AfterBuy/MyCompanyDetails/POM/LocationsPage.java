package com.gladminds.ABCare.AfterBuy.MyCompanyDetails.POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.gladminds.ABCare.AfterBuy.GenericLib.GenericFunctions;

public class LocationsPage {

	@FindBy(xpath = ".//*[@id='side']/li[3]/a")
	WebElement my_company_details;
	@FindBy(xpath = ".//*[@id='page-wrapper']/div/div[2]/div[1]/div/a/div/i")
	WebElement locations;
	@FindBy(xpath = ".//*[@id='page-wrapper']/div/div[2]/div[1]/div/a/div/i")
	WebElement add_Locations;
	@FindBy(xpath = ".//*[@id='corporate_location_type']")
	WebElement corporate_Location_Type;
	@FindBy(xpath = ".//*[@id='location_name']")
	WebElement location_Name;
	@FindBy(xpath = ".//*[@id='showbranchdetail']/div[1]/input")
	WebElement branch_code;
	@FindBy(xpath = ".//*[@id='address_line_1']")
	WebElement address_line_1;
	@FindBy(xpath = ".//*[@id='address_line_2']")
	WebElement address_line_2;
	@FindBy(xpath = ".//*[@id='address_line_3']")
	WebElement address_line_3;
	@FindBy(xpath = ".//*[@id='showbranchdetail']/div[5]/select")
	WebElement country;
	@FindBy(xpath = ".//*[@id='txtstate']")
	WebElement state;
	@FindBy(xpath = ".//*[@id='txtcity']")
	WebElement city;
	@FindBy(xpath = ".//*[@id='showbranchdetail']/div[8]/input")
	WebElement pincode;
	@FindBy(xpath = ".//*[@id='showbranchdetail']/div[9]/select")
	WebElement office_type;
	@FindBy(xpath = ".//*[@id='showbranchdetail']/div[10]/input")
	WebElement telephone;
	@FindBy(xpath = ".//*[@id='showbranchdetail']/div[11]/input")
	WebElement mobile_number;
	@FindBy(xpath = ".//*[@id='showbranchdetail']/div[12]/input")
	WebElement email;
	@FindBy(xpath = ".//*[@id='showbranchdetail']/div[13]/input")
	WebElement location_image_1;
	@FindBy(xpath = ".//*[@id='showbranchdetail']/div[14]/input")
	WebElement location_image_2;
	// submit branch details.
	@FindBy(xpath = ".//button[text()='Submit']")
	WebElement submit_branch_button;
	// cancel branch details.
	@FindBy(xpath = ".//*[@id='CorporateLocationTypeInfoform']/a/button")
	WebElement cancel_branch_button;

	@FindBy(xpath = ".//*[@id='corporate_branch_locationinfo']")
	WebElement select_Corporate_Branch;
	@FindBy(xpath = ".//*[@id='location_name']")
	WebElement Building_name;
	// submit building button.
	@FindBy(xpath = ".//*[@id='CorporateLocationTypeInfoform']/button")
	WebElement submit_building;
	
	@FindBy(xpath=".//*[@id='corporate_building_addblock']")
	WebElement select_corporate_building;
	@FindBy(xpath=".//*[@id='location_name']")
	WebElement block_name;
	@FindBy(xpath=".//*[@id='CorporateLocationTypeInfoform']/button")
	WebElement submit_block;
	
	@FindBy(xpath=".//*[@id='corporate_block_addfloor']")
	WebElement select_corporate_block;
	@FindBy(xpath=".//*[@id='location_name']")
	WebElement floor_name;
	@FindBy(xpath=".//*[@id='CorporateLocationTypeInfoform']/button")
	WebElement submit_floor;
	
	@FindBy(xpath=".//*[@id='corporate_floor_addroom']")
	WebElement select_corporate_floor;
	@FindBy(xpath=".//*[@id='location_name']")
	WebElement room_name;
	@FindBy(xpath=".//*[@id='CorporateLocationTypeInfoform']/button")
	WebElement submit_room;
	
	@FindBy(xpath=".//*[@id='corporate_room_locationinfo']")
	WebElement select_corporate_room;
	@FindBy(xpath=".//*[@id='location_name']")
	WebElement location_pillar_name;
	@FindBy(xpath=".//*[@id='CorporateLocationTypeInfoform']/button")
	WebElement submit_pillar;
	
	private String locationName = "Electronics city";
	private String branchCode = "704090";
	private String addressLine_1 = "";
	private String addressLine_2 = "hadapsar";
	private String country_1 = "India";
	private String state_1 = "Karnataka";
	private String city_1  = "Bangalore";
	private String office_Type_1 = "HEAD OFFICE";
	private String Pin_code = "204030";
	private String tele_phone = "9773205992";
	private String mob_number = "9773215991";
	private String Email_ID = "eonpark@gmail.com";
	private String select_cor_branch  = "eonPark (302031)";
	private String Building_Name_1 = "fundtonic";
	private String block_Name_1 = "Block D1";
	private String floor_Name_1 = "Floor_3";
	private String room_Name_1 = "Room_no_3";
	private String location_Name_1 = "piller_4";

	public void check_Add_Branch() throws InterruptedException {
		
		
		
		GenericFunctions.implicitlyWait(20);
		my_company_details.click();
		locations.click();
		add_Locations.click();
		GenericFunctions.selectValue(corporate_Location_Type, "Branch");
		location_Name.sendKeys(locationName);
		branch_code.sendKeys(branchCode);
		address_line_1.sendKeys(addressLine_1);
		address_line_2.sendKeys(addressLine_2);
		GenericFunctions.selectValue(country, country_1);
		GenericFunctions.selectValue(state, state_1);
		GenericFunctions.selectValue(city, city_1);
		pincode.sendKeys(Pin_code);
		GenericFunctions.selectValue(office_type, office_Type_1);
		telephone.sendKeys(tele_phone);
		mobile_number.sendKeys(mob_number);
		email.sendKeys(Email_ID);
		location_image_1.sendKeys(
				"C:\\Users\\DELL\\Desktop\\ABcare data\\branch_location_image_1.jpg");
		Thread.sleep(20);
		submit_branch_button.click();
	}

	public void check_add_building() {
		GenericFunctions.implicitlyWait(20);
		my_company_details.click();
		locations.click();
		add_Locations.click();
		boolean staleElement = true;
		while(staleElement) {
			try {
				GenericFunctions.selectValue(corporate_Location_Type, "Building");
				GenericFunctions.selectValue(select_Corporate_Branch, select_cor_branch);
			staleElement = false;
			}
			catch (Exception e) {
          staleElement = true;
			}
			}
		Building_name.sendKeys(Building_Name_1);
		submit_building.click();
	}
	
	public void check_add_block(){
		GenericFunctions.implicitlyWait(20);
		boolean staleElement = true;
		while(staleElement) {
			try {
				GenericFunctions.selectValue(corporate_Location_Type, "Block");
				GenericFunctions.selectValue(select_Corporate_Branch, select_cor_branch);
			staleElement = false;
			}
			catch (Exception e) {
          staleElement = true;
			}
			}
		GenericFunctions.selectValue(select_corporate_building, Building_Name_1);
		block_name.sendKeys(block_Name_1);
		submit_block.click();	
}
	
	   public void check_add_floor(){
		   GenericFunctions.implicitlyWait(20);
			GenericFunctions.selectValue(corporate_Location_Type, "Floor");
			GenericFunctions.selectValue(select_Corporate_Branch, select_cor_branch);
			GenericFunctions.selectValue(select_corporate_building, Building_Name_1);
		    GenericFunctions.selectValue(select_corporate_block, block_Name_1);
		    floor_name.sendKeys(floor_Name_1);
		    submit_floor.click();
}
	        public void check_add_room() {
	        	GenericFunctions.implicitlyWait(20);
				GenericFunctions.selectValue(corporate_Location_Type, "Room");
				GenericFunctions.selectValue(select_Corporate_Branch, select_cor_branch);
				GenericFunctions.selectValue(select_corporate_building, Building_Name_1);
			    GenericFunctions.selectValue(select_corporate_block, block_Name_1);
			    GenericFunctions.selectValue(select_corporate_floor, floor_Name_1);
			    room_name.sendKeys(room_Name_1);
			    submit_room.click();
	        }
	        
	        public void check_add_piller(){
	        	GenericFunctions.implicitlyWait(20);
	        	boolean staleElement = true;
	    		while(staleElement) {
	    			try {
				GenericFunctions.selectValue(corporate_Location_Type, "Location");
				GenericFunctions.selectValue(select_Corporate_Branch, select_cor_branch);
				GenericFunctions.selectValue(select_corporate_building, Building_Name_1);
			    GenericFunctions.selectValue(select_corporate_block, block_Name_1);
			    GenericFunctions.selectValue(select_corporate_floor, floor_Name_1);
			    GenericFunctions.selectValue(select_corporate_room, room_Name_1);
			    staleElement = false;
			}
			catch (Exception e) {
          staleElement = true;
			}
			}
			    location_pillar_name.sendKeys(location_Name_1);
			    submit_pillar.click();
	        }
}
