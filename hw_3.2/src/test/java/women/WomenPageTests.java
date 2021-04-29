package women;

import base.BaseTests;
import jdk.jfr.Name;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.WomenPage;

import static org.testng.Assert.assertEquals;
import static utils.FieldNames.SIZE_S_CHECKBOX;
import static utils.FieldNames.TOPS_CHECKBOX;

public class WomenPageTests extends BaseTests {

    @Test
    @Name("Testing checkbox of Tops")
    public void testTopsCheckbox(){
        By checkboxBy = By.xpath("//div[@id='uniform-layered_category_4']//span");
        testCheckboxBy(TOPS_CHECKBOX, checkboxBy);
    }

    @Test
    public void testSizeSmallCheckbox(){
        By checkboxBy = By.xpath("//div[@id='uniform-layered_id_attribute_group_1']//span");
        testCheckboxBy(SIZE_S_CHECKBOX, checkboxBy);
    }

    private void testCheckboxBy(String checkBoxName , By checkboxBy){
        WomenPage womenPage = homePage.clickWomenPage();
        WebElement topsCheckbox = womenPage.findElementBy(checkboxBy);
        assertEquals(topsCheckbox.getAttribute("class"), "");
        womenPage.checkCheckBox(checkBoxName);
        topsCheckbox = womenPage.findElementBy(checkboxBy);
        assertEquals(topsCheckbox.getAttribute("class"), "checked");
    }

}
