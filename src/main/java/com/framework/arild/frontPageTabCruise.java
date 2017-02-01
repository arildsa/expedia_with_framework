package com.framework.arild;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

/**
 * Created by Arild on 1/20/2017.
 */
public class frontPageTabCruise {

    WebDriver driver;

    public frontPageTabCruise(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(id="cruise-destination")
     WebElement cruiseDestination;

    @FindBy(id="cruise-departure-month")
    WebElement departureMonth;

    @FindBy(id="search-button")
    WebElement searchButton;

    public void setCruiseDestination(){
        Select cruiseSelectionDropDown = new Select(cruiseDestination);
        cruiseSelectionDropDown.selectByValue(cruiseDestinationEnum.BERMUDA.cruise());
    }

    public enum cruiseDestinationEnum{
        CARIBBEAN ("caribbean"),
        BAHAMAS ("bahamas"),
        MEXICO ("mexico"),
        ALASKA ("alaska"),
        EUROPE ("europe"),
        BERMUDA ("bermuda"),
        HAWAII ("bermuda"),
        CANADA_NEW_ENGLANG ("canada-new-england");

        private String cruise;

        cruiseDestinationEnum(String cruise){
            this.cruise = cruise;
        }

        public String cruise(){
            return cruise;
        }


    }

    public void selectDepartureMonth(){
        WebDriverWait wait = new WebDriverWait(driver,10);
                wait.until(ExpectedConditions.elementToBeClickable(departureMonth));
        departureMonth.click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Select departure = new Select(departureMonth);
        departure.selectByIndex(2);

    }

    public void clickSearch(){
        searchButton.click();
    }

}
