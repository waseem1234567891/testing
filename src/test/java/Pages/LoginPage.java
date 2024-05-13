package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    private By txt_username=By.id("user-name");
    private By txt_password=By.id("password");
    private By loginButton=By.id("login-button");

    public LoginPage(WebDriver driver)
    {
        this.driver=driver;

    }
    public void enterUserName(String userName)
    {
        driver.findElement(txt_username).sendKeys(userName);
    }
    public void enterPassword(String password)
    {
        driver.findElement(txt_password).sendKeys(password);
    }
    public void clickLoginButton()
    {
        driver.findElement(loginButton).click();
    }
    public boolean productDisplayed()
    {
       return driver.findElement(By.xpath("//div[text()='Products']")).isDisplayed();
    }
}
