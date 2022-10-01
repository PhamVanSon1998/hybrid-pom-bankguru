package pageObjects;

import org.openqa.selenium.WebDriver;


import commons.AbtractPage;
import pageUIs.AbstractPageUI;
import pageUIs.NewCustomerPageUI;

public class NewCustomerPage extends AbtractPage{
	WebDriver driver;

	public NewCustomerPage(WebDriver driver) {
		this.driver = driver;
	}
	

	public void clickToMenusubavLinkByName(String menuSubavLinkByName) {
		waitToElementClickable(driver, AbstractPageUI.SUBVAV_MENU_LINK_NAME,menuSubavLinkByName);
		clickToElement(driver, AbstractPageUI.SUBVAV_MENU_LINK_NAME,menuSubavLinkByName);
	}

	public String getPageTextNavigateToAddNewCustomer() {
		waitToElementVisible(driver, NewCustomerPageUI.PAGE_NAME);
		return getElementText(driver, NewCustomerPageUI.PAGE_NAME);
	}

//	public void checkToGenderCheckbox(String string) {
//		// TODO Auto-generated method stub
//		
//	}


	public void enterToCustomerNameTextbox(String customerName) {
		waitToElementVisible(driver,NewCustomerPageUI.CUSTOMER_NAME_TEXTBOX);
		senKeysToElement(driver, NewCustomerPageUI.CUSTOMER_NAME_TEXTBOX, customerName);
	}
	
	public void enterToDateOfBirth(String dateOfBirthTextbox) {
		waitToElementVisible(driver,NewCustomerPageUI.DATE_OF_BIRTH_TEXTBOX);
		senKeysToElement(driver, NewCustomerPageUI.DATE_OF_BIRTH_TEXTBOX, dateOfBirthTextbox);
	}

	public void enterToAddressArea(String addressTextbox) {
		waitToElementVisible(driver,NewCustomerPageUI.ADDRESS_TEXTBOX);
		senKeysToElement(driver, NewCustomerPageUI.ADDRESS_TEXTBOX, addressTextbox);
	}

	public void enterCityTextbox(String cityTextbox) {
		waitToElementVisible(driver,NewCustomerPageUI.CITY_TEXTBOX);
		senKeysToElement(driver, NewCustomerPageUI.CITY_TEXTBOX, cityTextbox);
	}

	public void enterStateTextbox(String stateTextbox) {
		waitToElementVisible(driver,NewCustomerPageUI.STATE_TEXTBOX);
		senKeysToElement(driver, NewCustomerPageUI.STATE_TEXTBOX, stateTextbox);
	}

	public void enterPINTextbox(String pinTextbox) {
		waitToElementVisible(driver,NewCustomerPageUI.PIN_TEXTBOX);
		senKeysToElement(driver, NewCustomerPageUI.PIN_TEXTBOX, pinTextbox);
	}

	public void enterTelephoneNumberTextbox(String telephoneNumberTextbox) {
		waitToElementVisible(driver,NewCustomerPageUI.TELEPHONE_NUMBER_TEXTBOX);
		senKeysToElement(driver, NewCustomerPageUI.TELEPHONE_NUMBER_TEXTBOX, telephoneNumberTextbox);
	}

	public void enterEmailTextbox(String emailTextbox) {
		waitToElementVisible(driver,NewCustomerPageUI.EMAIL_TEXTBOX);
		senKeysToElement(driver, NewCustomerPageUI.EMAIL_TEXTBOX, emailTextbox);
	}
	
	public void enterPasswordTextbox(String passwordTextbox) {
		waitToElementVisible(driver,NewCustomerPageUI.PASSWORD_TEXTBOX);
		senKeysToElement(driver, NewCustomerPageUI.PASSWORD_TEXTBOX, passwordTextbox);
	}

	public void clicktoSubmitButton() {
		waitToElementClickable(driver, NewCustomerPageUI.SUBMIT_BUTTON);
		clickToElement(driver, NewCustomerPageUI.SUBMIT_BUTTON);
	}

	
	public String getTextRegisterSuccess() {
		waitToElementVisible(driver, NewCustomerPageUI.MESSAGE_REGISTER_SUCCESS);
		return getElementText(driver, NewCustomerPageUI.MESSAGE_REGISTER_SUCCESS);
	}


	public String getInformationNameValue(String infomationName) {
		waitToElementVisible(driver, NewCustomerPageUI.INFORMATION_NAME, infomationName);
		return getElementText(driver, NewCustomerPageUI.INFORMATION_NAME, infomationName);
	}


	public void clickToCloseAd() {
		waitToElementVisible(driver, NewCustomerPageUI.CLOSE_AD);
//		clickToElement(driver, NewCustomerPageUI.CLOSE_AD);
		clickToElementByJS(driver, NewCustomerPageUI.CLOSE_AD);
		
	}

}
