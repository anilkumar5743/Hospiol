package PathologyTest;

import org.openqa.selenium.WebDriver;

import CommonMethods.CommonMethods;
import OPDPAGE.ChecknavigationofOPD;
import OPDPAGE.checksearchbarbyname;
import OPDPAGE.checksearchbarbypatientID;
import Pathology.ChecknavigationofPathology;
import Pathology.checksearchbarbypatientIDPathology;

public class checksearchbyidpathologytest {
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
		checksearchbarbypatientIDPathology obje5 = new checksearchbarbypatientIDPathology(driver);
		obje5.CheckbID("234");
		
		
		//obj3.checkbypartialname("anil");
		Thread.sleep(3000);
		obje5.Searchlist("234");
		Thread.sleep(3000);
		obje5.clearsearchbox();
		Thread.sleep(3000);
		obje5.checkbyinvalid_id("4332");
		Thread.sleep(3000);
		obje5.Searchlist("4332");
		Thread.sleep(3000);
		obje1.closebrowser();		
				
			}
		
		
}
	
