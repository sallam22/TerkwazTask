package Gui.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import com.shaft.gui.element.ElementActions;
import com.shaft.validation.Validations;

public class SecondTestPage {
	private WebDriver driver;

	public SecondTestPage(WebDriver driver) {
		this.driver = driver;
		
		
	}
	// locators
		private By clickUpload=By.xpath("//a[contains(text(),'File Upload')]");
		private By chooseFile=By.xpath("//input[@id='file-upload']");
		private By submit=By.xpath("//input[@id='file-submit']");
		private By checkfileuploaded=By.xpath("//h3[contains(text(),'File Uploaded!')]");
		
	//Actions
	public void SecondTestCase() {
		
		new ElementActions(driver).click(clickUpload)
		.typeFileLocationForUpload(chooseFile, "E:\\RestAssured.PNG").click(submit);

		//assertion
		Validations.assertThat().element(driver, checkfileuploaded).text().doesNotEqual(checkfileuploaded).perform();
		
	}	
	
}
