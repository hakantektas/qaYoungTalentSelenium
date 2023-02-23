package TestClass;

import Common.mainFunction;
import PageClass.homePage;
import PageClass.signUpPage;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.io.IOException;


public class signUpTest  extends mainFunction {

    homePage hPage;
    signUpPage sPage;

    @Test(priority = 1,description = "Home page current url control****")
    public void homePageUrlControl(){

        hPage= new homePage(driver);
        hPage.homeCase();


    }
    @Test(priority = 2,description = "Signup form control******")
    public void signUpFail() throws IOException {

        sPage= new signUpPage(driver);
        sPage.signUp_();

    }
}
