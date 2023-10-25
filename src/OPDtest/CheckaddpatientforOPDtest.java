package OPDtest;

import org.openqa.selenium.WebDriver;

import CommonMethods.CommonMethods;
import OPDPAGE.CheckaddpatientforOPD;
import OPDPAGE.ChecknavigationofOPD;

public class CheckaddpatientforOPDtest {

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
CheckaddpatientforOPD obj6 = new CheckaddpatientforOPD(driver);

obj6.clickonaddpatient();
Thread.sleep(3000);
obj6.Clickonsearchpatient();
Thread.sleep(3000);
obj6.sendpatientnameonsearch("ani");
Thread.sleep(3000);
obj6.clickonselectpatient("ani");
Thread.sleep(3000);
obj6.gettext();
Thread.sleep(3000);
obj6.clickonDate();
Thread.sleep(3000);
obj6.selectcasuality();
Thread.sleep(3000);
obj6.Oldpatient(1);
Thread.sleep(3000);
obj6.TPA(5);
Thread.sleep(3000);
obj6.Doctorconsult(4);
Thread.sleep(3000);
obj6.chargecategeory(4);
Thread.sleep(3000);
obj6.costselect();
Thread.sleep(3000);
obj6.appliedcharge("1700.00");
Thread.sleep(3000);
obj6.payemntmode();
Thread.sleep(3000);
obj6.Paidmoney("1700.00");
obj6.savebutton();
//obj1.closebrowser();

	}

}
