package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static utils.FieldNames.*;

public class LoginPage extends Page {
    public LoginPage(WebDriver driver){
        super(driver);
        setupElementLocators();
    }

    @Override
    protected void setupElementLocators() {
        elementLocators.put(SIGN_IN_USERNAME_FIELD, By.id("email") );
        elementLocators.put(SIGN_IN_PASSWORD_FIELD, By.id("passwd") );
        elementLocators.put(SIGN_IN_BUTTON, By.id("SubmitLogin") );

        elementLocators.put(CREATE_USERNAME_FIELD, By.id("email_create") );
        elementLocators.put(CREATE_BUTTON, By.id("SubmitCreate") );
        elementLocators.put(ALERT_MESSAGE_FOR_CREATE, By.xpath("//div[@id='create_account_error']"));
        elementLocators.put(ALERT_MESSAGE_FOR_LOGIN, By.xpath("//div[@class='alert alert-danger']"));

    }

    public void setSignInUsername(String signInUsername){
        driver.findElement(elementLocators.get(SIGN_IN_USERNAME_FIELD)).sendKeys(signInUsername);
    }

    public void setSignInPassword(String signInPassword){
        driver.findElement(elementLocators.get(SIGN_IN_PASSWORD_FIELD)).sendKeys(signInPassword);
    }

    public void setCreateUsernameEmail(String createUsername){
        driver.findElement(elementLocators.get(CREATE_USERNAME_FIELD)).sendKeys(createUsername);
    }

    public void clickCreateAccountButton(){
        driver.findElement(elementLocators.get(CREATE_BUTTON)).click();
    }

    public void clickLoginButton(){
        driver.findElement(elementLocators.get(SIGN_IN_BUTTON)).click();
    }

    public String getAlertMessageForCreate() {
        WebElement temp = new WebDriverWait(driver, 7)
                .until(ExpectedConditions.elementToBeClickable(elementLocators.get(ALERT_MESSAGE_FOR_CREATE)));
        return temp.getText();
    }

    public String getAlertMessageForLogin() {
        WebElement temp = new WebDriverWait(driver, 7)
                .until(ExpectedConditions.elementToBeClickable(elementLocators.get(ALERT_MESSAGE_FOR_LOGIN)));
        return temp.getText();
    }


}
