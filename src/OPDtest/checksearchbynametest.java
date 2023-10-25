package OPDtest;

import org.openqa.selenium.WebDriver;

import CommonMethods.CommonMethods;
import OPDPAGE.ChecknavigationofOPD;
import OPDPAGE.checksearchbarbyname;

public class checksearchbynametest {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		CommonMethods obj1 = new CommonMethods();
WebDriver driver =obj1.launchbrowser("Chrome","webdriver.chrome.driver","D:\\Selenium videos\\chromedriver\\Drivers\\chromedriver.exe");
obj1.openurl("http://hospiol.com/");
obj1.Clickonadmin();
obj1.Login("abhishek@marolix.com", "Reset@123");
obj1.Clickonbilling();
ChecknavigationofOPD obj2 = new ChecknavigationofOPD(driver);
obj2.clickonOPD();
checksearchbarbyname obj3 = new checksearchbarbyname(driver);
obj3.Checkbyfullname("anilkumarchowdary1");
//obj3.checkbypartialname("anil");
Thread.sleep(3000);
obj3.Searchlist("anil");


obj1.closebrowser();		
}

}
	
