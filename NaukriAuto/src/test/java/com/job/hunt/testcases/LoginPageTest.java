package com.job.hunt.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.job.hunt.pages.GoogleSearchPage;
import com.job.hunt.pages.HomePage;
import com.job.hunt.pages.LoginPage;
import com.job.hunt.pages.NaukriRegistertionPage;
import com.job.hunt.testbase.TestBase;

public class LoginPageTest extends TestBase {

	public LoginPage loginPage;
	public HomePage homePage;
	public GoogleSearchPage googleSearchPage;
	public NaukriRegistertionPage naukriRegistertionPage;
	
	public LoginPageTest() {
		super();
	}
	
	
	@BeforeMethod 
	public void Setup() {
		initialization();
		googleSearchPage = new GoogleSearchPage();
		naukriRegistertionPage = new NaukriRegistertionPage();
		loginPage = new LoginPage();
        googleSearchPage.ClickOnNaukariLink();
        naukriRegistertionPage.ClickOnLoginlink();
	}
	
	@Test
	 public void LoginPageLoginMethod() {
		homePage = loginPage.Login(prop.getProperty("Username"),prop.getProperty("Password"));
		
	}
	
	
	@AfterMethod
	public void TearDown() {
		//driver.quit();
		
	}
	
	
}
