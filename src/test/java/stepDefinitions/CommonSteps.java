package stepDefinitions;

import Module.PageObjectManager;
import Module.TestContext;
import Module.WebDriverCreator;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageObjects.Home;

public class CommonSteps {
	
	TestContext testContext;

	Home home;
	
	public CommonSteps(TestContext context) {
		this.testContext = context;
		this.home = this.testContext.getPageObjectManager().getHome();
	}

	@Given("^I open the home page \"([^\"]*)\"$")
	public void i_open_the_home_page_something(String url) throws Throwable {
		this.testContext.getWebDriverCreator().getWebDriver().get(url);
	}

	@Then("^I close the browser$")
	public void i_close_the_browser() throws Throwable {
		this.testContext.getWebDriverCreator().getWebDriver().quit();
	}

}
