package pageObjects.OrangeHRM.admin;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageUIs.OrangeHRM.admin.AdminOrangeHRMPageUI;

public class AdminLoginPageObject extends BasePage{
	private WebDriver driver;
	
	public AdminLoginPageObject(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public void inputToUserNameTextBox(WebDriver driver, String value) {
		waitForElementVisible(driver, AdminOrangeHRMPageUI.INPUT_USERNAME);
		sendkeysToElement(driver, AdminOrangeHRMPageUI.INPUT_USERNAME, value);
	}
	public void inputToPasswordTextBox(WebDriver driver, String value) {
		waitForElementVisible(driver, AdminOrangeHRMPageUI.INPUT_PASSWORD);
		sendkeysToElement(driver, AdminOrangeHRMPageUI.INPUT_PASSWORD, value);
	}
	
	public void clickToButtonLogin(WebDriver driver) {
		waitForElementClickable(driver, AdminOrangeHRMPageUI.LOGIN_LINK);
		clickToElement(driver, AdminOrangeHRMPageUI.LOGIN_LINK);
	}
}
