package Gui.testing;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.shaft.driver.DriverFactory;
import com.shaft.gui.browser.BrowserActions;


import Gui.Pages.ThirdTestPage;
import io.qameta.allure.Description;

public class thirdTest {
	private WebDriver driver;
	private ThirdTestPage  third;

@Description("Given:Open Browser and Click on \"Dynamic Loading\"  and Click on \"Example 2\" and click start Then Check results")

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
