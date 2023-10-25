package Pathology;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import CommonMethods.CommonMethods;

public class checksearchbarbypatientIDPathology{
	private WebDriver driver;
	Scanner scan;
	String data ;
	public checksearchbarbypatientIDPathology(WebDriver driver)
		{
			this.driver=driver;	

}
	public void CheckbID(String id)
	
	{
		
			By Elementsearch=By.xpath("//input[@type='search']");
			WebElement ElementsearchL =driver.findElement(Elementsearch);
			ElementsearchL.sendKeys(id);
}
	public void checkbyinvalid_id(String invalid_id) {
	By Elementsearch=By.xpath("//input[@type='search']");
	WebElement ElementsearchL =driver.findElement(Elementsearch);
	ElementsearchL.sendKeys(invalid_id);
	}
	public void clearsearchbox() {
		
	
	By Elementsearch=By.xpath("//input[@type='search']");
	WebElement ElementsearchL =driver.findElement(Elementsearch);
	ElementsearchL.clear();
	}
	public void Searchlist(String ID) {
		
		WebElement table = driver.findElement(By.xpath("//table[@class='table table-striped table-bordered table-hover ajaxlist dataTable no-footer']"));


		List<WebElement> rows = table.findElements(By.tagName("tr"));
int rowsize= rows.size();

for (int i=0; i< rows.size();i++) {
	WebElement row = rows.get(i);
    List<WebElement> cells = row.findElements(By.tagName("td"));
    for (int j=0;j<cells.size(); j++) {
        WebElement cell = cells.get(j);
        data =cell.getText();
        System.out.print(data + "\t");
        
    }

    System.out.println(); 
    
    
}
if(data.contains(ID)) {
	System.out.println("enter ID contains list from dashboard");
}
else {
	System.out.println("enter data is invalid");
}
	}

		
}

