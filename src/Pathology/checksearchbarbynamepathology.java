package Pathology;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import CommonMethods.CommonMethods;

public class checksearchbarbynamepathology{
	private WebDriver driver;
	Scanner scan;
	String data ;
	public checksearchbarbynamepathology(WebDriver driver)
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

		
		
	
}

