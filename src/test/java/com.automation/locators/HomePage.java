package com.automation.locators;

import com.automation.utils.DriverUtils;
import com.automation.utils.WaitHelpers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testData.TestData;

public class HomePage {

    @FindBy(xpath = "//div[contains(text(),\"Compose\")]")
    public WebElement composeButton;

    @FindBy(xpath= "//textarea[@aria-label='To']")
    public WebElement toField;

    @FindBy(xpath = "//input[@name='subjectbox']")
    public WebElement subjectField;

    @FindBy(xpath = "//div[@role='textbox']")
    public WebElement emailBody;

    @FindBy(xpath = "//div[contains(text(),'Send') and @role='button']")
    public WebElement sendEmail;

    @FindBy(xpath = "//div[contains(text(),'New Message')]")
    public WebElement newMessageSection;

    public HomePage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public void composeEmail(){
        composeButton.click();
        WaitHelpers.waitUntilVisibility(newMessageSection);
        toField.sendKeys(TestData.TO_EMAIL);
        subjectField.sendKeys(TestData.SUBJECT);
        emailBody.sendKeys(TestData.EMAIL_BODY);
    }
}
