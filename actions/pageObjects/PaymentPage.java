package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.AbtractPage;

public class PaymentPage extends AbtractPage{
	WebDriver driver;

	public PaymentPage(WebDriver driver) {
		this.driver = driver;
	}
}
