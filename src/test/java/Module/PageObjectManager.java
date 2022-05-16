package Module;

import org.openqa.selenium.WebDriver;

import pageObjects.Home;
import pageObjects.LogIn;
import pageObjects.Store;

public class PageObjectManager {
	
	public WebDriver driver;
	
	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}
	
	public Home getHome() {
		return new Home(driver);
	}
	
	public Store getStore() {
		return new Store(driver);
	}
	
	public LogIn getLogIn() {
		return new LogIn(driver);
	}
}
