package Module;

public class TestContext {
	
	private WebDriverCreator webDriverCreator;
	private PageObjectManager pageObjectManager;
	
	public TestContext() {
		this.webDriverCreator = new WebDriverCreator();
		this.pageObjectManager = new PageObjectManager(this.webDriverCreator.getWebDriver());
	}
	
	
	public WebDriverCreator getWebDriverCreator() {
		return webDriverCreator;
	}

	public PageObjectManager getPageObjectManager() {
		return pageObjectManager;
	}

}
