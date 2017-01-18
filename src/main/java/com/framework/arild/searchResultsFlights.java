package com.framework.arild;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Arild on 1/18/2017.
 */
public class searchResultsFlights {

    WebDriver driver;

    public searchResultsFlights(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = ".//span[@class='title-city-text']")
    WebElement searchResultHeader;


    public String getSearchResultHeaderText(){
        return searchResultHeader.getText();
    }
}
