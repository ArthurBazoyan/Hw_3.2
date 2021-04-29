package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.HashMap;
import java.util.Map;

public abstract class Page {
    protected Map<String, By> elementLocators = new HashMap<>();

    protected final WebDriver driver;

    protected Page(WebDriver driver) {
        this.driver = driver;
    }

    abstract protected void setupElementLocators();


    public WebElement findElementByClassName(String classText ){
        return driver.findElement(By.className(classText));
    }

    public WebElement findElementByTagName( String tagText ){
        return driver.findElement(By.tagName(tagText));
    }

    public WebElement findElementByCSSSelector( String cssText ){
        return driver.findElement(By.className(cssText));
    }

    public WebElement findElementByXpath( String xPathText ){
        return driver.findElement(By.className(xPathText));
    }

    public WebElement findElementById( String IdText ){
        return driver.findElement(By.id(IdText));
    }

    public WebElement findElementBy( By by ){
        if(by == null){
            throw new IllegalArgumentException("'By' cannot be null!");
        }
        return driver.findElement(by);
    }

    public Map<String, By> getElementLocators(){
        return elementLocators;
    }


}
