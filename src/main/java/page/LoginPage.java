package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
this.driver = driver;
	}

	// library for elements
//	WebElement UserNameFiel_Element= driver.findElement(By.id("hkjh"));
//	By Password_field_locator = By.id("abc");
	@FindBy(how = How.ID, using = "username")
	WebElement UserName;

	@FindBy(how = How.ID, using = "password")
	WebElement Password;

	@FindBy(how = How.NAME, using = "login")
	WebElement Submit;

	// methods to interact with the element
	public void enterUsername(String userName) {
		UserName.sendKeys(userName);

	}

	public void enterPassward(String password) {
		Password.sendKeys(password);
	}

	public void clickonSubmit() {
		Submit.click();
	}
}
