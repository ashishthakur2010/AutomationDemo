package com.job.hunt.testcases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.job.hunt.pages.GoogleSearchPage;
import com.job.hunt.pages.LoginPage;
import com.job.hunt.pages.NaukriRegistertionPage;
import com.job.hunt.testbase.TestBase;

public class NaukriRegistertionPageTest extends TestBase{

	NaukriRegistertionPage naukriRegistertionPage;
	GoogleSearchPage googleSearchPage;
	LoginPage loginPage;
	
	public NaukriRegistertionPageTest() {
		super();
	}
	
	@BeforeTest
	public void Setup() {
		initialization();
		naukriRegistertionPage = new NaukriRegistertionPage();
		googleSearchPage = new GoogleSearchPage();
		naukriRegistertionPage= googleSearchPage.ClickOnNaukariLink();
	}
	
	@Test
	public void ClickOnLoginLink() {
		
		naukriRegistertionPage.ClickOnLoginlink();
	
	}
	
	
	@AfterTest
	public void TearDown() {
	
		//driver.quit();
	}
	
	
}
