package com.job.hunt.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.job.hunt.testbase.TestBase;



public class HomePage extends TestBase {

	//Page Factory.(Object repository)
	
	@FindBy(xpath="//div[contains(text(),'UPDATE PROFILE')]")
    WebElement UpdateProfileBtn;
	
	//Initializing Page Object
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	 public String validateLoginPageTitle() {
		 return driver.getTitle();
	 }	 
	 
	 public MyProfilePage ClickOnUpdateProfileBtn() {
		 
		UpdateProfileBtn.click();
		 return new MyProfilePage();
	 }

}
