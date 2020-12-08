package com.automation.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

    @FindBy(xpath = "//input[@type=\"email\"]")
    public WebElement username;

    @FindBy(xpath = "//*[@id=\"identifierNext\"]/div/button")
    public WebElement nextButton;

    @FindBy(xpath = "//input[@type=\"password\"]")
    public WebElement password;

    @FindBy(xpath = "//*[@id=\"passwordNext\"]/div/button")
    public WebElement loginButton;
}
