package com.job.hunt.testbase;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class TestBase {

	//1.Declaring global variables.
	//2.The scope of these variables are entire project.
	
public	static WebDriver driver =null;
public	static Properties prop;
              

   //1.Creating a constructor to initialize properties variable.
   //2.Creating object of FileInputeStream class to load a file from storage.
 
	public TestBase(){
	
		prop = new Properties();
		
		try {
			FileInputStream p = new FileInputStream("C:/Users/Ashish/Documents/GitHub/AutomationDemo/NaukriAuto/src/main/java/com/job/hunt/config/config.properties");
			                                         
	    prop.load(p);
		
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	
	}
	
	//1.Creating an method which acts as pre-requisite before any test is executed.
	//2.Lunching Browse.
	//3.Maximize window.
	//4.deleteAllCookies.
	//5.pageLoadTimeout.
	//6.implicitlyWait.
	//7.Entering the URL.
	
	public static void initialization() {
		
		String BrowserName = prop.getProperty("Browser");
		
		if(BrowserName.equals("Chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "C:/Users/Ashish/Documents/GitHub/AutomationDemo/NaukriAuto/lib/chromedriver.exe");
		
			ChromeOptions chromeOptions = new ChromeOptions();
			chromeOptions.addExtensions(new File("C:/Users/Ashish/Documents/GitHub/AutomationDemo/NaukriAuto/lib/ljdobmomdgdljniojadhoplhkpialdid-5.3.21-Crx4Chrome.com.crx"));
			DesiredCapabilities desiredCapabilities =  DesiredCapabilities.chrome();
			desiredCapabilities.setCapability(chromeOptions.CAPABILITY,chromeOptions);
			
			driver = new ChromeDriver(desiredCapabilities);
		}
		
		else if (BrowserName.equals("FF")) {
			System.setProperty("webdriver.gecko.driver", "C:/Users/Ashish/Documents/GitHub/AutomationDemo/NaukriAuto/lib/geckodriver");
		
		}	
			else {
				System.out.println("Browser Not Found");
			}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(100,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);

		  String MainWindow=driver.getWindowHandle();		
		
	        // To handle all new opened window.				
	            Set<String> s1=driver.getWindowHandles();		
	        Iterator<String> i1=s1.iterator();		
	        		
	        while(i1.hasNext())			
	        {		
	            String ChildWindow=i1.next();		
	            		
	            if(!MainWindow.equalsIgnoreCase(ChildWindow))			
	            {    		
	                  driver.switchTo().window(ChildWindow);	                                                                                                           		
	            }		
	        }		
	            driver.switchTo().window(MainWindow);	
	            
//	            try {
//	    			Thread.sleep(2000);
//	    		} catch (InterruptedException e) {
//	    			// TODO Auto-generated catch block
//	    			e.printStackTrace();
//	    		}
	    		    driver.get(prop.getProperty("Url"));
	    		   
//	    		    try {
//	    						Thread.sleep(4000);
//	    					} catch (InterruptedException e) {
//	    						// TODO Auto-generated catch block
//	    						e.printStackTrace();
//	    					}
//	    				    
	}
	
}
