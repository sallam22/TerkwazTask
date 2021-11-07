package Gui.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.shaft.gui.element.ElementActions;
import com.shaft.validation.Validations;


public class ThirdTestPage {
	private WebDriver driver;

	public ThirdTestPage (WebDriver driver) {
		this.driver = driver;
	}
	
	//locators
	 private By clickDynamicload=By.xpath("//a[contains(text(),'Dynamic Loading')]");
	 private By clickExample2=By.xpath("//a[contains(text(),'Example 2: Element rendered after the fact')]");
	 private By clickStart=By.xpath("//button[contains(text(),'Start')]");
	 private By checkText=By.xpath("//h4[contains(text(),'Hello World!')]");
	 
	//actions
	 public void ThirdTestCase() {
		 
		new ElementActions(driver).click(clickDynamicload).click(clickExample2).click(clickStart);

		//assertion
		
		Validations.assertThat().element(driver, checkText).text().doesNotEqual(checkText).perform();
		 
	 }
	
		
}
