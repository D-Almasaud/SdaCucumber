package stepdefinitions.HomeWorks;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class D1HW3 {
    WebDriver driver;

    @Given("I am on the input validation page")
    public void i_am_on_the_input_validation_page() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://testpages.eviltester.com/styled/validation/input-validation.html");
    }

    @When("I fill the form with valid data")
    public void i_fill_the_form_with_valid_data() {
        WebElement firstNameField = driver.findElement(By.id("firstname"));
        firstNameField.sendKeys("Danah");

        WebElement lastNameField = driver.findElement(By.id("surname"));
        lastNameField.sendKeys("AlmasaudDDDD");

        WebElement ageField = driver.findElement(By.id("age"));
        ageField.sendKeys("22");

        WebElement countryField = driver.findElement(By.id("country"));
        Select countryDropdown = new Select(countryField);
        countryDropdown.selectByVisibleText("Saudi Arabia");

        WebElement notesField = driver.findElement(By.id("notes"));
        notesField.sendKeys("everything is valid");
    }

    @When("I fill the form with invalid data")
    public void i_fill_the_form_with_invalid_data() {
        WebElement firstNameField = driver.findElement(By.id("firstname"));
        firstNameField.sendKeys("invalid");

        WebElement lastNameField = driver.findElement(By.id("surname"));
        lastNameField.sendKeys("valid");

        WebElement ageField = driver.findElement(By.id("age"));
        ageField.sendKeys("25");

        WebElement countryField = driver.findElement(By.id("country"));
        Select countryDropdown = new Select(countryField);
        countryDropdown.selectByVisibleText("Madagascar");

        WebElement notesField = driver.findElement(By.id("notes"));
        notesField.sendKeys("invalid");
    }

    @When("I submit the form")
    public void i_submit_the_form() {
        WebElement submitButton = driver.findElement(By.xpath("//input[@type='submit']"));
        submitButton.click();
    }

    @Then("I should see the success message")
    public void i_should_see_the_success_message() {
        WebElement successMessage = driver.findElement(By.xpath("//h1[contains(text(),'Thank')]"));
        Assert.assertTrue(successMessage.isDisplayed());
    }

    @Then("I should see the validation error message")
    public void i_should_see_the_validation_error_message() {
        WebElement errorMessage = driver.findElement(By.className("errormessage"));
        Assert.assertTrue(errorMessage.isDisplayed());
    }
}
