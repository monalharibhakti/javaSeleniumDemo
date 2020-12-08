package com.automation.utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitHelpers {

    public static void waitUntilClickable(WebElement locator) {
        WebDriverWait wait = new WebDriverWait(DriverUtils.webdriver, 60);
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    public static void waitUntilVisibility(WebElement locator) {
        WebDriverWait wait = new WebDriverWait(DriverUtils.webdriver, 60);
        wait.until(ExpectedConditions.visibilityOf(locator));
    }

}
