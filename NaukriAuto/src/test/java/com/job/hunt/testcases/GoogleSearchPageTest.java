package com.job.hunt.testcases;

import com.job.hunt.pages.GoogleSearchPage;
import com.job.hunt.pages.NaukriRegistertionPage;
import com.job.hunt.testbase.TestBase;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleSearchPageTest extends TestBase{

	
	GoogleSearchPage googleSearchPage;
	NaukriRegistertionPage naukriRegistertionPage;
	
	public GoogleSearchPageTest() {
		super();		
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		googleSearchPage = new GoogleSearchPage();
	}
	
	
	
	@Test
	public void ClickOnNaukariLink() {
		naukriRegistertionPage =googleSearchPage.ClickOnNaukariLink();	
	}
	
	
	@AfterMethod
	public void tearDown() {
		//driver.quit();
	}
}
