package stepDefinitions;

import org.junit.Assert;

import Module.TestContext;
import io.cucumber.java.en.When;
import pageObjects.Home;
import pageObjects.LogIn;
import pageObjects.Store;

public class BuyingSmartTV {
	
	TestContext testContext;

	Home home;
	Store store;
	LogIn login;
	
	public BuyingSmartTV(TestContext context) {
		this.testContext = context;
		this.home = this.testContext.getPageObjectManager().getHome();
		this.store = this.testContext.getPageObjectManager().getStore();
		this.login = this.testContext.getPageObjectManager().getLogIn();
	}
	
	@When("^I buy a smart TV$")
    public void i_buy_a_smart_tv() throws Throwable {
		this.store.clickInFirstResult();
		this.store.buyItem();
		this.login.logIn("test@mailinator.com", "TestApex1234");
    }
}
