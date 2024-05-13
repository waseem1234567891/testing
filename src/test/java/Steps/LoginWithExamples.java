package Steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginWithExamples {
    private WebDriver driver;
    @Given("user is on Home Page")
    public void userIsOnHomePage() {
        WebDriverManager.firefoxdriver().setup();
        driver=new FirefoxDriver();
        driver.get("https://www.saucedemo.com/v1/");
    }

    @When("user navigate to Login Page")
    public void userNavigateToLoginPage() {
        System.out.println("user navigate to Login Page");
    }

    @And("user Enters {string} and {string}")
    public void userEntersAnd(String username, String password) {
        System.out.println(username +":"+password);
        driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys(username);
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(password);
        driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
    }

    @Then("Message displayed login seccessfully")
    public void messageDisplayedLoginSeccessfully() throws InterruptedException {
        System.out.println("login seccessfully ");
          Thread.sleep(1000);
    }
}
