package OPDtest;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;

import CommonMethods.CommonMethods;
import OPDPAGE.CheckNewpatientforOPD;
import OPDPAGE.CheckaddpatientforOPD;
import OPDPAGE.ChecknavigationofOPD;

public class CheckNewPatientforOPDtest {
	public static void main(String[] args) throws InterruptedException, AWTException {
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
CheckNewpatientforOPD obj7 = new CheckNewpatientforOPD(driver);
obj7.clickonNewPatient();
Thread.sleep(3000);
obj7.Enterpatientname("Pushpalatha Kadiyala");
obj7.Enterguardianname("Anilkumar Kadiyala");
obj7.SelectGender(2);
obj7.selectDate();
Thread.sleep(3000);
obj7.Age();

obj7.BloodGroup(3);
obj7.Marrige(2);
obj7.getcolor();
obj7.enterPh("7893723206");
obj7.Email("pushpaanil@gmail.com");
obj7.Address("waverock");
obj7.save();
}
}