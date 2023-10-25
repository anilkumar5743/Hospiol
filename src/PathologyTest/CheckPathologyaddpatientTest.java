package PathologyTest;

import org.openqa.selenium.WebDriver;

import CommonMethods.CommonMethods;
import Pathology.CheckaddpatientforPathology;
import Pathology.ChecknavigationofPathology;


public class CheckPathologyaddpatientTest {
	
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
	CommonMethods obje1 = new CommonMethods();
	WebDriver driver =obje1.launchbrowser("Chrome","webdriver.chrome.driver","D:\\Selenium videos\\chromedriver\\Drivers\\chromedriver.exe");
	obje1.openurl("http://hospiol.com/");
	obje1.Clickonadmin();
	obje1.Login("abhishek@marolix.com", "Reset@123");
	obje1.Clickonbilling();
	ChecknavigationofPathology obje2 = new ChecknavigationofPathology(driver);
	obje2.clickonpathology();
	CheckaddpatientforPathology obje5 = new CheckaddpatientforPathology(driver);
	obje5.clickonaddpatient();
	obje5.Clickonsearchpatient();
	//obje1.closebrowser();
	
		}
}
