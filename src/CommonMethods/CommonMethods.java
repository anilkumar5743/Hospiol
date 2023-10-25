package CommonMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CommonMethods {
	
		public static WebDriver driver;
		public static WebDriver launchbrowser(String Browsername ,String drivername,String driverpath) {
			System.setProperty(drivername, driverpath);
			if(Browsername.equals("Chrome"))
				
			
			driver = new ChromeDriver();
			
			else 
				driver = new EdgeDriver();
			
		return driver;    // here we need to return the driver for the NOP pages or googlepagetest in case we not use inheritance i e extends keyword.
		}
		public static void openurl(String url) {
			driver.get(url);
			driver.manage().window().maximize();
		}
		public static void Clickonadmin() {
			By element=	By.xpath("//a[@class='theme_btn theme_btn_bg']");
			WebElement elementL= driver.findElement(element);
			elementL.click();
		}
		public static void Login(String Username , String Password) {
			By ElementLogin=By.xpath("//input[@name='username']");
			WebElement ELEMENTLOGINL =driver.findElement(ElementLogin);
			ELEMENTLOGINL.sendKeys(Username);
			By Elementpass=By.xpath("//input[@type ='password']");
			WebElement ELEMENTpassL =driver.findElement(Elementpass);
			ELEMENTpassL.sendKeys(Password);
			By Elementsign=By.xpath("//button[@type='submit']");
			WebElement ELEMENTsignL =driver.findElement(Elementsign);
			ELEMENTsignL.click();
		}
		public static void Clickonbilling() {
			By Elementbilling=By.xpath("//i[@class='fas fa-file-invoice']");
			WebElement ELEMENTbillingL =driver.findElement(Elementbilling);
			ELEMENTbillingL.click();
		}
		public static void closebrowser() {
			driver.close();
		}
}
