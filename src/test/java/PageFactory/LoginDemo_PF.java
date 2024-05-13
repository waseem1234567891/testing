package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import java.util.List;

public class LoginDemo_PF {
    WebDriver driver;

    @FindBy(id = "user-name")
            @CacheLookup
    WebElement txt_userName;

    @FindBy(id="password")
    WebElement txt_password;

    @FindBy(id="login-button")
    WebElement loginButton;

    //@FindBy(id="allnames")
    //List<WebElement> elementlist;
    @FindBy(how = How.ID,using = "name")
    WebElement name;

    public LoginDemo_PF(WebDriver driver)
    {
        this.driver=driver;
       // PageFactory.initElements(driver,this);
        AjaxElementLocatorFactory factory=new AjaxElementLocatorFactory(driver,30);
        PageFactory.initElements(factory,this);
    }
    public void enterUserName(String name)
    {
           txt_userName.sendKeys(name);
    }
    public void enterPassword(String password)
    {
        txt_password.sendKeys(password);
    }
    public void clickLogin()
    {
        loginButton.click();
    }


}
