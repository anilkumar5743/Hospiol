package OPDPAGE;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CheckNewpatientforOPD {
	private WebDriver driver;
	public CheckNewpatientforOPD(WebDriver driver)
	{
		this.driver=driver;
	}
	
public void clickonNewPatient() {
		By Newp = By.xpath("//a[@class='modalbtnpatient']");
		WebElement NewPE = driver.findElement(Newp);
		NewPE.click();
		
}
public void Enterpatientname(String PatientName) {
	By NewPN = By.xpath("//input[@class='form-control' and @id='name']");
	WebElement NewPNE = driver.findElement(NewPN);
	NewPNE.sendKeys(PatientName);
}
public void Enterguardianname(String GuardianName) {
	By NewGN = By.xpath("//input[@name='guardian_name' and not(@id)]");
	WebElement NewGNE = driver.findElement(NewGN);
	NewGNE.sendKeys(GuardianName);
}
public void SelectGender(int index1) {
	By Elementgender = By.xpath("//select[@name='gender' and @id='addformgender']");
	   WebElement ElementgenderL = driver.findElement(Elementgender);
	   
	   
	   Select select = new Select(ElementgenderL);
	   select.selectByIndex(index1);
	   WebElement selectedgender=  select.getFirstSelectedOption();
		String selectedtext1= selectedgender.getText();
		System.out.println("selected gender from dropdown for patient is  "+ selectedtext1);
}
public void selectDate() throws InterruptedException {
	By Elementclick=By.id("birth_date");
	WebElement Edateclick= driver.findElement(Elementclick);
	Edateclick.click();
	
	 WebElement datepicker = driver.findElement(By.xpath("//div[@class='datepicker-days']"));
	 WebElement monthYearHeader = driver.findElement(By.xpath("//th[@class='datepicker-switch']"));
	 monthYearHeader.click(); 
	 
	 WebElement monthContainer = driver.findElement(By.xpath("//td[contains(@colspan, '7')]"));
     WebElement desiredMonth = monthContainer.findElement(By.xpath(".//span[text()='Jan']"));
     desiredMonth.click();
    WebElement dateCell = datepicker.findElement(By.xpath("//td[text()='12']"));
     dateCell.click();
}
public void Age() {
	By Elementageyear= By.xpath("//input[@name='age[year]']");
	WebElement yearL = driver.findElement(Elementageyear);
	String YEAR =yearL.getAttribute("value");
	
	System.out.println("Birth year of new patient is "+ YEAR);
	By Elementagemonth= By.xpath("//input[@name='age[month]']");
	WebElement monthL = driver.findElement(Elementagemonth);
	
	String month =monthL.getAttribute("value");
	System.out.println("Birth Month of new patient is "+ month);
	By Elementageday= By.xpath("//input[@name='age[day]']");
	WebElement dayL = driver.findElement(Elementageday);
	
	String Day =dayL.getAttribute("value");
	System.out.println("Birth Day of new patient is "+ Day);
}
public void BloodGroup(int index2) {
	By ElementBG = By.xpath("//select[@name='blood_group' and not(@id)]");
	   WebElement ElementBGL = driver.findElement(ElementBG);
	   Select select1 = new Select(ElementBGL);
	List<WebElement> allBGs= select1.getOptions();
	System.out.println("List of all Blood Groups ");
	 for(WebElement ele : allBGs ) {
		String Bloodgroups =ele.getText();
		System.out.println(Bloodgroups);
	 
		 
	 }
	 select1.selectByIndex(index2);
	 
	 WebElement selectone=  select1.getFirstSelectedOption();
		String selectedtext2= selectone.getText();
		System.out.println("selected Bloodgroup from dropdown for list is  "+ selectedtext2);
}

public void Marrige(int index3) {
	By ElementMG = By.xpath("//select[@name='marital_status' and not(@id)]");
	   WebElement ElementMGL = driver.findElement(ElementMG);
	   Select select2 = new Select(ElementMGL);
	Set<WebElement> allMGs= (Set<WebElement>)select2.getOptions();
	System.out.println("List of all Status");
	 for(WebElement ele1 : allMGs ) {
		String Marriagelist =ele1.getText();
		System.out.println(Marriagelist);
	 
		 
	 }
	 select2.selectByIndex(index3);
	 
	 WebElement selecttedone=  select2.getFirstSelectedOption();
		String selectedtext3= selecttedone.getText();
		System.out.println("selected marital_status from dropdown for list is  "+ selectedtext3);
}
public void getcolor() {
	By Elementcolor= By.xpath("//h4[@class='modal-title' and text()='Add Patient']");
	WebElement ElementcolorL = driver.findElement(Elementcolor);
	
     String Color = ElementcolorL.getCssValue("color");

     System.out.println("Color: " + Color);
}
public void enterPh(String PhNo) {
	By ElementPN = By.xpath("//input[@name='mobileno']");
	   WebElement ElementBPNL = driver.findElement(ElementPN);
	   ElementBPNL.sendKeys(PhNo);
}
public void Email(String mail) {
	By ElementEM = By.xpath("//input[@id='addformemail']");
	   WebElement ElementEML = driver.findElement(ElementEM);
	   ElementEML.sendKeys(mail);
}
public void Address(String Address) {
	By ElementAddress = By.xpath("//input[@name='address']");
	   WebElement ElementAddressL = driver.findElement(ElementAddress);
	   ElementAddressL.sendKeys(Address);
}
public void save() {
	
	By Elementsave = By.xpath("//button[@id='formaddpabtn']");
	   WebElement ElementsaveL = driver.findElement(Elementsave);
	   ElementsaveL.click();
}
}
