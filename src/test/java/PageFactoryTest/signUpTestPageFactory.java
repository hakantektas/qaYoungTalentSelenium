package PageFactoryTest;

import PageFactory.mainFunction2;
import PageFactory.homePage2;
import PageFactory.signUpPage2;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;


public class signUpTestPageFactory extends mainFunction2 {

    homePage2 hPage2;
   // signUpPage sPage;



    @Test(priority = 1,description = "Home page current url control****")
    public void homePageUrlControl(){

        hPage2= new homePage2(driver);
        hPage2.homeCase();


    }
    @Test(priority = 2,description = "Signup form control******")
    public void signUpFail() throws IOException {
        signUpPage2 sPage2 = PageFactory.initElements(driver, signUpPage2.class);
        sPage2.signUp_();

//        sPage= new signUpPage(driver);
//        sPage.signUp_();

    }
}
