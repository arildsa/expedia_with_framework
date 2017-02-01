package com.framework.arild;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Arild on 1/18/2017.
 */
public class activityTab {

    private WebDriver driver;

    public activityTab(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "activity-destination")
    WebElement activityDestination;

    @FindBy(id = "search-button")
    WebElement searchButton;


    public void setActivityDestination(){
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.elementToBeClickable(activityDestination));
        activityDestination.click();
        activityDestination.sendKeys("Miami, Fl");
    }

    public void setActivityDestination(String destination){
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.elementToBeClickable(activityDestination));
        activityDestination.click();
        activityDestination.sendKeys(destination);
    }

    public void clickSearch(){
        searchButton.click();
    }

}