package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageGeneratorManage {
	
	public static LoginPage getLoginPageOject(WebDriver driver) {
		return new LoginPage(driver);
	}
}
