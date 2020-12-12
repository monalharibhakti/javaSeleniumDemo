package com.automation.locators;

import com.automation.utils.DriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v84.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    @FindBy(xpath = "//input[@type='email']")
    public WebElement username;

    @FindBy(xpath = "//*[@id='identifierNext']/div/button")
    public WebElement nextButton;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement password;

    @FindBy(xpath = "//*[@id='passwordNext']/div/button")
    public WebElement loginButton;

    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
}
