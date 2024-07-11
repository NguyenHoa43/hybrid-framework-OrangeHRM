package commons;

import org.openqa.selenium.WebDriver;

import pageObjects.OrangeHRM.admin.AdminLoginPageObject;



public class PageGeneratorManager {
	
	public static AdminLoginPageObject getAdminLoginPage(WebDriver driver) {
		return new AdminLoginPageObject(driver);
	}
	

}
