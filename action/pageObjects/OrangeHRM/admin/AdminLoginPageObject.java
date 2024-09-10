package pageObjects.OrangeHRM.admin;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageUIs.OrangeHRM.admin.AdminOrangeHRMPageUIs;

public class AdminLoginPageObject extends BasePage{
	private WebDriver driver;
	
	public AdminLoginPageObject(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public void inputToUserNameTextBox(WebDriver driver, String value) {
		waitForElementVisible(driver, AdminOrangeHRMPageUIs.INPUT_USERNAME);
		sendkeysToElement(driver, AdminOrangeHRMPageUIs.INPUT_USERNAME, value);
	}
	public void inputToPasswordTextBox(WebDriver driver, String value) {
		waitForElementVisible(driver, AdminOrangeHRMPageUIs.INPUT_PASSWORD);
		sendkeysToElement(driver, AdminOrangeHRMPageUIs.INPUT_PASSWORD, value);
	}
	
	public void clickToButtonLogin(WebDriver driver) {
		waitForElementClickable(driver, AdminOrangeHRMPageUIs.LOGIN_LINK);
		clickToElement(driver, AdminOrangeHRMPageUIs.LOGIN_LINK);
	}
	
	public String getTextErrorMessage(WebDriver driver) {
		waitForElementVisible(driver, AdminOrangeHRMPageUIs.ERROR_MASSAGE);
		return getElementText(driver, AdminOrangeHRMPageUIs.ERROR_MASSAGE);
		
	}
	public String getTextErrorMessageWrongUser(WebDriver driver) {
		waitForElementVisible(driver, AdminOrangeHRMPageUIs.ERROR_MASSAGE_WRONG_USER);
		return getElementText(driver, AdminOrangeHRMPageUIs.ERROR_MASSAGE_WRONG_USER);
		
	}
	public String getTextErrorMessageWrongPassword(WebDriver driver) {
		waitForElementVisible(driver, AdminOrangeHRMPageUIs.ERROR_MASSAGE_WRONG_USER);
		return getElementText(driver, AdminOrangeHRMPageUIs.ERROR_MASSAGE_WRONG_USER);
		
	}
	
	public boolean isErrorDisplay(WebDriver driver) {
		waitForElementVisible(driver, AdminOrangeHRMPageUIs.ERROR_MASSAGE);
		return isElementDisplay(driver, AdminOrangeHRMPageUIs.ERROR_MASSAGE);
	}
}
