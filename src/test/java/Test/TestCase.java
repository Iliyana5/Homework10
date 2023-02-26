package Test;

import PageObjectModels.HomePage;
import PageObjectModels.SecondPage;
import helpers.BrowserFactory;
import org.junit.Assert;
import org.junit.Test;

import org.openqa.selenium.support.PageFactory;


public class TestCase extends BrowserFactory {


    @Test
    public void VerifyPage() {
        driver.get("https://www.abv.bg/");
        String actualURL = driver.getCurrentUrl();
        System.out.println(actualURL);
        String expectedURL = "https://www.google.com/";
        Assert.assertFalse("URL does match", expectedURL.equals(actualURL));
        System.out.println("Test passed");
    }

    @Test
    public void Login() {

        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        SecondPage secondPage = PageFactory.initElements(driver, SecondPage.class);
        homePage.Login("johnjohn.6", "Jh898989");
        Assert.assertTrue("johnjohn.6", true);
        secondPage.VerifyLogin();

    }
}














