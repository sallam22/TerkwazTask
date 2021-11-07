package Gui.testing;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.shaft.driver.DriverFactory;
import com.shaft.gui.browser.BrowserActions;


import Gui.Pages.ThirdTestPage;

public class thirdTest {
	private WebDriver driver;
	private ThirdTestPage  third;

	
  @Test
  public void ThirdTestSceniro() {
	  
	  third.ThirdTestCase();

  }
  
  
  
  @BeforeClass
  public void setup() {
		driver = DriverFactory.getDriver();
		third = new ThirdTestPage(driver);
	
	  BrowserActions.navigateToURL(driver,"https://the-internet.herokuapp.com/"  );
  	
  }
  @AfterClass
  public void teardown() {
  	
	  BrowserActions.closeCurrentWindow(driver);

  }
}
