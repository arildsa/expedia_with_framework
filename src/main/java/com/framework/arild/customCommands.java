package com.framework.arild;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Arild on 3/21/2017.
 */
public class customCommands {

    WebDriver driver;

    public customCommands(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void utilClickElement(WebElement element){
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.elementToBeClickable(element));
        System.out.println("clicking " + element.getAttribute("id"));
        element.click();
    }

    public void waitUntilElementIsVisible(WebElement element){
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOf(element));
        System.out.println("Waited for " + element.getText());
    }

    public void waitUntilBrowserURLContains(String urlPart){
        WebDriverWait wait = new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.urlContains(urlPart));

    }

}
