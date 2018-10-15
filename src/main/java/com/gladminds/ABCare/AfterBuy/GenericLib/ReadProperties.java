package com.gladminds.ABCare.AfterBuy.GenericLib;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadProperties {
	
	 private static ReadProperties obj;
	 Properties prop;
	 private ReadProperties() 
       {	 
    	    prop = new Properties();
    	   try {
    	   prop.load(new FileInputStream("config/config.properties"));
    	   }
    	   catch (Exception e) {
			e.printStackTrace();
		}
       }
     
       public static synchronized ReadProperties getInstence() {
    	   if(obj == null) {
    	    obj = new ReadProperties();
    	   }
    	    return obj;
    	    
       }
        public String getStringValue(String key)
        {
        	String str = prop.getProperty(key, "invalid value");
        	return str;
        }
}
 
