package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.LoginPage;
import util.BrowserFactory;

public class LoginTest {

	WebDriver driver;
	
	@Test
	public void validUserShouldBeAbletoLogin() {
	
		driver = BrowserFactory.startBrowser();
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.enterUsername("techfiosdemo@gmail.com");
		loginPage.enterPassward("abc123");
		loginPage.clickonSubmit();
	}
}
