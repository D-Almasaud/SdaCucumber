package stepdefinitions.HomeWorks;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class D1HW2 {
     WebDriver driver;

    @Given("I am on the dynamic buttons page")
    public void iAmOnTheDynamicButtonsPage() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://testpages.eviltester.com/styled/dynamic-buttons-simple.html");
    }
    @When("I click the first button")
    public void iClickTheFirstButton() {
        WebElement button1 = driver.findElement(By.id("button00"));
        button1.click();
    }

    @When("I click the second button")
    public void iClickTheSecondButton() {
        WebElement button2 = driver.findElement(By.id("button01"));
        button2.click();
    }

    @When("I click the third button")
    public void iClickTheThirdButton() {
        WebElement button3 = driver.findElement(By.id("button02"));
        button3.click();
    }

    @When("I click the fourth button")
    public void iClickTheFourthButton() {
        WebElement button4 = driver.findElement(By.id("button03"));
        button4.click();
    }

    @Then("see message 'All Buttons Clicked!")
    public void see_message_all_buttons_clicked() {
        Assert.assertTrue(driver.findElement(By.id("buttonmessage")).isDisplayed());
    }
}