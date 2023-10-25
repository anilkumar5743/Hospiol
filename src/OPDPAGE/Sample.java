package OPDPAGE;



import java.time.Duration;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sample {
    public static void main(String[] args) throws InterruptedException {
        String username = "abhishek@marolix.com";
        String password = "Reset@123";

        ChromeDriver driver = new ChromeDriver();

        driver.get("http://hospiol.com/");
        driver.manage().window().maximize();

        // Login
        By elementLADMIN = By.xpath("//a[@class='theme_btn theme_btn_bg']");
        WebElement elementAdmin = driver.findElement(elementLADMIN);
        elementAdmin.click();

        By ElementLogin = By.xpath("//input[@name='username']");
        WebElement ELEMENTLOGINL = driver.findElement(ElementLogin);
        ELEMENTLOGINL.sendKeys(username);

        By Elementpass = By.xpath("//input[@type ='password']");
        WebElement ELEMENTpassL = driver.findElement(Elementpass);
        ELEMENTpassL.sendKeys(password);

        By Elementsign = By.xpath("//button[@type='submit']");
        WebElement ELEMENTsignL = driver.findElement(Elementsign);
        ELEMENTsignL.click();

        // Navigate to the page where the dropdown is
        By Elementbilling = By.xpath("//i[@class='fas fa-file-invoice']");
        WebElement ELEMENTbillingL = driver.findElement(Elementbilling);
        ELEMENTbillingL.click();

        By ElementOPD = By.xpath("//div[@class='billingbox-icon']");
        WebElement ELEMENTOPDL = driver.findElement(ElementOPD);
        ELEMENTOPDL.click();

        By ElementAp = By.xpath("//a[@class='btn btn-primary btn-sm addpatient']");
        WebElement ELEMENTapL = driver.findElement(ElementAp);
        ELEMENTapL.click();

        // Click on the dropdown to open it
        Thread.sleep(3000);
        By ElementAPS = By.xpath("//span[@class='select2-selection select2-selection--single'][1]");
        WebElement ELEMENTAPSL = driver.findElement(ElementAPS);
        ELEMENTAPSL.click();

        // Type the search term in the dropdown input
        By ElementAPE = By.xpath("//input[@class='select2-search__field']");
        WebElement ELEMENTAPEL = driver.findElement(ElementAPE);
        ELEMENTAPEL.sendKeys("ani");
        
        
    //    ELEMENTnameL.click();
        // Wait for the dropdown options to appear
     WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        By dropdownOption = By.xpath("//li[@class='select2-results__option']");
      // wait.until(ExpectedConditions.visibilityOfElementLocated(dropdownOption));
       List<WebElement> allOptions = driver.findElements(dropdownOption);
     
       
        
       for (WebElement ele : allOptions) {
           String data = ele.getText();
           System.out.println(data);

        // Use Actions class to simulate arrow down key and retrieve options
      //  Actions actions = new Actions(driver);
     //   actions.sendKeys(Keys.ARROW_DOWN).perform();

        // Extract and print options
       
   
      
        
       }
    //   By Elementname = By.xpath("//li[@class='select2-results__option'][1]");
    //   WebElement ELEMENTnameL = driver.findElement(Elementname);
    //   Thread.sleep(3000);
       ELEMENTAPEL.clear();
      
    }
}
