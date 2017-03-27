package com.tests.arild;

import com.framework.arild.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


/**
 * Created by Arild on 1/18/2017.
 */
public class frontpageTests {

    private WebDriver driver;
    private String baseUrl;
    private frontpagePage frontPage;
    private signInPage signInPage;



    @BeforeClass
    public void beforeClass(){
        System.setProperty("webdriver.gecko.driver","C:\\geckodriver\\geckodriver.exe");
        driver = new FirefoxDriver();
        baseUrl = "http://www.expedia.com";
        driver.navigate().to(baseUrl);
        frontPage = new frontpagePage(driver);
        frontPage.closeAccountMenu();

    }


    @AfterClass
    public void afterClass(){
       driver.quit();
    }

//    @Test
//    public void signIn(){
//        frontPage.accountSignIn();
//        signInPage.SignIn();
//    }

    @Test
    public void testTabHome() {
        frontPage.clickHome();
    }

    @Test
    public void testTabDeals() {
        frontPage.clickTabDeals();
    }

    @Test
    public void testTabARewards() {
        frontPage.clickTabRewards();
    }

    @Test
    public void testTabBundleDeals() {
        frontPage.clickTabBundleDeals();
    }

    @Test
    public void testTabHotels() {
        frontPage.clickTabHotels();
    }

    @Test
    public void testTabCars() {
        frontPage.clickTabCars();
    }

    @Test
    public void testTabFlights() {
        frontPage.clickTabFlights();
    }

    @Test
    public void testTabCruises() {
        frontPage.clickTabCruises();
    }

    @Test
    public void testTabThingsToDo() {
        frontPage.clickTabThingsToDo();
    }

    @Test
    public void testTabVacationRentals() {
        frontPage.clickTabVacationRentals();
    }



    @Test
    public void testTabMobile() {
        frontPage.clickTabMobile();
    }

}
