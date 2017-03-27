package com.framework.arild;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Arild on 3/22/2017.
 */
public class signInPage {

    WebDriver driver;

    public signInPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }


    @FindBy (id = "signInheader")
    WebElement signInHeader;

    @FindBy (id = "signin-loginid")
    WebElement signInId;

    @FindBy (id = "signin-password")
    WebElement signInPassword;

    @FindBy (id = "submitButton")
    WebElement submitButton;

    @FindBy (id = "header-account-menu")
    WebElement accountMenu;

    public void SignIn(){
        signInId.sendKeys("arildsa@gmail.com");
        signInPassword.sendKeys("password");
        submitButton.click();
    }


}
