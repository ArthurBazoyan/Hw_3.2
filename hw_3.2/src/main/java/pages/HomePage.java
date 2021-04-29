package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static utils.FieldNames.*;

public class HomePage extends Page {

    public HomePage(WebDriver driver){
        super(driver);
        setupElementLocators();
    }

    @Override
    protected void setupElementLocators() {
        elementLocators.put(LOGIN, By.className("login"));
        elementLocators.put(WOMEN, By.className("sf-with-ul"));
        elementLocators.put(CONTACT_US, By.id("contact-link"));
    }

    public LoginPage clickSignInPage(){
        findElementBy(elementLocators.get(LOGIN)).click();
        return new LoginPage(driver);
    }

    public WomenPage clickWomenPage(){
        findElementBy(elementLocators.get(WOMEN)).click();
        return new WomenPage(driver);
    }

    public ContactUsPage clickContactUsPage(){
        findElementBy(elementLocators.get(CONTACT_US)).click();
        return new ContactUsPage(driver);
    }
}
