package PageObjectModels;


import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class SecondPage {

    WebDriver driver;
    @FindBy(id = "abv-Logo")
    WebElement logo;

    public void VerifyLogin() {
        logo.isDisplayed();
    }


    public SecondPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    }



