package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
	
	@FindBy(id="mainSearchbar")
	WebElement searchBar;
	
	@FindBy(xpath="//div[@class='m-header__searchBar']/div/div/button")
	WebElement lookBtn;
	
	@FindBy(xpath="//span[@class='a-header__topLink']")
	WebElement logIn;
	
	public Home(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void searchForItem(String itemName) {
		this.searchBar.sendKeys(itemName);
		this.lookBtn.click();
	}
	
	public void clickOnLogin() {
		this.logIn.click();
	}
}
