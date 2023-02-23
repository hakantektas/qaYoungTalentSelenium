package DriverFactory;

import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;
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


    @Parameters("browser")
    @BeforeTest
    public void setup(@Optional("browser") String browserName){

        switch (browserName){


            case "firefox":
                System.setProperty("webdriver.gecko.driver",driverPathFirefox);
                driver= new FirefoxDriver();
                System.out.println("**************Browser is Open with Firefox***********");
                driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
                driver.manage().window().maximize();
                driver.navigate().to(url);
            case "chrome":
                System.setProperty("webdriver.chrome.driver",driverPathChrome);
                driver= new ChromeDriver();
                System.out.println("**************Browser is Open with Chrome***********");
                driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
                driver.manage().window().maximize();
                driver.navigate().to(url);
            case "edge":
                System.setProperty("webdriver.edge.driver",driverPathEdge);
                driver= new EdgeDriver();
                System.out.println("**************Browser is Open with Edge***********");
                driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
                driver.manage().window().maximize();
                driver.navigate().to(url);
            case "safari":

                driver= new SafariDriver();
                System.out.println("**************Browser is Open with Safari***********");
                driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
                driver.manage().window().maximize();
                driver.navigate().to(url);
            default:
                System.setProperty("webdriver.chrome.driver",driverPathChrome);
                driver= new ChromeDriver();
                System.out.println("**************Browser is Open with Chrome***********");
                driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
                driver.manage().window().maximize();
                driver.navigate().to(url);
        }

    }


    @AfterTest
    public void tearDown(){
     if (driver!=null){
            driver.close();
       }
    }
}
