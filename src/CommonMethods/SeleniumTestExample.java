package CommonMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SeleniumTestExample {

    private WebDriver driver;

    @BeforeClass
    public void setUp() {
        // Set up WebDriver and open the browser before running tests
        System.setProperty("webdriver.chrome.driver","D:\\Selenium videos\\chromedriver\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://Google.com");
    }

    @Test(priority = 1 , groups="title")
    public void testPageTitle() {
        // Verify the page title
        String pageTitle = driver.getTitle();
        Assert.assertEquals(pageTitle, "Google");
    }

    @Test(priority = 2 , groups="Header")
    public void testHeader() {
        // Verify the page header
        WebElement header = driver.findElement(By.tagName("h1"));
        Assert.assertEquals(header.getText(), "Example Domain");
    }

    @Test(priority = 3 , groups="Link")
    public void testLink() {
        // Verify the presence and clickability of a link
        WebElement link = driver.findElement(By.linkText("More information..."));
        Assert.assertTrue(link.isDisplayed());
        Assert.assertTrue(link.isEnabled());
        link.click();
    }

    @AfterClass
    public void tearDown() {
        // Close the browser after running tests
        if (driver != null) {
            driver.quit();
        }
    }
}

