package PageClass;

import Common.mainFunction;
import DriverFactory.driverManager;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class homePage extends mainFunction {


    public homePage(WebDriver driver){
        this.driver=driver;
    }

    public String getUrlTitle(){

        return driver.getTitle();

    }
    public void currentURL(){
        String currentUrl = driver.getCurrentUrl();
        System.out.println("Url bilgisi***********"+currentUrl);
        System.out.println("Title web site *****"+getUrlTitle());
        Assert.assertEquals("Test Relic – Yazılım testinin kutsal kaynağı",getUrlTitle());
    }

    public void homeCase(){
        this.getUrlTitle();
        this.currentURL();
    }
}
