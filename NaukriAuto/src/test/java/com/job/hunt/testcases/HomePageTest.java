package com.job.hunt.testcases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.job.hunt.pages.GoogleSearchPage;
import com.job.hunt.pages.HomePage;
import com.job.hunt.pages.LoginPage;
import com.job.hunt.pages.NaukriRegistertionPage;
import com.job.hunt.testbase.TestBase;

public class HomePageTest extends TestBase {

	
	public GoogleSearchPage googleSearchPage;
	public NaukriRegistertionPage naukriRegistertionPage;
	public LoginPage loginPage;
	public HomePage homePage;
	
	@BeforeTest
	public void Setup() {
		initialization();
		googleSearchPage = new GoogleSearchPage();
		naukriRegistertionPage = new NaukriRegistertionPage();
		loginPage = new LoginPage();
		homePage = new HomePage();
		googleSearchPage.ClickOnNaukariLink();
		naukriRegistertionPage.ClickOnLoginlink();
		loginPage.Login(prop.getProperty("Username"), prop.getProperty("Password"));
		
	}
	
	@Test
	public void ClickOnUpdateProfileBtn() {
		
		homePage.ClickOnUpdateProfileBtn();
	}
	
	@AfterTest
	public void TearDown() {
		//driver.quit();
		
	}
	
}
