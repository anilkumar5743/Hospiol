package PathologyTest;

import org.openqa.selenium.WebDriver;

import CommonMethods.CommonMethods;
import Pathology.ChecknavigationofPathology;


public class CheckPathologyNavigationTest {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	CommonMethods obje1 = new CommonMethods();
	WebDriver driver =obje1.launchbrowser("Chrome","webdriver.chrome.driver","D:\\Selenium videos\\chromedriver\\Drivers\\chromedriver.exe");
	obje1.openurl("http://hospiol.com/");
	obje1.Clickonadmin();
	obje1.Login("abhishek@marolix.com", "Reset@123");
	obje1.Clickonbilling();
	ChecknavigationofPathology obje2 = new ChecknavigationofPathology(driver);
	obje2.clickonpathology();
	obje1.closebrowser();
	
		}
}
