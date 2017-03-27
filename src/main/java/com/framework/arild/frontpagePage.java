package com.framework.arild;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


/**
 * Created by Arild on 1/18/2017.
 */
public class frontpagePage {

    WebDriver driver;
    private customCommands util;


    public frontpagePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
        util = new customCommands(driver);
    }


    @FindBy(id = "primary-header-home")
    WebElement tabHome;

    @FindBy(id = "primary-header-package")
    WebElement tabBundleDeals;

    @FindBy(id = "primary-header-hotel")
    WebElement tabHotels;

    @FindBy ( id = "primary-header-car")
    WebElement tabCars;

    @FindBy ( id = "primary-header-flight")
    WebElement tabFlights;

    @FindBy ( id = "primary-header-cruise")
    WebElement tabCruises;

    @FindBy ( id = "primary-header-activity")
    WebElement tabThingsToDo;

    @FindBy ( id = "primary-header-vacationRental")
    WebElement tabVacationRentals;

    @FindBy ( id = "primary-header-deals")
    WebElement tabDeals;

    @FindBy ( id = "primary-header-rewards")
    WebElement tabRewards;

    @FindBy ( id = "primary-header-mobile")
    WebElement tabMobile;

    @FindBy (xpath = ".//*[contains(text(),'Search Vacation Packages')]")
    WebElement bundleDealsHeader;

    @FindBy (xpath = ".//*[contains(text(),'Search Hotels')]")
    WebElement hotelHeader;

    @FindBy (xpath = ".//*[contains(text(),'Search Rental Car Deals')]")
    WebElement rentalCarHeader;

    @FindBy (xpath = ".//*[contains(text(),'Search Flights')]")
    WebElement flightsHeader;

    @FindBy (xpath = ".//*[contains(text(),'Search Cruises')]")
    WebElement cruisesHeader;

    @FindBy (xpath = ".//*[contains(text(),'Search Things To Do')]")
    WebElement thingsToDoHeader;

    @FindBy (xpath = ".//*[contains(text(),'Search Vacation Rentals')]")
    WebElement vacationRentalsHeader;

    @FindBy (xpath = ".//*[contains(text(),'s Travel Deals')]")
    WebElement dealsHeader;

    @FindBy (xpath = ".//a[contains(text(),'Benefits at a glance')]")
    WebElement benefitsAtAGlance;

    @FindBy (xpath = ".//*[contains(text(),'Why use the app?')]")
    WebElement whyUseTheApp;

    @FindBy (id = "header-account-menu")
    WebElement accountMenu;

    @FindBy (id = "account-signin")
    WebElement accountSignIn;





    public void clickHome(){
        util.utilClickElement(tabHome);
    }

    public void clickTabBundleDeals(){
        util.utilClickElement(tabBundleDeals);
        util.waitUntilElementIsVisible(bundleDealsHeader);

    }

    public void clickTabHotels(){
        util.utilClickElement(tabHotels);
        util.waitUntilElementIsVisible(hotelHeader);
    }

    public void clickTabCars(){
        util.utilClickElement(tabCars);
        util.waitUntilElementIsVisible(rentalCarHeader);
    }

    public void clickTabRewards(){
        util.utilClickElement(tabRewards);
        util.waitUntilBrowserURLContains("howitworks");
    }

    public void clickTabFlights(){
        util.utilClickElement(tabFlights);
        util.waitUntilElementIsVisible(flightsHeader);
    }

    public void clickTabCruises(){
        util.utilClickElement(tabCruises);
        util.waitUntilElementIsVisible(cruisesHeader);
    }

    public void clickTabThingsToDo(){
        util.utilClickElement(tabThingsToDo);
        util.waitUntilElementIsVisible(thingsToDoHeader);
    }

    public void clickTabVacationRentals(){
        util.utilClickElement(tabVacationRentals);
        util.waitUntilElementIsVisible(vacationRentalsHeader);
    }

    public void clickTabDeals(){
        util.utilClickElement(tabDeals);
        util.waitUntilElementIsVisible(dealsHeader);
    }



    public void clickTabMobile(){
        util.utilClickElement(tabMobile);
        util.waitUntilElementIsVisible(whyUseTheApp);
    }

    public void accountSignIn(){
        if(accountSignIn.isDisplayed())
        {
            accountSignIn.click();
        }
        else {
            accountMenu.click();
            accountSignIn.click();
        }
    }

    public void closeAccountMenu(){
        if( accountSignIn.isDisplayed()){
            accountMenu.click();
        }
    }


}
