package OPDPAGE;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;

import CommonMethods.CommonMethods;

public class CheckaddpatientforOPD {
	
	String data;
	String data1;
	String name2;
	String name3;
	WebElement ELEMENTAPSL;
	 
private WebDriver driver;
public CheckaddpatientforOPD(WebDriver driver)
{
	this.driver=driver;
}
public void clickonaddpatient() {
	By ElementAp=By.xpath("//a[@class='btn btn-primary btn-sm addpatient']");
	WebElement ELEMENTapL =driver.findElement(ElementAp);
	ELEMENTapL.click();
}
public WebElement Clickonsearchpatient() throws InterruptedException {
	By ElementAPS=By.xpath("//span[@class='select2-selection select2-selection--single' and @aria-labelledby = 'select2-addpatient_id-container']");
	WebElement ELEMENTAPSL =driver.findElement(ElementAPS);
	Actions action1 = new Actions(driver);
	action1.moveToElement(ELEMENTAPSL).build().perform();
	ELEMENTAPSL.click();
	Thread.sleep(3000); 
	return ELEMENTAPSL;
}
public void sendpatientnameonsearch(String patientname) {
	 
	By ElementAPE = By.xpath("//input[@class='select2-search__field']");
    WebElement ELEMENTAPEL = driver.findElement(ElementAPE);
    ELEMENTAPEL.sendKeys(patientname);
    
  //  ELEMENTAPEL.clear();
  
    // Wait for the dropdown options to appear
  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    By dropdownOption = By.xpath("//li[@class='select2-results__option']");
  wait.until(ExpectedConditions.visibilityOfElementLocated(dropdownOption));
   List<WebElement> allOptions = driver.findElements(dropdownOption);
  // wait.until(ExpectedConditions.visibilityOfAllElements(allOptions));
   System.out.println("searched patient list");
    
   for (WebElement ele : allOptions) {
       data = ele.getText();
       
       System.out.println(data);
       
       
}
   if(data.contentEquals("No results found")) {
	   System.out.println("no data found with error message " + data);
	   driver.close();
   }

   else if(data.contains(patientname)) {
		System.out.println("enter name contains list from dashboard");
		
	}
   
	else {
		System.out.println("enter data is invalid");
		
		driver.close();
	}


}
public void sendpatientnameonsearch(String fullpatientname,int singlename ) {
	
	By ElementAPE = By.xpath("//input[@class='select2-search__field']");
    WebElement ELEMENTAPEL = driver.findElement(ElementAPE);
    ELEMENTAPEL.sendKeys(fullpatientname);
    
  //  ELEMENTAPEL.clear();
  
    // Wait for the dropdown options to appear
  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    By dropdownOption = By.xpath("//li[@class='select2-results__option select2-results__option--highlighted']");
  wait.until(ExpectedConditions.visibilityOfElementLocated(dropdownOption));
   List<WebElement> allOptions = driver.findElements(dropdownOption);
  // wait.until(ExpectedConditions.visibilityOfAllElements(allOptions));
   
    
   for (WebElement ele : allOptions) {
       data1 = ele.getText();
       
       if(data1.contains(fullpatientname)) {
   		System.out.println("enter name contains list from dashboard");
   		System.out.println(data1);
   	}
   	else {
   		System.out.println("enter data is invalid patient not found");
   		driver.close();
   	}

}
   
}
public void clickonselectpatient(String Partialname) {
	 By Elementname = By.xpath("//li[@class='select2-results__option'][2]");
	   WebElement ELEMENTnameL = driver.findElement(Elementname);
	   ELEMENTnameL.click();
	  
	   
	   
}
public void gettext() {
	By elementtext=By.id("select2-addpatient_id-container");
	WebElement elemnettextL=driver.findElement(elementtext);
	String seletcedname =elemnettextL.getText();
	
	System.out.println("Selected data from list of patient " + elemnettextL.getText());
}
public void clickonselectpatient(String fullname, int singledata) {
	 By ElementFname = By.xpath("//li[@class='select2-results__option select2-results__option--highlighted']");
	   WebElement ELEMENTFnameL = driver.findElement(ElementFname);
	   ELEMENTFnameL.click();
}
public void clickonDate() {
	By Elementdate = By.xpath("//input[@class='form-control datetime']");
	   WebElement ELEMENTdateL = driver.findElement(Elementdate);
	   
	   ELEMENTdateL.click();
	   ELEMENTdateL.sendKeys(Keys.ENTER);
	String date=   ELEMENTdateL.getText();
	System.out.println("Date"+date);
}
public void selectcasuality() {
	By Elementcasualty = By.xpath("//select[@name='casualty']");
	   WebElement ELEMENTcasualtyL = driver.findElement(Elementcasualty);
	   Select select = new Select(ELEMENTcasualtyL);
	  select.selectByIndex(1);
	WebElement selectone=  select.getFirstSelectedOption();
	String selectedtext= selectone.getText();
	System.out.println("selected text from dropdown for casulaity is  "+ selectedtext);
	   
}
public void Oldpatient(int index1) {
	By Elementold_patient = By.xpath("//select[@name='old_patient']");
	   WebElement ELEMENTold_patientL = driver.findElement(Elementold_patient);
	   
	   
	   Select select1 = new Select(ELEMENTold_patientL);
		List<WebElement> patientupdate= select1.getOptions();
		System.out.println("patient upadte ");
		 for(WebElement ele1 : patientupdate ) {
			 name2 =ele1.getText();
			 
			System.out.println(name2);
			
}

		 select1.selectByIndex(index1);
		 WebElement selectone1=  select1.getFirstSelectedOption();
			String selectedtext1= selectone1.getText();
			System.out.println("selected text from dropdown for patient is  "+ selectedtext1);
		
		}

public void TPA(int index2) {
	By ElementTPA = By.xpath("//select[@name='organisation']");
	   WebElement ELEMENTTPAL = driver.findElement(ElementTPA);
	   Select select = new Select(ELEMENTTPAL);
	List<WebElement> allTPAs= select.getOptions();
	System.out.println("List of all TPA ");
	 for(WebElement ele : allTPAs ) {
		String name3 =ele.getText();
		System.out.println(name3);
	 
		 
	 }
	 select.selectByIndex(index2); 
	 WebElement selectone2=  select.getFirstSelectedOption();
		String selectedtext2= selectone2.getText();
		System.out.println("selected text from dropdown for TPA is  "+ selectedtext2);
}
public void Doctorconsult(int doctornumber) {
	By eleselect =By.xpath("//span[@class='select2-selection__rendered' and '@idselect2-consultant_doctor-container' and @title='Select'][1]");
	WebElement eleslect=driver.findElement(eleselect);
	eleslect.click();

	By ElementD = By.xpath("//*[@class='select2-results__option']");
	WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
	WebElement ELEMENTDL = driver.findElement(ElementD);
	wait1.until(ExpectedConditions.visibilityOfElementLocated(ElementD));
	 
	List<WebElement> allDoctorsE= driver.findElements(ElementD);
	System.out.println("all doctors list from consult doctor below :");
	for (WebElement ele : allDoctorsE) {
	    String Alldoctorslist = ele.getText();
	    System.out.println(Alldoctorslist);



	}

	By ElementDo = By.xpath("//*[@class='select2-results__option']["+doctornumber+"]");
	WebElement ELEMENTDoL = driver.findElement(ElementDo);
	ELEMENTDoL.click();

	By elementselectedD=By.id("select2-consultant_doctor-container");
		WebElement elemnetselectedDL=driver.findElement(elementselectedD);
	 String seletceDoctor =elemnetselectedDL.getText();
	 System.out.println("selected doctor from the list is " + seletceDoctor);

}
public void chargecategeory(int chargetypeno) {
	By elecharge =By.xpath("//span[@class='select2-selection__rendered' and @title='Select'][1]");
	WebElement elechargeL=driver.findElement(elecharge);
	elechargeL.click();

	 WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));

	    By dropdowncharge = By.xpath("//*[@class='select2-results__option']");
	  wait2.until(ExpectedConditions.visibilityOfElementLocated(dropdowncharge));
	   List<WebElement> allCharges = driver.findElements(dropdowncharge);
	  // wait.until(ExpectedConditions.visibilityOfAllElements(allOptions));
	   System.out.println("all charge list from  charge categeory below :");
	    
	   for (WebElement ele2 : allCharges) {
	       String data3 = ele2.getText();
	       System.out.println(data3);



	}
	   By Elementcharge = By.xpath("//*[@class='select2-results__option']["+chargetypeno+"]");
	   WebElement ElementchargeL = driver.findElement(Elementcharge);
	   ElementchargeL.click();
}
public void  costselect() {
	By elechargeC =By.xpath("//span[@class='select2-selection__rendered' and @title='Select'][1]");
	WebElement elechargeCL=driver.findElement(elechargeC);
	elechargeCL.click();
	By elechargesearch =By.xpath("//input[@class='select2-search__field']");
	WebElement elechargesearchL=driver.findElement(elechargesearch);
	elechargesearchL.click();
	elechargesearchL.sendKeys("a");
	

WebDriverWait wait4 = new WebDriverWait(driver, Duration.ofSeconds(10));

By dropdownCost = By.xpath("//li[@class='select2-results__option']");
wait4.until(ExpectedConditions.visibilityOfElementLocated(dropdownCost));
List<WebElement> allcost = driver.findElements(dropdownCost);

System.out.println("List of rome chargres below :");

for (WebElement cost : allcost) {
String data5 = cost.getText();
   

		
		System.out.println(data5);
		
		
	}
By ElementCostS = By.xpath("//li[@class='select2-results__option'][1]");
WebElement ELEMENTCostL = driver.findElement(ElementCostS);

ELEMENTCostL.click();
}
public void appliedcharge(String value) {
	JavascriptExecutor js2 = (JavascriptExecutor) driver;
	
	By Applied = By.xpath("//input[@onkeyup='update_amount(this.value)']");
	
	WebElement appliedL = driver.findElement(Applied);
	js2.executeScript("arguments[0].scrollIntoView();",appliedL);
	Actions action5 = new Actions(driver);
	action5.moveToElement(appliedL).click().build().perform();
	
	
	appliedL.clear();
	appliedL.sendKeys(value);
	
}

public void payemntmode() throws InterruptedException {

JavascriptExecutor js = (JavascriptExecutor) driver;


	By Elementpayment = By.xpath("//select[@name='payment_mode']");
	   WebElement ElementpaymentL = driver.findElement(Elementpayment);
	   js.executeScript("arguments[0].scrollIntoView();",ElementpaymentL);
	   Thread.sleep(3000);
	   Select select4 = new Select(ElementpaymentL);
	  select4.selectByIndex(2);
	
List<WebElement>allmodes =select4.getOptions();
System.out.println("list of all payment methods");
for(WebElement modes: allmodes)
{
String allpayment=	modes.getText();
System.out.println(allpayment);
}
List<WebElement> slectedpayment=  select4.getAllSelectedOptions();
for(WebElement mode :slectedpayment)
{
String seletcedpayment=	mode.getText();
System.out.println(" Selected payment mode from list " + seletcedpayment);
}

	
}
public void Paidmoney(String paidmoney) {
	
	
	By paid = By.xpath("//input[@name='paid_amount']");
	
	WebElement paidL = driver.findElement(paid);
	
	Actions action5 = new Actions(driver);
	action5.moveToElement(paidL).click().build().perform();
	
	
	paidL.clear();
	paidL.sendKeys(paidmoney);
	
}
public void savebutton() {
	By saveE =By.xpath("//button[@type='submit' and @class='btn btn-info pull-right'][1]");
	WebElement SaveL = driver.findElement(saveE);
	SaveL.click();
}

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
}
}