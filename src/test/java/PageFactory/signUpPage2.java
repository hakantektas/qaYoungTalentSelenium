package PageFactory;

import Common.mainFunction;
import io.qameta.allure.Allure;
import org.openqa.selenium.*;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class signUpPage2 extends mainFunction2 {
    final WebDriver driver;

    public signUpPage2(WebDriver driver){
        this.driver=driver;
    }
        @FindBy(xpath ="(//*[contains(@data-type,'login')])[1]")
        WebElement signUpBtn;
//    By signUpBtn = By.xpath("test");


    By test = By.id("deneme");
        @FindBy(xpath ="(//*[contains(@data-type,'register')])[2]" )
        WebElement signUpModal;

        @FindBy(xpath ="(//*[contains(@type,'submit') and @class='wpsm-button rehub_main_btn'])[3]" )
        WebElement signUpModalBtn;

        @FindBy(xpath ="(//*[@class='wpsm_box warning_type mb30'])[2]" )
        WebElement signUpMessage;

        @FindBy(xpath ="(//*[@class='pm-close rh-close-btn'])[1]" )
        WebElement modalClose;
        String signUpMessageTxt =   "Lütfen tüm form alanlarını doldurun";




    public void signUpCase() throws IOException {

        signUpBtn.click();
        captureScreenShots();
        Allure.addAttachment("Sign up Click",new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));
        signUpModal.click();
        captureScreenShots();
        signUpModalBtn.click();
        captureScreenShots();
        String FailMessage = signUpMessage.getAttribute("textContent");
        Assert.assertEquals(signUpMessageTxt,FailMessage);
    }
    public void colorControl() throws IOException {
        WebElement colorE = driver.findElement(By.className("wpsm_box"));
        String s = colorE.getCssValue("color");

        String c = Color.fromString(s).asHex();
        System.out.println("Color is2222 :" + s);
        System.out.println("Hex code for color :" + c);

        Assert.assertTrue(c.equals("#a61818"),"***********Hata mesajı renk kod değişmiş********");
        modalClose.click();
    }
    public void signUp_() throws IOException {
        signUpCase();
        colorControl();
    }

}
