package com.job.hunt.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.job.hunt.testbase.TestBase;

public class MyProfilePage extends TestBase {

	//OR
	
	@FindBy(xpath="//span[contains(text(),'ADD RESUME HEADLINE')]")
	WebElement HeadlineEditBtn;
	
	@FindBy(xpath="//textarea[@class='resumeHeadlineTxt materialize-textarea']")
	WebElement HeadlineTextField;
	
	@FindBy(xpath="//button[contains(text(),'Save')]//following::button[2]")
	WebElement HeadlineSaveBtn;
	
	@FindBy(xpath="//button[contains(text(),'Save')]//following::button[1]")
	WebElement HeadlinecancleBtn;
	
	@FindBy(xpath="(.//*[normalize-space(text()) and normalize-space(.)='Edit'])[1]/following::em[1]")
	WebElement EditBasicDetailsBtn;
	
	@FindBy(xpath="//input[@id='locationSugg']")
	WebElement CurrentLocationTxtBox;
	
	@FindBy(linkText="Gurgaon")
	WebElement CurrentLocation1;
	
	@FindBy(linkText="Noida")
	WebElement CurrentLocation2;
	
	@FindBy(id="saveBasicDetailsBtn")
	WebElement SaveBasicDetailsBtn;
	
	@FindBy(id="attachCV")
	WebElement UpdateResumBtn;


	
	public MyProfilePage() {
		PageFactory.initElements(driver, this);
	}
	
	public void EditResumeHeadline() {
		
		HeadlineEditBtn.click();
		HeadlineTextField.clear();
		HeadlineTextField.sendKeys(prop.getProperty("ResumeHeadline"));
		HeadlineTextField.click();
		//HeadlineTextField.clear();
		HeadlineSaveBtn.click();
	}
	
	public void EditBasicDetails() {
		EditBasicDetailsBtn.click();
		CurrentLocationTxtBox.click();
//		WebElement element = driver.findElement(By.xpath("//*[@id=\"ul_location-droope\"]/ul/li[7]/a"));
//		JavascriptExecutor executor = (JavascriptExecutor)driver;
//		executor.executeScript("arguments[0].click();", element);
		SaveBasicDetailsBtn.click();
//		EditBasicDetailsBtn.click();
//		CurrentLocationTxtBox.click();
//		CurrentLocation2.click();
//		SaveBasicDetailsBtn.click();
//		EditBasicDetailsBtn.click();
//		CurrentLocationTxtBox.click();
//		CurrentLocation1.click();
//		SaveBasicDetailsBtn.click();
	}
	
}
