package Gui.testing;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.shaft.driver.DriverFactory;
import com.shaft.gui.browser.BrowserActions;

import Gui.Pages.FirstTestPage;
import io.qameta.allure.Description;


public class firstTest {
	private WebDriver driver;
	private FirstTestPage first;

@Description("Given:Open Browser and Search for \"selenium webdriver\" Then Check results")

  @Test
  public void FirstTestSceniro() {
	  
	  
	  first.FirstTestcase();

  }
  
  
  
  @BeforeClass
  public void setup() {
		driver = DriverFactory.getDriver();
		first = new FirstTestPage(driver);
	
	  BrowserActions.navigateToURL(driver,"https://www.google.com/ncr" );
  	
  }
  @AfterClass
  public void teardown() {
  	
	  BrowserActions.closeCurrentWindow(driver);


  }
}
