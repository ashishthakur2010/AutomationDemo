package com.job.hunt.pract;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;

import com.job.hunt.testbase.TestBase;

import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.job.hunt.util.*;
import com.job.hunt.pages.GoogleSearchPage;
import com.job.hunt.pages.HomePage;
import com.job.hunt.pages.LoginPage;
import com.job.hunt.pages.MyProfilePage;
import com.job.hunt.pages.NaukriRegistertionPage;
import com.job.hunt.testbase.TestBase;


public class test extends TestBase {

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
	

	  @Test
	  public void testUntitledTestCase() throws Exception {
	    //driver.get("https://www.naukri.com/mnjuser/profile?id=&orgn=homepage&action=modalOpen&action=modalOpen&action=modalOpen&action=modalOpen");
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Edit'])[1]/following::em[1]")).click();
	    driver.findElement(By.id("location-droopeFor")).click();
	    driver.findElement(By.linkText("Gurgaon")).click();
	    driver.findElement(By.id("saveBasicDetailsBtn")).click();
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Edit'])[1]/following::em[1]")).click();
	    driver.findElement(By.id("location-droopeFor")).click();
	    driver.findElement(By.linkText("Noida")).click();
	    driver.findElement(By.id("saveBasicDetailsBtn")).click();
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Edit'])[1]/following::em[1]")).click();
	    driver.findElement(By.id("location-droopeFor")).click();
	    driver.findElement(By.linkText("Gurgaon")).click();
	    driver.findElement(By.id("saveBasicDetailsBtn")).click();
	    driver.findElement(By.id("attachCV")).click();
	    driver.findElement(By.id("attachCV")).clear();
	    driver.findElement(By.id("attachCV")).sendKeys("C:\\fakepath\\Resume.docx");
	  }

	  @AfterClass(alwaysRun = true)
	  public void tearDown() throws Exception {
	  //  driver.quit();
	  
	  }

	  private boolean isElementPresent(By by) {
	    try {
	      driver.findElement(by);
	      return true;
	    } catch (NoSuchElementException e) {
	      return false;
	    }
	  }

	  private boolean isAlertPresent() {
	    try {
	      driver.switchTo().alert();
	      return true;
	    } catch (NoAlertPresentException e) {
	      return false;
	    }
	  }

	
	}

	
	

