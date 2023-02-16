package PageClass;

import Common.mainFunction;
import DriverFactory.driverManager;
import io.qameta.allure.Allure;
import org.openqa.selenium.*;
import org.openqa.selenium.support.Color;
import org.testng.Assert;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class signUpPage extends mainFunction {

    String signUpBtn        =   "(//*[contains(@data-type,'login')])[1]";
    String signUpModal      =   "(//*[contains(@data-type,'register')])[2]";
    String signUpModalBtn   =   "(//*[contains(@type,'submit') and @class='wpsm-button rehub_main_btn'])[3]";
    String signUpMessageTxt =   "Lütfen tüm form alanlarını doldurun";
    String signUpMessage    =   "(//*[@class='wpsm_box warning_type mb30'])[2]";
    String modalClose       =   "(//*[@class='pm-close rh-close-btn'])[1]";


    public signUpPage(WebDriver driver){
        this.driver=driver;
    }

    public void signUpCase() throws IOException {

        driver.findElement(By.xpath(signUpBtn)).click();
        captureScreenShots();
        Allure.addAttachment("Sign up Click",new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));
        driver.findElement(By.xpath(signUpModal)).click();
        captureScreenShots();
        driver.findElement(By.xpath(signUpModalBtn)).click();
        captureScreenShots();
        String FailMessage = driver.findElement(By.xpath(signUpMessage)).getAttribute("textContent");
        Assert.assertEquals(signUpMessageTxt,FailMessage);
    }
    public void colorControl() throws IOException {
        WebElement colorE = driver.findElement(By.className("wpsm_box"));
        String s = colorE.getCssValue("color");

        String c = Color.fromString(s).asHex();
        System.out.println("Color is :" + s);
        System.out.println("Hex code for color :" + c);

        Assert.assertTrue(c.equals("#a61818"),"***********Hata mesajı renk kod değişmiş********");
        driver.findElement(By.xpath(modalClose)).click();
    }
    public void signUp_() throws IOException {
        this.signUpCase();
        this.colorControl();
    }

}
