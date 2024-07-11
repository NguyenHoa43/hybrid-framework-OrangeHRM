package com.OrangeHRM.admin;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commons.BaseTest;
import commons.PageGeneratorManager;
import pageObjects.OrangeHRM.admin.AdminLoginPageObject;

public class Login extends BaseTest{
	
	private WebDriver driver;
	private String emailAddress, userName, passWord;
	private AdminLoginPageObject loginPage;
	
	@Parameters("browser")
	@BeforeClass
	public void beforeClass(String browserName) {
		driver = getBrowserDriver(browserName);
		loginPage = PageGeneratorManager.getAdminLoginPage(driver);
		userName = "automationdhoa";
		passWord = "Hoabeo@43#";
		emailAddress = "afc" + fadeNumber() + "@gmail.com";
		
	}

	
		
		@Test
		public void TC_01_Login_Page_Not_User() {
			loginPage.inputToUserNameTextBox(driver, "    ");
			loginPage.inputToPasswordTextBox(driver, passWord);
			loginPage.clickToButtonLogin(driver);
			verifyEquals(loginPage.getTextErrorMessage(driver), "Required");
		}
		@Test
		public void TC_02_Login_Page_Not_Password() {
			loginPage.refreshToPage(driver);
			loginPage.inputToUserNameTextBox(driver, userName);
			loginPage.inputToPasswordTextBox(driver, "     ");
			loginPage.clickToButtonLogin(driver);
			verifyEquals(loginPage.getTextErrorMessage(driver), "Required");
		}
		@Test
		public void TC_03_Login_Page_Wrong_User() {
			loginPage.refreshToPage(driver);
			loginPage.inputToUserNameTextBox(driver, "abcAxs");
			loginPage.inputToPasswordTextBox(driver, passWord);
			loginPage.clickToButtonLogin(driver);
			verifyEquals(loginPage.getTextErrorMessageWrongUser(driver), "Invalid credentials");
		}
		@Test
		public void TC_04_Login_Page_Wrong_Password() {
			loginPage.refreshToPage(driver);
			loginPage.inputToUserNameTextBox(driver, userName);
			loginPage.inputToPasswordTextBox(driver, "abjchcac12");
			loginPage.clickToButtonLogin(driver);
			verifyEquals(loginPage.getTextErrorMessageWrongPassword(driver), "Invalid credentials");
		}
		
		@Test
		public void TC_05_Login_Page_Successfull() {
			loginPage.refreshToPage(driver);
			loginPage.inputToUserNameTextBox(driver, userName);
			loginPage.inputToPasswordTextBox(driver, passWord);
			loginPage.clickToButtonLogin(driver);
			
		}
		
		@AfterClass(alwaysRun = true)
		public void afterClass() {
			closeBrowserDriver();
			
		}

}
