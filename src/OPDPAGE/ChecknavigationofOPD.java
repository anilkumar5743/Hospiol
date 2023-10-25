package OPDPAGE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import CommonMethods.CommonMethods;

public class ChecknavigationofOPD {
	private WebDriver driver;
public ChecknavigationofOPD(WebDriver driver)
	{
		this.driver=driver;	
	}
public void clickonOPD() {
	By ElementOPD=By.xpath("//div[@class='billingbox-icon']");
	WebElement ELEMENTOPDL =driver.findElement(ElementOPD);
	ELEMENTOPDL.click();
}
public static void main(String[] args) {
	// TODO Auto-generated method stub
CommonMethods obj1 = new CommonMethods();
WebDriver driver =obj1.launchbrowser("Chrome","webdriver.chrome.driver","D:\\Selenium videos\\chromedriver\\Drivers\\chromedriver.exe");
obj1.openurl("http://hospiol.com/");
obj1.Clickonadmin();
obj1.Login("abhishek@marolix.com", "Reset@123");
obj1.Clickonbilling();
ChecknavigationofOPD obj2 = new ChecknavigationofOPD(driver);
obj2.clickonOPD();
obj1.closebrowser();

}
}
