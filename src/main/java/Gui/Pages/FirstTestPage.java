package Gui.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.shaft.gui.element.ElementActions;
import com.shaft.validation.Validations;

public class FirstTestPage {
	
	private WebDriver driver;

	public  FirstTestPage(WebDriver driver) {
		this.driver = driver;
	}
	
//Locators for elements
	
private  By Search=By.name("q");
private By Results=By.xpath("//body/div[@id='main']/div[@id='cnt']/div[@id='rcnt']/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/span[1]/span[1]");

//actions 
 
 public void FirstTestcase() {
	 
		new ElementActions(driver).type(Search, "selenium webdriver").keyPress(Search, Keys.ENTER);
		
		// assertion that third value is What is Selenium WebDriver?

		Validations.assertThat().element(driver, Results).text().doesNotEqual(Results).perform();



 }
 
}