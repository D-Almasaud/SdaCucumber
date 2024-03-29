package stepdefinitions.HomeWorks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.ConfigReader;

public class D2HW1 {

    WebDriver driver;

    @Given("the user navigates to the {string} page")
    public void navigateToPage(String pageKey) {
        String url = ConfigReader.getProperty(pageKey);
        // Initialize WebDriver instance
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();
        // Navigate to the URL retrieved from configuration.properties
        driver.get(url);
    }

    @Then("the user waits for {int} seconds")
    public void waitForSeconds(int seconds) {
        try {
            // Wait for the specified number of seconds
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Then("the user verifies that the page title contains {string}")
    public void verifyPageTitle(String keyword) {
        // Get the expected keyword from configuration.properties
        String expectedKeyword = ConfigReader.getProperty(keyword);
        // Verify that the page title contains the expected keyword
        String actualTitle = driver.getTitle();
        Assert.assertTrue(actualTitle.contains(expectedKeyword));
    }

    @Then("the user closes the page")
    public void closePage() {
        // Close the WebDriver instance
        if (driver != null) {
            driver.quit();
        }
    }
}
