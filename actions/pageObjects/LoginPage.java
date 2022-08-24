package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.AbtractPage;
import pageUIs.LoginPageUI;

public class LoginPage extends AbtractPage{
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public void enterEmailTextbox(String emailTextbox) {
		waitToElementVisible(driver, LoginPageUI.EMAIL_TEXTBOX);
		senKeysToElement(driver, LoginPageUI.EMAIL_TEXTBOX, emailTextbox);
	}

	public void clickToSubmitButton() {
		waitToElementClickable(driver, LoginPageUI.SUBMIT_BUTTON);
		clickToElement(driver,LoginPageUI.SUBMIT_BUTTON);
	}

	public String getTextUserIDValue() {
		waitToElementVisible(driver, LoginPageUI.USER_ID);
		return getElementText(driver, LoginPageUI.USER_ID);
	}

	public String getTextPasswordValue() {
		waitToElementVisible(driver, LoginPageUI.PASSWORD);
		return getElementText(driver, LoginPageUI.PASSWORD);
	}

	public void clickToNavbarLink(String navbarLink) {
		waitToElementClickable(driver, LoginPageUI.NAVBAR_LINK,navbarLink);
		clickToElement(driver,LoginPageUI.NAVBAR_LINK,navbarLink);
	}

	public void enterUserIDTextbox(String userIDTextbox) {
		waitToElementVisible(driver, LoginPageUI.USER_ID_TEXTBOX);
		senKeysToElement(driver, LoginPageUI.USER_ID_TEXTBOX, userIDTextbox);
	}

	public void enterPasswordTextbox (String passwordTextbox) {
		waitToElementVisible(driver, LoginPageUI.PASSWORD_TEXTBOX);
		senKeysToElement(driver, LoginPageUI.PASSWORD_TEXTBOX, passwordTextbox);
	}

	public void clickToLoginButton() {
		waitToElementClickable(driver, LoginPageUI.LOGIN_BUTTON);
		clickToElement(driver,LoginPageUI.LOGIN_BUTTON);
	}

}
