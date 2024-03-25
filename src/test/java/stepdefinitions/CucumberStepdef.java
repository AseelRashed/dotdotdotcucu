package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class CucumberStepdef {

    WebDriver driver;

    @Given("i open the browser")
    public void i_open_the_browser() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }
    @Given("i am on google homepage")
    public void i_am_on_google_homepage() {

        driver.get("https://www.google.com");

    }
    @When("i search for amazon on gogle")
    public void i_search_for_amazon_on_gogle() {

        driver.findElement(By.name("q")).sendKeys("Amazon" = Keys.ENTER);

    }
    @Then("i should see amazon on the results")
    public void i_should_see_amazon_on_the_results() {

        Assert.assertFalse(driver.findElement(By.xpath("//*[contains(text(),'amazon']")).isDisplayed());

    }

}
