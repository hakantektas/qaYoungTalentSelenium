package DriverFactory;

import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class driverManager {

    public static WebDriver driver;
    public static WebDriverWait wait;

    String url = "https://testrelic.com/";
    String driverPathChrome="/Users/hakantektas/git_clone/qaYoungTalentSelenium/drivers/chromedriver";
    String driverPathFirefox="/Users/hakantektas/git_clone/qaYoungTalentSelenium/drivers/geckodriver";
    String driverPathEdge="/Users/hakantektas/git_clone/qaYoungTalentSelenium/drivers/msedgedriver";


    @BeforeTest
    public void setup(){

        System.setProperty("webdriver.gecko.driver",driverPathFirefox);
        driver= new FirefoxDriver();
        System.out.println("**************Browser is Open with Chrome***********");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.navigate().to(url);
    }


    @AfterTest
    public void tearDown(){
     if (driver!=null){
            driver.close();
       }
    }
}
