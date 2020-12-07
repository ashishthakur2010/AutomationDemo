package com.job.hunt.testcases;

import org.testng.ITestListener;
import org.testng.ITestNGListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.internal.annotations.IListeners;

import com.job.hunt.util.*;
import com.job.hunt.pages.GoogleSearchPage;
import com.job.hunt.pages.HomePage;
import com.job.hunt.pages.LoginPage;
import com.job.hunt.pages.MyProfilePage;
import com.job.hunt.pages.NaukriRegistertionPage;
import com.job.hunt.testbase.TestBase;


public class MyProfilePageTest extends TestBase {

	public GoogleSearchPage googleSearchPage;
	public NaukriRegistertionPage naukriRegistertionPage;
	public LoginPage loginPage;
	public HomePage homePage;
	public MyProfilePage myProfilePage;
	
	@BeforeTest
	public void Setup() throws Exception {
		initialization();
		googleSearchPage = new GoogleSearchPage();
		naukriRegistertionPage = new NaukriRegistertionPage();
		loginPage = new LoginPage();
		homePage = new HomePage();
		myProfilePage = new MyProfilePage();
		googleSearchPage.ClickOnNaukariLink();
		naukriRegistertionPage.ClickOnLoginlink();
		loginPage.Login(prop.getProperty("Username"), prop.getProperty("Password"));
		homePage.ClickOnUpdateProfileBtn();
	    Util.captureSS("My Profile Page");
	}
	
	@Test(enabled=true)
	public void EditHeadline() {
		myProfilePage.EditResumeHeadline();
	}
	
	@Test
	public void EditeBasicDetails() {
		myProfilePage.EditBasicDetails();
		
	}
	
//	@AfterTest
//	public void TearDown(ITestResult result) throws Exception {
////		if(ITestResult.FAILURE==result.getStatus()){
////			
////			Util.captureSS("ss");
////		}
//		//driver.quit();
//	}
	@AfterMethod
	public void TearDown() {
		driver.quit();
		
	}
	
}
