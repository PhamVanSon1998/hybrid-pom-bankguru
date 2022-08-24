package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.AbtractPage;

public class DeleteCustomerPage extends AbtractPage{
	WebDriver driver;

	public DeleteCustomerPage(WebDriver driver) {
		this.driver = driver;
	}
}
