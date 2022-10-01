package pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Keyboard;

import commons.AbtractPage;
import pageUIs.EditCustomerPageUI;

public class EditCustomerPage extends AbtractPage {
	WebDriver driver;

	public EditCustomerPage(WebDriver driver) {
		this.driver = driver;
	}

	public void inputToTextboxInEditCustomerPageByName(String informationValue, String textboxValue) {
		waitToElementVisible(driver, EditCustomerPageUI.INFORMATION_TEXTBOX_VALUE, informationValue);
		senKeysToElement(driver, EditCustomerPageUI.INFORMATION_TEXTBOX_VALUE, textboxValue, informationValue);

	}

	public void clickToSubmitButton() {
		waitToElementClickable(driver, EditCustomerPageUI.SUBMIT_BUTTON);
		clickToElement(driver, EditCustomerPageUI.SUBMIT_BUTTON);
	}

	public String getMessageEditCustomerSuccess() {
		waitToElementVisible(driver, EditCustomerPageUI.MESSAGE_EDITCUSTOMER_SUCCESS);
		return getElementText(driver, EditCustomerPageUI.MESSAGE_EDITCUSTOMER_SUCCESS);
	}

	public void clickToSubmitButtonToNavigateEDitPage() {
		waitToElementClickable(driver, EditCustomerPageUI.SUBMIT_BUTTON_TO_NAVIGATE_EDIT_CUSTOMER_PAGE);
		clickToElement(driver, EditCustomerPageUI.SUBMIT_BUTTON_TO_NAVIGATE_EDIT_CUSTOMER_PAGE);
	}

	public void inputToTextareaInEditCustomerPageByName(String informationValue, String textareaValue) {
		waitToElementVisible(driver, EditCustomerPageUI.INFORMATION_TEXTAREA_VALUE, informationValue);
		senKeysToElement(driver, EditCustomerPageUI.INFORMATION_TEXTAREA_VALUE, textareaValue, informationValue);

	}

	public void accessToAllert() {
		acceptAlert(driver);
//		Actions action= new Actions(driver);
//		action.sendKeys(Keys.ESCAPE).perform();
	}

	public String getValueTextboxInformationEdit(String fieldName) {
		waitToElementVisible(driver, EditCustomerPageUI.INFORMATION_TEXTBOX_VALUE, fieldName);
		return getElementAttribute(driver, EditCustomerPageUI.INFORMATION_TEXTBOX_VALUE, "value", fieldName);
	}

	public String getValueTextareaInformationEdit(String fieldName) {
		waitToElementVisible(driver, EditCustomerPageUI.INFORMATION_TEXTAREA_VALUE, fieldName);
		return getElementAttribute(driver, EditCustomerPageUI.INFORMATION_TEXTAREA_VALUE, "value", fieldName);
	}

}
