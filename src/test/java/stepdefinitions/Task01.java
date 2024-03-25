package stepdefinitions;

import org.openqa.selenium.*;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Task01 {
    WebDriver driver;

    @Given("user goes to google page")
    public void user_goes_to_google_page() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.google.com");
    }
    @When("user search for samsung")
    public void user_search_for_samsung() {
        driver.findElement(By.name("q")).sendKeys("samsung" + Keys.ENTER);
    }
    @Then("the page title should contain the word {string}")
    public void verifyPageTitle(String expectedWord) {
        String pageTitle = driver.getTitle();
        Assert.assertTrue("Page title does not contain the expected word: " + "samsung", pageTitle.contains("samsung"));
    }
    @Then("I close the browser")
    public void i_close_the_browser() {
        driver.close();
    }


}
//still working on it