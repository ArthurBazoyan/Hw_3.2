package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static utils.FieldNames.SIZE_S_CHECKBOX;
import static utils.FieldNames.TOPS_CHECKBOX;

public class WomenPage extends Page{

    WomenPage(WebDriver driver){
        super(driver);
        setupElementLocators();
    }

    @Override
    protected void setupElementLocators() {
        elementLocators.put(TOPS_CHECKBOX, By.id("layered_category_4"));
        elementLocators.put(SIZE_S_CHECKBOX, By.id("layered_id_attribute_group_1"));
    }

    public void checkCheckBox(String checkbox){
        findElementBy(elementLocators.get(checkbox)).click();
    }

}
