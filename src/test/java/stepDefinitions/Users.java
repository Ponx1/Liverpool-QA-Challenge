package stepDefinitions;

import Module.TestContext;
import io.cucumber.java.en.Then;
import pageObjects.Home;
import pageObjects.LogIn;
import pageObjects.Store;

public class Users {
	
	TestContext testContext;

	Home home;
	Store store;
	LogIn login;
	
	public Users(TestContext context) {
		this.testContext = context;
		this.home = this.testContext.getPageObjectManager().getHome();
		this.store = this.testContext.getPageObjectManager().getStore();
		this.login = this.testContext.getPageObjectManager().getLogIn();
	}
	
	@Then("^I create a user with (.+) , (.+)$")
    public void i_create_a_user_with_(String user, String password) throws Throwable {
		this.home.clickOnLogin();
		this.login.createAccount(user, password);
		
    }
}
