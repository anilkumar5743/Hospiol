package OPDtest;

import org.openqa.selenium.WebDriver;

import CommonMethods.CommonMethods;
import OPDPAGE.ChecknavigationofOPD;
import OPDPAGE.checksearchbarbyname;
import OPDPAGE.checksearchbarbypatientID;

public class checksearchbyidtest {
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
		checksearchbarbypatientID obj5 = new checksearchbarbypatientID(driver);
		obj5.CheckbID("234");
		
		
		//obj3.checkbypartialname("anil");
		Thread.sleep(3000);
		obj5.Searchlist("234");
		Thread.sleep(3000);
		obj5.clearsearchbox();
		Thread.sleep(3000);
		obj5.checkbyinvalid_id("4332");
		Thread.sleep(3000);
		obj5.Searchlist("4332");
		Thread.sleep(3000);
		obj1.closebrowser();		
				
			}
		
		
}
	
