package commons;

import org.openqa.selenium.WebDriver;

import pageObjects.OrangeHRM.admin.AdminLoginPageObject;
import pageObjects.OrangeHRM.admin.DashboardOrangeHRMPageObject;



public class PageGeneratorManager {
	
	public static AdminLoginPageObject getAdminLoginPage(WebDriver driver) {
		return new AdminLoginPageObject(driver);
	}
	
	public static DashboardOrangeHRMPageObject getAdminDashboardPage(WebDriver driver) {
		return new DashboardOrangeHRMPageObject(driver);
	}

}
