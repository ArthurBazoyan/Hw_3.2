package login;

import base.BaseTests;
import jdk.jfr.Name;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.LoginPage;

import javax.imageio.spi.IIOServiceProvider;

import java.io.IOException;

import static org.testng.Assert.*;

public class LoginTests extends BaseTests {

    @Test
    @Name("Test Failed Login")
    public void testFailedLogin(){
        LoginPage loginPage = homePage.clickSignInPage();
        loginPage.setSignInUsername("tomsmith");
        loginPage.setSignInPassword("SuperSecretPassword!");
        loginPage.clickLoginButton();
        assertEquals(loginPage.getAlertMessageForLogin(), "There is 1 error\n" +
                "Invalid email address.");
    }

    @Test
    @Name("Testing Failed Create Account")
    public void testFailedCreateAccount(){
        LoginPage loginPage = homePage.clickSignInPage();
        loginPage.setCreateUsernameEmail("tomsmith");

        loginPage.clickCreateAccountButton();
        assertEquals(loginPage.getAlertMessageForCreate(), "Invalid email address." );
    }

}
