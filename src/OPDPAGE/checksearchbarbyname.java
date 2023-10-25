package OPDPAGE;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import CommonMethods.CommonMethods;

public class checksearchbarbyname{
	private WebDriver driver;
	Scanner scan;
	String data ;
	public checksearchbarbyname(WebDriver driver)
		{
			this.driver=driver;	

}
	public void Checkbyfullname(String Fullpatientname)
	
	{
		
			By Elementsearch=By.xpath("//input[@type='search']");
			WebElement ElementsearchL =driver.findElement(Elementsearch);
			ElementsearchL.sendKeys(Fullpatientname);
}
	public void checkbypartialname(String partialname) {
	By Elementsearch=By.xpath("//input[@type='search']");
	WebElement ElementsearchL =driver.findElement(Elementsearch);
	ElementsearchL.sendKeys(partialname);
	}
	public void Searchlist(String name) {
		
		WebElement table = driver.findElement(By.xpath("//table[@class='table table-striped table-bordered table-hover ajaxlist dataTable no-footer']"));


		List<WebElement> rows = table.findElements(By.tagName("tr"));
int rowsize= rows.size();

for (int i=0;i<3 && i< rows.size();i++) {
	WebElement row = rows.get(i);
    List<WebElement> cells = row.findElements(By.tagName("td"));
    for (int j=0;j<1 && j<cells.size(); j++) {
        WebElement cell = cells.get(j);
        data =cell.getText();
        System.out.print(data + "\t");
    }

    System.out.println(); 
    
    
}
if(data.contains(name)) {
	System.out.println("enter name contains list from dashboard");
}
else {
	System.out.println("enter data is invalid");
}
	}

		
		public static void main(String[] args) throws InterruptedException {
		
		
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

