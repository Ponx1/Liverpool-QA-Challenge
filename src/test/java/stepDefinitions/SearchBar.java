package stepDefinitions;

import org.junit.Assert;

import Module.TestContext;
import io.cucumber.java.en.When;
import pageObjects.Home;
import pageObjects.Store;

public class SearchBar {
	
	TestContext testContext;

	Home home;
	Store store;
	
	public SearchBar(TestContext context) {
		this.testContext = context;
		this.home = this.testContext.getPageObjectManager().getHome();
		this.store = this.testContext.getPageObjectManager().getStore();
	}
	
	@When("^I search for the item (.+)$")
    public void i_search_for_the_item(String item) throws Throwable {
		this.home.searchForItem(item);
    }

    @When("^I validate result items$")
    public void i_validate_result_items() throws Throwable {
    	Assert.assertTrue(this.store.getNumberOfresults()>0);
    }
}
