package CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class SeleniumTestWithAnnotations {

    private WebDriver driver;

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Before Suite: Setting up global configurations");
        // This code runs before any test suite starts
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("Before Test: Setting up test-level configurations");
        // This code runs before each test within the suite
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("Before Class: Initializing WebDriver and opening the browser");
        System.setProperty("webdriver.chrome.driver","D:\\Selenium videos\\chromedriver\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Before Method: Navigating to the website");
        driver.get("https://Google.com");
    }

    @Test(groups="title")
    public void testPageTitle() {
        String pageTitle = driver.getTitle();
        Assert.assertEquals(pageTitle, "Google");
    }

    @Test(groups="Header")
    public void testHeader() {
        WebElement header = driver.findElement(By.tagName("h1"));
        System.out.println(header.getText());
       // Assert.assertEquals(header.getText(), "Example Domain");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("After Method: Resetting state after each test");
        // Add any necessary cleanup code here
    }

    @AfterClass
    public void afterClass() {
        System.out.println("After Class: Closing the browser");
        if (driver != null) {
            driver.quit();
        }
    }

    @AfterTest
    public void afterTest() {
        System.out.println("After Test: Cleaning up test-level resources");
        // Add any necessary cleanup code here
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("After Suite: Finalizing global configurations");
        // This code runs after all test suites are completed
    }
}

