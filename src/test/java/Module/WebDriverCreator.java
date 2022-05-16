package Module;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverCreator {
	
	public WebDriver driver;
	public Properties properties;
	String browserName;
	int implicitWait, pageTimeout;
	
	public WebDriver getWebDriver() {
		if(driver == null) driver = createWebDriver();
		return driver;
	}
	
	public WebDriver createWebDriver() {
		this.properties = new Properties();
		
		try {
			
			FileInputStream configFile = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\resources\\config.properties");
			this.properties.load(configFile);
			this.browserName = this.properties.getProperty("browser");
			this.implicitWait = Integer.valueOf(this.properties.getProperty("implicitWait"));
			this.pageTimeout = Integer.valueOf(this.properties.getProperty("pageTimeout"));
			
			if(this.browserName.contains("chrome")) {
				System.out.println("Starting: "+this.browserName);
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
			}else if (this.browserName.contains("firefox")) {
				System.out.println("Starting: "+this.browserName);
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
			} else if (this.browserName.contains("edge")) {
				System.out.println("Starting: "+this.browserName);
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
			} else {
				System.out.println("Starting default");
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
			}
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(this.implicitWait));
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(this.pageTimeout));
			
		} catch (IOException e) {
			System.out.println("Config file not loaded");
			e.printStackTrace();
			
		} 
		return driver;
	}
}
