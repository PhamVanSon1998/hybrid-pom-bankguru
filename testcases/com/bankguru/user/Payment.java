package com.bankguru.user;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commons.AbtractTest;
import pageObjects.LoginPage;
import pageObjects.PageGeneratorManage;

public class Payment extends AbtractTest{
	WebDriver driver;
	LoginPage loginPageObject;
	String userID,passWord,email;
	
	@Parameters({ "browser", "url" })
	@BeforeClass
	public void BeforeClass(String browserName, String urlValues) {
		driver = getBrowserDriver(browserName, urlValues);
		email = "PhanThuy" + getRandomNumber() + "@gmaiil.com";
		loginPageObject = PageGeneratorManage.getLoginPageOject(driver);
		
		log.info("Pre-Condition-Step 01: enter to 'Email' address to get access to demo site");
		loginPageObject.enterEmailTextbox(email);
		
		log.info("Pre-Condition-Step 02: click to 'Submit' button");
		loginPageObject.clickToSubmitButton();
		
		log.info("Pre-Condition-Step 03: get 'UserID' ");
		userID = loginPageObject.getTextUserIDValue();
		
		log.info("Pre-Condition-Step 04: get 'PassWord' ");
		passWord = loginPageObject.getTextPasswordValue();
		
		log.info("Pre-Condition-Step 05: click 'Navbar' Link with Name: ");
		loginPageObject.clickToNavbarLink("Bank Project");
		
		log.info("Pre-Condition-Step 06: enter to 'userID' textbox with value:" + userID);
		loginPageObject.enterUserIDTextbox(userID);
		
		log.info("Pre-Condition-Step 06: enter to 'password' textbox with value:" + passWord);
		loginPageObject.enterPasswordTextbox(passWord);
		
		log.info("Pre-Condition-Step 06: click to 'Login' button");
		loginPageObject.clickToLoginButton();
	}
	
	@Test
	public void TC_01_(){
		
	}
}
