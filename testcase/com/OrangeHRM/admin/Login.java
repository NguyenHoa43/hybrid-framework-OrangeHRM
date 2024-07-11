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
		public void TC_01_Login_Page() {
			loginPage.inputToUserNameTextBox(driver, userName);
			loginPage.inputToPasswordTextBox(driver, passWord);
			loginPage.clickToButtonLogin(driver);
		}
		
		@AfterClass(alwaysRun = true)
		public void afterClass() {
			closeBrowserDriver();
			
		}

}
