package contact;


import base.BaseTests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.ContactUsPage;

import java.util.UUID;

import static org.testng.Assert.assertEquals;

public class ContactUsPageTests extends BaseTests {

    @Test
    public void testSubjectHeading(){
        ContactUsPage contactUsPage = homePage.clickContactUsPage();

        String choose = "-- Choose --";                 // value 0
        String webmasters = "Webmaster";                // value 1
        String customerService = "Customer service";    // value 2
        String options = "\n" + choose + "\n" + customerService + "\n" + webmasters;

        By dropDownBy = By.xpath("//div[@id='uniform-id_contact']");
        WebElement dropDown = contactUsPage.findElementBy(dropDownBy);

        contactUsPage.setSubjectHeadingByValue("0");
        assertEquals(dropDown.getText(), choose + options);

        contactUsPage.setSubjectHeadingByValue("1");
        assertEquals(dropDown.getText(), webmasters + options);

        contactUsPage.setSubjectHeadingByValue("2");
        assertEquals(dropDown.getText(), customerService + options);
    }

    @Test
    public void testSendMessage(){
        ContactUsPage contactUsPage = homePage.clickContactUsPage();
        String email = "email@email.com";
        contactUsPage.setEmailAdress(email);
        UUID id = UUID.randomUUID();
        contactUsPage.setIdOrder(id.toString());
        // random text from a website
        String message = "It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English.";
        contactUsPage.setMessageText(message);
        contactUsPage.clickSendMessage();
        org.testng.Assert.fail("Failing the test to see the screenshot of the message");
    }

}
