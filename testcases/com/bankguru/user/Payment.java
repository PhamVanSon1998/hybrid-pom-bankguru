package com.bankguru.user;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.AbstractPage;

import commons.AbtractTest;
import pageObjects.EditCustomerPage;
import pageObjects.LoginPage;
import pageObjects.NewAccountPage;
import pageObjects.NewCustomerPage;
import pageObjects.PageGeneratorManage;

public class Payment extends AbtractTest {
	WebDriver driver;
	LoginPage loginPageObject;
	NewCustomerPage newCustomerPageObject;
	NewAccountPage newAccountPageObject;
	EditCustomerPage editCustomerPage;
	String userID, passWord, email, customerID;
	String customerName, dateOfBirth, address, city, state, pin, telephoneNumber;
	String editCustomerName, editDateOfBirth, editAddress, editCity, editState, editPin, editTelephoneNumber;
	String accountType,initialDeposit,accountID;

	@Parameters({ "browser", "url" })
	@BeforeClass
	public void BeforeClass(String browserName, String urlValues) {
		driver = getBrowserDriver(browserName, urlValues);
		email = "PhanThuy" + getRandomNumber() + "@gmail.com";
		customerName = "PhanThuy";
		dateOfBirth = "11281998";
		address = "192 Quynh Lien Hoang Mai";
		city = "Vinh";
		state = "Senda";
		pin = "123456";
		telephoneNumber = "012345678";
		
		editCustomerName = "Son Pham"; editDateOfBirth="08311998"; editAddress="145 Quynh Trang Hoang Mai"; editCity="Viet Tri"; editState="PhanThuy"; editPin="654321"; editTelephoneNumber="098765432";
		accountType="Current";initialDeposit="2000000";
		loginPageObject = PageGeneratorManage.getLoginPageOject(driver);

		log.info("Pre-Condition-Step 01: enter to 'Email' address to get access to demo site");
		loginPageObject.enterEmailTextbox(email);

		log.info("Pre-Condition-Step 02: click to 'Submit' button");
		loginPageObject.clickToSubmitButton();

		log.info("Pre-Condition-Step 03: get 'UserID' ");
		userID = loginPageObject.getTextUserIDValue();

		log.info("Pre-Condition-Step 04: get 'PassWord' ");
		passWord = loginPageObject.getTextPasswordValue();

		log.info("Pre-Condition-Step 05: input and search link ");
		loginPageObject.inputToEnviromentLink("https://demo.guru99.com/V4");

		log.info("Pre-Condition-Step 06: enter to 'userID' textbox with value:" + userID);
		loginPageObject.enterUserIDTextbox(userID);

		log.info("Pre-Condition-Step 06: enter to 'password' textbox with value:" + passWord);
		loginPageObject.enterPasswordTextbox(passWord);

		log.info("Pre-Condition-Step 06: click to 'Login' button");
		loginPageObject.clickToLoginButton();

		log.info("Pre-Condition-Step 07: Verify 'Login' Page Success");
		verifyEquals(loginPageObject.isMessageLoginSuccess(), "Welcome To Manager's Page of GTPL Bank");
	}

	@Test
	public void TC_01_New_Account() {
		newCustomerPageObject = PageGeneratorManage.getNewCustomerPageOject(driver);

		log.info("New Customer-Step 01: Click new customer link at menusubnav and navigate to Add New Customer Page");
		newCustomerPageObject.clickToMenusubavLinkByName("New Customer");
		
//		newCustomerPageObject.clickToCloseAd();

		log.info("New Customer-Step 02: Verify navigate to Add New Customer Page Success");
		verifyEquals(newCustomerPageObject.getPageTextNavigateToAddNewCustomer(), "Add New Customer");
//		
//		log.info("New Customer-Step 03: Check to Gender-male checkbox");
//		newCustomerPageObject.checkToGenderCheckbox("");
		
		log.info("New Customer-Step 03: enter to Customer Name ");
		newCustomerPageObject.enterToCustomerNameTextbox(customerName);

		log.info("New Customer-Step 04: enter to Date of Birth ");
		newCustomerPageObject.enterToDateOfBirth(dateOfBirth);

		log.info("New Customer-Step 05: enter to Address area");
		newCustomerPageObject.enterToAddressArea(address);

		log.info("New Customer-Step 06: enter to City textbox");
		newCustomerPageObject.enterCityTextbox(city);

		log.info("New Customer-Step 07: enter to State textbox");
		newCustomerPageObject.enterStateTextbox(state);

		log.info("New Customer-Step 08: enter to PIN textbox");
		newCustomerPageObject.enterPINTextbox(pin);

		log.info("New Customer-Step 09: enter to Telephone Number");
		newCustomerPageObject.enterTelephoneNumberTextbox(telephoneNumber);

		log.info("New Customer-Step 10: enter to Email textbox");
		newCustomerPageObject.enterEmailTextbox(email);
		
		log.info("New Customer-Step 11: enter to Password textbox");
		newCustomerPageObject.enterPasswordTextbox(email);

		log.info("New Customer-Step 12: click to Submit button");
		newCustomerPageObject.clicktoSubmitButton();
		
		log.info("New Customer-Step 13: Verify message displays with content 'Customer Registed Successfully!!!'");
		verifyEquals(newCustomerPageObject.getTextRegisterSuccess(), "Customer Registered Successfully!!!");
		
		
		log.info("New Customer-Step 14: Verify CustomerName");
		customerID = newCustomerPageObject.getInformationNameValue("Customer ID");
		
		log.info("New Customer-Step 14: Verify CustomerName");
		verifyEquals(newCustomerPageObject.getInformationNameValue("Customer Name"), customerName);
		
//		log.info("New Customer-Step 15: Verify DayOfBirth");
//		verifyEquals(newCustomerPageObject.getInformationNameValue("Birthdate").replace("-", ""), dateOfBirth);
		
		log.info("New Customer-Step 16: Verify Address");
		verifyEquals(newCustomerPageObject.getInformationNameValue("Address"), address);
		
		log.info("New Customer-Step 17: Verify City");
		verifyEquals(newCustomerPageObject.getInformationNameValue("City"), city);
		
		log.info("New Customer-Step 18: Verify State");
		verifyEquals(newCustomerPageObject.getInformationNameValue("State"), state);
		
		log.info("New Customer-Step 19: Verify Pin");
		verifyEquals(newCustomerPageObject.getInformationNameValue("Pin"), pin);
		
		log.info("New Customer-Step 21: Verify Mobile");
		verifyEquals(newCustomerPageObject.getInformationNameValue("Mobile No."), telephoneNumber);
		
		log.info("New Customer-Step 22: Verify Email");
		verifyEquals(newCustomerPageObject.getInformationNameValue("Email"), email);
	}
	
	@Test
	public void TC_02_Edit_Customer() {
		
		log.info("Edit Customer-Step 01: Click edit Customer link at menusubnav and navigate to Edit Customer Page");
		newCustomerPageObject.clickToMenusubavLinkByName("Edit Customer");
		editCustomerPage = PageGeneratorManage.getEditCustomerPageOject(driver);
		
		log.info("Edit Customer-Step 01: input To CustomerID textbox with value "+customerID);
		editCustomerPage.inputToTextboxInEditCustomerPageByName("cusid",customerID);
		
		log.info("Edit Customer-Step 01: Click Submit button to login edit page");
		editCustomerPage.clickToSubmitButtonToNavigateEDitPage();
		
		log.info("Edit Customer-Step 01: input To Address textbox with value "+editAddress);
		editCustomerPage.inputToTextareaInEditCustomerPageByName("addr",editAddress);
		
		log.info("Edit Customer-Step 01: input To City textbox with value "+editCity);
		editCustomerPage.inputToTextboxInEditCustomerPageByName("city",editCity);
		
		log.info("Edit Customer-Step 01: input To State textbox with value "+editState);
		editCustomerPage.inputToTextboxInEditCustomerPageByName("state",editState);
		
		log.info("Edit Customer-Step 01: input To Pin textbox with value "+editPin);
		editCustomerPage.inputToTextboxInEditCustomerPageByName("pinno",editPin);
		
		log.info("Edit Customer-Step 01: input To Mobile textbox with value "+editPin);
		editCustomerPage.inputToTextboxInEditCustomerPageByName("telephoneno",editTelephoneNumber);
		
		log.info("Edit Customer-Step 01: Click Submit button");
		editCustomerPage.clickToSubmitButton();
		
		log.info("Edit Customer-Step 01: access to alest");
		editCustomerPage.accessToAllert();
		
		log.info("Edit Customer-Step 01: input To CustomerID textbox with value "+customerID);
		editCustomerPage.inputToTextboxInEditCustomerPageByName("cusid",customerID);
		
		log.info("Edit Customer-Step 01: Click Submit button to login edit page");
		editCustomerPage.clickToSubmitButtonToNavigateEDitPage();
		
		log.info("Edit Customer-Step 01: Verify Information Address edit Success");
		verifyEquals(editCustomerPage.getValueTextareaInformationEdit("addr"), editAddress);
		
		log.info("Edit Customer-Step 01: Verify Information City edit Success");
		verifyEquals(editCustomerPage.getValueTextboxInformationEdit("city"), editCity);
		
		log.info("Edit Customer-Step 01: Verify Information State edit Success");
		verifyEquals(editCustomerPage.getValueTextboxInformationEdit("state"), editState);
		
		log.info("Edit Customer-Step 01: Verify Information Pin edit Success");
		verifyEquals(editCustomerPage.getValueTextboxInformationEdit("pinno"), editPin);
		
		log.info("Edit Customer-Step 01: Verify Information Mobile Number edit Success");
		verifyEquals(editCustomerPage.getValueTextboxInformationEdit("telephoneno"), editTelephoneNumber);
	}
	
	@Test
	public void TC_03_New_Account() {
		newCustomerPageObject = PageGeneratorManage.getNewCustomerPageOject(driver);
		log.info("New Account - step 01: Click to New Account Page and Navigate to New Account Page");
		newCustomerPageObject.clickToMenusubavLinkByName("New Account");
		newAccountPageObject =PageGeneratorManage.getNewAccountPageOject(driver);
		
		log.info("New Account - step 01: Input to CustomerID textbox with value"+customerID);
		newAccountPageObject.inputToFieldNameTextboxWithName("Customer id",customerID);
		
		log.info("New Account - step 01: Select to Account type dropdown with value"+accountType);
		newAccountPageObject.sellectToAccountTypeDropdown("Current");
		
		log.info("New Account - step 01: Input to Initial deposit textbox with value"+initialDeposit);
		newAccountPageObject.inputToFieldNameTextboxWithName("Initial deposit",initialDeposit);
		
		log.info("New Account - step 01: Click to Submit Button");
		newAccountPageObject.clickToSubmitButton();
		
		log.info("New Account - step 01: verify message  create new Account Success with value 'Account Generated Successfully!!!'");
		verifyEquals(newAccountPageObject.getMesaageNewAccountSuccesss(), "Account Generated Successfully!!!");
		
		log.info("New Account - step 01: get information AccountID Correct");
		accountID = newAccountPageObject.getInformationAccountCorrect("Account ID");
		
		log.info("New Account - step 01: verify information CustomerID Correct");
		verifyEquals(newAccountPageObject.getInformationAccountCorrect("Customer ID"), customerID);
		
		log.info("New Account - step 01: verify information CustomerName Correct");
		verifyEquals(newAccountPageObject.getInformationAccountCorrect("Customer Name"), customerName);
		
		log.info("New Account - step 01: verify information Email Correct");
		verifyEquals(newAccountPageObject.getInformationAccountCorrect("Email"), email);
		
		log.info("New Account - step 01: verify information AccountType Correct");
		verifyEquals(newAccountPageObject.getInformationAccountCorrect("Account Type"), accountType);
		
		log.info("New Account - step 01: verify information CurrentAmount Correct");
		verifyEquals(newAccountPageObject.getInformationAccountCorrect("Current Amount"), initialDeposit);
	}
	
	@AfterClass(alwaysRun = true)
	public void AfterClass() {
		closeBrowserAndDriver();
	}
}
