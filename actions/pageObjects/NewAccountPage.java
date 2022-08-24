package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.AbtractPage;

public class NewAccountPage extends AbtractPage{
	WebDriver driver;

	public NewAccountPage(WebDriver driver) {
		this.driver = driver;
	}
}
