package Pathology;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckaddpatientforPathology {
	String list;
	String list1;
	private WebDriver driver;
	public CheckaddpatientforPathology(WebDriver driver)
	{
		this.driver=driver;
	}
	public void clickonaddpatient() {
		By ElementAp=By.xpath("//button[@class='btn btn-primary btn-sm assigntest']");
		WebElement ELEMENTapL =driver.findElement(ElementAp);
		ELEMENTapL.click();
	}
	public WebElement Clickonsearchpatient() throws InterruptedException {
		By ElementAPS=By.xpath("//span[@class='select2-selection select2-selection--single'][1]']");
		WebElement ELEMENTAPSL =driver.findElement(ElementAPS);
		WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait2.until(ExpectedConditions.visibilityOfElementLocated(ElementAPS));
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
	       list = ele.getText();
	       
	       System.out.println(list);
	       
	       
	}
	   if(list.contentEquals("No results found")) {
		   System.out.println("no data found with error message " + list);
		   driver.close();
	   }

	   else if(list.contains(patientname)) {
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
	       list1 = ele.getText();
	       
	       if(list1.contains(fullpatientname)) {
	   		System.out.println("enter name contains list from dashboard");
	   		System.out.println(list1);
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
}
