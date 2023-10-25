package PathologyTest;

import org.openqa.selenium.WebDriver;

import CommonMethods.CommonMethods;
import Pathology.ChecknavigationofPathology;
import Pathology.checksearchbarbynamepathology;

public class checksearcbynamepathology {

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
checksearchbarbynamepathology obje3= new checksearchbarbynamepathology(driver);
//obje3.Checkbyfullname("anilkumarchowdary1");
obje3.checkbypartialname("anil");
//Thread.sleep(3000);
//obj3.Searchlist("anil");
obje1.closebrowser();
}
}