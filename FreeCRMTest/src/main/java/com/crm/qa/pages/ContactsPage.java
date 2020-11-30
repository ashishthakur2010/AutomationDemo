package com.crm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.crm.qa.base.TestBase;

public class ContactsPage extends TestBase {

	@FindBy(xpath = "//div[@id='dashboard-toolbar']/div")
	WebElement contactsLabel;
	
	@FindBy(xpath ="//input[@name='first_name']")
	WebElement firstName;
	
	@FindBy(xpath ="//input[@name='last_name']")
	WebElement lastName;
	
	@FindBy(xpath ="//div[@name='company']//following::input[1]")
	WebElement company;
	
	@FindBy(xpath = "//button[contains(text(),'Save')]")
	WebElement saveBtn;
	
	
	
	// Initializing the Page Objects:
	public ContactsPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public boolean verifyContactsLabel(){
		return contactsLabel.isDisplayed();
	}
	
	
	public void selectContactsByName(String name){
		driver.findElement(By.xpath("//td[contains(text(),'"+name+"')]")).click();
	}
	
	
	public void createNewContact(String ftName, String ltName, String comp) throws InterruptedException{
		//Select select = new Select(driver.findElement(By.name("title")));
		//select.selectByVisibleText(title);
		
		firstName.sendKeys(ftName);
		lastName.sendKeys(ltName);
		company.sendKeys(comp);
		saveBtn.click();
		Thread.sleep(3000);
		
	}
	
	
	

}
