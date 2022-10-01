package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageGeneratorManage {
	
	public static LoginPage getLoginPageOject(WebDriver driver) {
		return new LoginPage(driver);
	}
	
	public static NewAccountPage getNewAccountPageOject(WebDriver driver) {
		return new NewAccountPage(driver);
	}
	
	public static EditCustomerPage getEditCustomerPageOject(WebDriver driver) {
		return new EditCustomerPage(driver);
	}
	
	public static NewCustomerPage getNewCustomerPageOject(WebDriver driver) {
		return new NewCustomerPage(driver);
	}
	
}
