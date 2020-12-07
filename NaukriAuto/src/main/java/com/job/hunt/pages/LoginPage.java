package com.job.hunt.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.job.hunt.testbase.TestBase;



public class LoginPage extends TestBase {

	//Page Factory.(Object repository)
	//https://www.naukri.com/nlogin/login
//	@FindBy(id="login_Layer")
//	WebElement loginLinkBtn;
	
	@FindBy(id="usernameField")
    WebElement username;
	
	@FindBy(id="passwordField")
	WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement loginBtn;
	
	
	
	//Initializing Page Object
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	 public String validateLoginPageTitle() {
		 return driver.getTitle();
	 }	 
	 
	 public HomePage Login(String un,String pwd) {
		 username.sendKeys(un);
		 password.sendKeys(pwd);
		 loginBtn.click();
		
		 
		 return new HomePage();
	 }

}
