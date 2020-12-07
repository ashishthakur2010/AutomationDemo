package com.qa.hubspot.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.hubspot.base.BasePage;
import com.qa.hubspot.utils.ElementUtil;

import io.qameta.allure.Step;

public class NaukriLogin extends BasePage {

	private WebDriver driver;
	ElementUtil elementUtil;

	// By Locators -- OR
	By LoginUrl = By.xpath("//div[contains(text(),'Login')]");
	By emailId = By.className("err-border");
	By password = By.xpath("//input[@type='password']");
	By loginButton = By.className("btn-primary loginButton");
	By signUpLink = By.linkText("Register for free");

	// constructor of the page class:
	public NaukriLogin(WebDriver driver) {
		this.driver = driver;
		elementUtil = new ElementUtil(this.driver);
	}
	
	// page actions:
		@Step("getting login page...")
		public void getLoginPage() {
		    elementUtil.doClick(LoginUrl);
		}

		@Step("getting sing up link presence...")
		public boolean isSignUpLinkExist() {
			return elementUtil.doIsDisplayed(signUpLink);
		}

		@Step("login with username : {0} and password: {1}")
		public NaukriHome doLogin(String username, String pwd) {
			elementUtil.doClick(LoginUrl);
			System.out.println("login to app with --> " + username + ":" + pwd);
			elementUtil.waitForElementToBeVisible(emailId, 10);
			elementUtil.doSendKeys(emailId, username);
			elementUtil.doSendKeys(password, pwd);
			elementUtil.doClick(loginButton);
			
			return new NaukriHome(driver);
		}

}
