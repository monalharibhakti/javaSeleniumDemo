package com.automation.locators;

import com.automation.utils.WaitHelpers;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testData.TestData;

public class HomePage {

    @FindBy(xpath = "//*[@id=\":jm\"]/div/div")
    public WebElement composeButton;

    @FindBy(xpath= "//textarea[@aria-label=\"To\"]")
    public WebElement toField;

    @FindBy(xpath = "//input[@name=\"subjectbox\"]")
    public WebElement subjectField;

    @FindBy(xpath = "//div[@role=\"textbox\"]")
    public WebElement emailBody;

    @FindBy(xpath = "//div[contains(text(),'Send') and @role=\"button\"]")
    public WebElement sendEmail;

    @FindBy(xpath = "/html/body/div[24]/div/div/div/div[1]/div[3]/div[1]/div[1]/div")
    public WebElement newMessageSection;

    public void composeEmail(){
        WaitHelpers.waitUntilVisibility(newMessageSection);
        toField.sendKeys(TestData.TO_EMAIL);
        subjectField.sendKeys(TestData.SUBJECT);
        emailBody.sendKeys(TestData.EMAIL_BODY);
    }
}
