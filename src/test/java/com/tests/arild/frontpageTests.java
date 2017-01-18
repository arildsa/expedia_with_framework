package com.tests.arild;

import com.framework.arild.frontpagePage;
import com.framework.arild.searchResultsFlights;
import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Arild on 1/18/2017.
 */
public class frontpageTests {

    WebDriver driver;
    String baseUrl;
    frontpagePage frontPage;
    searchResultsFlights searchResults;


    @BeforeEach
    public void beforeClass(){
        System.setProperty("webdriver.gecko.driver","C:\\geckodriver\\geckodriver.exe");
        driver = new FirefoxDriver();
        baseUrl = "http://www.expedia.com";
        driver.navigate().to(baseUrl);

        frontPage = new frontpagePage(driver);
        searchResults = new searchResultsFlights(driver);

    }

    @AfterEach
    public void afterClass(){
//        driver.quit();
    }

    @Test
    public void searchForFlights(){
        frontPage.clickHomeTab();
        frontPage.clickSearchForFlightsTab();
        frontPage.enterDepartureCityOrAirport("DENVER");
        frontPage.enterArrivalCityOrAirport("HONOLULU");
        frontPage.pickDepartureDate();
        frontPage.clickSearch();

        Assert.assertEquals(searchResults.getSearchResultHeaderText(),"Select your departure to Honolulu");

    }
}
