package com.job.hunt.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.job.hunt.testbase.TestBase;

public class GoogleSearchPage extends TestBase {
	
	
	//Page Factory - OR
	
	@FindBy(xpath="//*[@id=\"rso\"]//following::a[5]")
	WebElement NaukirLink;
	
	
	public GoogleSearchPage() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	public NaukriRegistertionPage ClickOnNaukariLink() {
		 
		NaukirLink.click();
		return new NaukriRegistertionPage();
		
	}
	

}
