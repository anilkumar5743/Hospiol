package CommonMethods;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectDateFromDatePicker {
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver.exe");

        // Create a new instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to the web page with the datepicker
        driver.get("URL_of_Your_Page_with_Datepicker");

        // Locate the datepicker container
        WebElement datepicker = driver.findElement(By.className("datepicker-days"));

        // Locate the specific table cell (td) for the date "12"
        WebElement dateCell = datepicker.findElement(By.xpath("//td[text()='12']"));

        // Click on the date cell to select it
        dateCell.click();

        // Locate the month and year header, e.g., "September 2023"
        WebElement monthYearHeader = datepicker.findElement(By.className("datepicker-switch"));

        // Click on the header to change the month and year if needed
        if (!monthYearHeader.getText().equals("September 2023")) {
            // Click on the header to switch to the desired month and year
            monthYearHeader.click();
            // You can click the "«" and "»" buttons to navigate to the desired month and year
            // e.g., driver.findElement(By.className("prev")).click();
            // e.g., driver.findElement(By.className("next")).click();
        }

        // Locate and click the specific day of the week (e.g., "Su") corresponding to "11/1997"
        WebElement dayOfWeekCell = datepicker.findElement(By.xpath("//th[text()='Su']"));
        dayOfWeekCell.click();

        // Close the WebDriver instance
        driver.quit();
    }
    public void photo1() throws AWTException
    {
    	By Elementphoto= By.xpath("//input[@class='filestyle form-control' and @type='file'][2]");
    	WebElement ElementphotoL = driver.findElement(Elementphoto);
    	String filepath = "C:\\Users\\Dell\\Downloads\\MY PIC.JPG";
        // Click the upload button to trigger the file dialog
    	ElementphotoL.click();

        // Set the file path to be uploaded
        StringSelection ss = new StringSelection("C:\\Users\\Dell\\Downloads\\MY PIC.JPG");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

        // Use Robot to interact with the file dialog
        Robot robot = new Robot();
        robot.delay(1000); // Adjust the delay as needed

        // Press Enter to confirm the file selection
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
     // Use JavaScript Executor to change the display style to "block" (making it visible)
        ((JavascriptExecutor) driver).executeScript("arguments[0].style.display = 'block';", hiddenInput);

        // Now, you can interact with the element, e.g., get its value
        // Submit the form or perform any necessary actions on the webpage
        // ...

}
    public void photo() {
    	By Elementphoto= By.xpath("//input[@type='file']");
    	WebElement ElementphotoL = driver.findElement(Elementphoto);
    	String filepath = "C:\\Users\\Dell\\Downloads\\MY PIC.JPG";
    	JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
    	jsExecutor.executeScript("arguments[0].style.display='block';", ElementphotoL);
    	jsExecutor.executeScript("arguments[0].value=arguments[1];", ElementphotoL, filepath);
    	
    }
}

