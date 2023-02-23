package PageFactory;

import Common.mainFunction;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class homePage2 extends mainFunction2 {


    public homePage2(WebDriver driver){
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
