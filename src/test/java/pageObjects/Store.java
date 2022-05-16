package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Store {
	
	@FindBy(xpath="//article/h5")
	List<WebElement> results;
	
	@FindBy(id="opc_pdp_buyNowButton")
	WebElement buyBtn;
	
	@FindBy(xpath="//h1")
	WebElement logInMessage;
	
	public Store(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public int getNumberOfresults() {
		return this.results.size();
	}
	
	public void clickInFirstResult() {
		this.results.get(0).click();
	}
	
	public void buyItem() {
		this.buyBtn.click();
	}
	
	
}
