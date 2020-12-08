package com.automation.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DriverUtils {

    public static WebDriver webdriver;

    public static WebDriver getBrowser(String browser) {

        if (browser.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", "F:\\Selenium Webdriver\\Drivers\\chromedriver.exe");
            webdriver = new ChromeDriver();

        } else if (browser.equals("firefox")) {
            System.setProperty("webdriver.gecko.driver", "F:\\Selenium Webdriver\\Drivers\\geckodriver.exe");
            webdriver = new FirefoxDriver();
        }

        return webdriver;
    }
}
