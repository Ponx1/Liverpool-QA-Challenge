package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogIn {
	@FindBy(id="username")
	WebElement username;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(id="email")
	WebElement userEmail;
	
	@FindBy(xpath="/html/body/main/section/div/div/div/form/div[2]/button")
	WebElement loginBtn;
	
	@FindBy(xpath="//div[contains(@class,'ulp-alternate-action')]/p/a")
	WebElement createAccountBtn;
	
	
	public LogIn(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void createAccount(String user, String pass) {
		this.createAccountBtn.click();
		this.userEmail.sendKeys(user);
		this.password.sendKeys(pass);
	}
	
	public void logIn(String user, String pass) {
		this.username.sendKeys(user);
		this.password.sendKeys(pass);
		this.loginBtn.click();
	}
}
