package com.framework.arild;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;


/**
 * Created by Arild on 1/18/2017.
 */
public class frontpagePage {

    WebDriver driver;

    public frontpagePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "primary-header-home")
    WebElement tabHome;

    @FindBy(id = "tab-flight-tab")
    WebElement searchForFlights;

    @FindBy(id = "flight-origin")
    WebElement departureCityOrAiport;

    @FindBy(id = "flight-destination")
    WebElement arrivalCityOrAiport;

    //Autocomplete for the City or Aiport field
    @FindAll(@FindBy(xpath = ".//li[@class='results-item']//*[@class='main-suggestion']//b") )
    List<WebElement> autocompleteCityAirport;

    @FindBy(id = "flight-departing")
    WebElement departingDate;


    public void clickHomeTab(){
        tabHome.click();
    }

    public void clickSearchForFlightsTab(){
        try{
            searchForFlights.click();
        }
        catch (Exception e){
            driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
            searchForFlights.click();
        }
    }

    public void airportPicker(){
        WebDriverWait wait = new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(".//*[@class='results']"))));
        autocompleteCityAirport.get(0).click();
    }

    public void airportPicker(int airportSelection){
        WebDriverWait wait = new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(".//*[@class='results']"))));
        autocompleteCityAirport.get(airportSelection).click();
    }



    public void enterDepartureCityOrAirport(String departureCityAirport){
        driver.findElement(By.xpath(".//*[@id='flight-origin-label']//span[@class='visuallyhidden']")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        departureCityOrAiport.sendKeys(departureCityAirport);
        airportPicker();
    }

    public void enterArrivalCityOrAirport(String arrivalCityAirport) {
        driver.findElement(By.xpath(".//*[@id='flight-destination-label']//span[@class='visuallyhidden']")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        arrivalCityOrAiport.sendKeys(arrivalCityAirport);
        airportPicker();

    }

    public void pickDepartureDate(){
        driver.findElement(By.xpath(".//span[contains(text(),'Departing')]//span[@class='visuallyhidden']"));
        departingDate.sendKeys("02/12/2017");
    }

    public void pickReturnDate(){

    }
}
