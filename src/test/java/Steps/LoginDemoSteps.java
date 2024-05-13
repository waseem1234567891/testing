package Steps;

import PageFactory.HomePage_PF;
import PageFactory.LoginDemo_PF;
import Pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class LoginDemoSteps {
    WebDriver driver;
    LoginDemo_PF login;
    HomePage_PF home;
    @Given("Browser is opened")
    public void browserIsOpened() {
        System.out.println("Browser is opening");
        WebDriverManager.firefoxdriver().setup();
        driver=new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);

    }

    @And("User is on login page on sauce")
    public void userIsOnLoginPageOnSauce() {
        driver.get("https://www.saucedemo.com/v1/");

    }

    @When("User enter {string} and {string}")
    public void userEnterAnd(String username, String password) throws InterruptedException {
        login=new LoginDemo_PF(driver);
        login.enterUserName(username);
        login.enterPassword(password);
        Thread.sleep(2000);
    }

    @And("Click on login button")
    public void clickOnLoginButton() {
        login.clickLogin();
    }

    @Then("user navigate to home page")
    public void userNavigateToHomePage() throws InterruptedException {
        home=new HomePage_PF(driver);
        Assert.assertTrue(home.findProduct());
        Thread.sleep(2000);
        driver.close();
    }


}
