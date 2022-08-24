package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.AbtractPage;

public class EditCustomerPage extends AbtractPage{
	WebDriver driver;

	public EditCustomerPage(WebDriver driver) {
		this.driver = driver;
	}
}
