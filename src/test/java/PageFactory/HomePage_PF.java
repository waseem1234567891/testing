package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage_PF {
    WebDriver driver;

    @FindBy(xpath = "/html/body/div/div[2]/div[2]/div/div[1]/div[3]/div")
    WebElement products;

   public HomePage_PF(WebDriver driver)
   {
       this.driver=driver;
       PageFactory.initElements(driver,this);
   }
   public boolean findProduct()
   {
       return products.isDisplayed();
   }
}
