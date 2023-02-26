package helpers;

import org.junit.AfterClass;

import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {

    public static WebDriver driver;


    @BeforeClass

    public static void getBrowser() {

            System.setProperty("webdriver.chrome.driver","/D://chromedriver.exe");
            ChromeDriver driver = new ChromeDriver();
            driver.get("https://www.abv.bg/");
    }


    @AfterClass
    public static void CloseBrowser() {
       driver.close();
    }
}





