package com.job.hunt.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.job.hunt.testbase.TestBase;

public class NaukriRegistertionPage extends TestBase {

	     
	// OR
	
   @FindBy(xpath="//div[contains(text(),'Login')]")	
   WebElement Loginlink;
   
   
   public NaukriRegistertionPage()
   {
	   PageFactory.initElements(driver, this);
   }
   
   public LoginPage ClickOnLoginlink() {
	   
	  Loginlink.click();
	    
	  return new LoginPage(); 
   }
}
