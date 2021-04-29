package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static utils.FieldNames.*;

public class ContactUsPage extends Page {

    protected ContactUsPage(WebDriver driver) {
        super(driver);
        setupElementLocators();
    }

    @Override
    protected void setupElementLocators() {
        elementLocators.put(SUBJECT_HEADING, By.id("id_contact"));
        elementLocators.put(EMAIL_ADDRESS, By.id("email"));
        elementLocators.put(ID_ORDER, By.id("id_order"));
        elementLocators.put(MESSAGE, By.id("message"));
        elementLocators.put(SEND_MESSAGE, By.id("submitMessage"));
    }

    public void clickSendMessage(){
        WebElement webElement = findElementBy(elementLocators.get(SEND_MESSAGE));
        webElement.click();
    }

    public void setSubjectHeadingByValue(String value){
        WebElement webElement = findElementBy(elementLocators.get(SUBJECT_HEADING));
        Select subjectHeadingOptions = new Select(webElement);
        subjectHeadingOptions.selectByValue(value);
    }

    public void setEmailAdress(String email){
        WebElement webElement = findElementBy(elementLocators.get(EMAIL_ADDRESS));
        webElement.sendKeys(email);
    }

    public void setIdOrder(String id){
        WebElement webElement = findElementBy(elementLocators.get(ID_ORDER));
        webElement.sendKeys(id);
    }

    public void setMessageText(String messageText){
        WebElement webElement = findElementBy(elementLocators.get(MESSAGE));
        webElement.sendKeys(messageText);
    }

}
