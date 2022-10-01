package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.AbtractPage;
import pageUIs.NewAccountPageUI;

public class NewAccountPage extends AbtractPage{
	WebDriver driver;

	public NewAccountPage(WebDriver driver) {
		this.driver = driver;
	}

	public void inputToFieldNameTextboxWithName(String fileNameTextbox, String value) {
		waitToElementVisible(driver, NewAccountPageUI.FIELD_NAME_TEXTBOX,fileNameTextbox);
		senKeysToElement(driver, NewAccountPageUI.FIELD_NAME_TEXTBOX,value, fileNameTextbox);
	}

	public void sellectToAccountTypeDropdown(String accountTypeDropdown) {
		waitToElementVisible(driver, NewAccountPageUI.ACCOUNT_TYPE_TEXTBOX);
		selectItemInDropdown(driver, NewAccountPageUI.ACCOUNT_TYPE_TEXTBOX, accountTypeDropdown);
		
	}

	public void clickToSubmitButton() {
		waitToElementClickable(driver, NewAccountPageUI.SUBMIT_BUTTON);
		clickToElement(driver,  NewAccountPageUI.SUBMIT_BUTTON);
		
	}

	public String getMesaageNewAccountSuccesss() {
		waitToElementVisible(driver, NewAccountPageUI.MESSAGE_SUCCESS);
		return getElementText(driver, NewAccountPageUI.MESSAGE_SUCCESS);
	}

	public String getInformationAccountCorrect(String fileNameAccount) {
		waitToElementVisible(driver, NewAccountPageUI.INFORMATION_ACCOUNT,fileNameAccount);
		return getElementText(driver, NewAccountPageUI.INFORMATION_ACCOUNT,fileNameAccount);
	}
}
