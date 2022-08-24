package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.AbtractPage;

public class NewCustomerPage extends AbtractPage{
	WebDriver driver;

	public NewCustomerPage(WebDriver driver) {
		this.driver = driver;
	}
}
