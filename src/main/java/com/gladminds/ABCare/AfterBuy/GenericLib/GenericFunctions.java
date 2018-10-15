package com.gladminds.ABCare.AfterBuy.GenericLib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;



public class GenericFunctions {
	
   public static WebDriver driver = null;
      
       public static void open_browser(String browserName) {
    	   if(browserName.equals("chrome")) {
    		   System.setProperty("webdriver.chrome.driver", "src//main//resources//drivers//chromedriver.exe");
    			  driver = new ChromeDriver();
    			  driver.manage().window().maximize();
    	   }
    	   else if (browserName.equals("firefox")) {
    		   System.setProperty("webdriver.gecko.driver", "src//main//resources//drivers//geckodriver.exe");
      			driver = new FirefoxDriver();
      			driver.manage().window().maximize();
		}
    	   else {
			System.out.println("invalid browser name");
		}
      }
      
      public static void getUrl(String url) {
    	  driver.get(url);
      }
      @BeforeClass(description="this method is call before class")
      public static void verify_login() {
    	  ReadProperties obj = ReadProperties.getInstence();
    	  open_browser(obj.getStringValue("browser"));
    	 
    	  getUrl(obj.getStringValue("url"));
    	  
    	  LoginPage log = PageFactory.initElements(driver, LoginPage.class);
    	  log.check_Login();
      }
       
      public static void implicitlyWait(int time){
   driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);    	  
}
        public static void selectValue(WebElement element, String value){
        	Select  sel = new Select(element);
         	sel.selectByVisibleText(value);
        	}
        
        public static void move_on_element(WebElement ele) {
        	Actions act = new Actions(driver);
        	act.moveToElement(ele).click().build().perform();
        }
        
        public static void elementTOBeVisible(int time, WebElement element) {
    		WebDriverWait waits = new WebDriverWait(driver, time);
    		waits.until(ExpectedConditions.visibilityOf(element));
    	}
}
