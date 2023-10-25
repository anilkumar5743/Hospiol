package Pathology;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


	public class ChecknavigationofPathology {
		private WebDriver driver;
	public ChecknavigationofPathology(WebDriver driver)
		{
			this.driver=driver;	
		}
	
public void clickonpathology() {
	By ElementPL=By.xpath("//div[@class='billingbox-icon']/i[@class='fas fa-flask']");
	WebElement ELEMENTPLL =driver.findElement(ElementPL);
	ELEMENTPLL.click();
}
}
