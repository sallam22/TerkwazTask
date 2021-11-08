package Gui.testing;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.shaft.driver.DriverFactory;
import com.shaft.gui.browser.BrowserActions;


import Gui.Pages.SecondTestPage;
import io.qameta.allure.Description;

public class secondTest {
	private WebDriver driver;
	private SecondTestPage  second;

	@Description("Given:Open Browser and Click on \"File Upload\"  and Upload any small image file Then Check results")

  @Test
  public void SecondTestSceniro() {
	  
	  
	  second.SecondTestCase();

  }
  
  
  
  @BeforeClass
  public void setup() {
		driver = DriverFactory.getDriver();
		second = new SecondTestPage(driver);
	
	  BrowserActions.navigateToURL(driver,"https://the-internet.herokuapp.com/"  );
  	
  }
  @AfterClass
  public void teardown() {
  	
	  BrowserActions.closeCurrentWindow(driver);


  }
}
