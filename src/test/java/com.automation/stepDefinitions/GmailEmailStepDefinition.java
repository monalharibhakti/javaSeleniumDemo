package com.automation.stepDefinitions;

import com.automation.locators.HomePage;
import com.automation.locators.LoginPage;
import com.automation.utils.DriverUtils;
import com.automation.utils.WaitHelpers;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import testData.TestData;

public class GmailEmailStepDefinition{

    LoginPage loginPage;
    HomePage homePage ;
    private WebDriver driver;

    @When("user is on Gmail login page")
    public void user_is_on_gmail_login_page() {
        driver = DriverUtils.getBrowser("chrome");
        driver.get(TestData.URL);
      loginPage = new LoginPage(driver);
      homePage = new HomePage(driver);
    }

    @And("enter username and continue")
    public void enter_username_and_continue() {
        WaitHelpers.waitUntilVisibility(loginPage.username);
        loginPage.username.sendKeys(TestData.USERNAME);
        loginPage.nextButton.click();
    }

    @And("enter password and login")
    public void enter_password_and_login() {
        WaitHelpers.waitUntilVisibility(loginPage.password);
        loginPage.password.sendKeys(TestData.PASSWORD);
        WaitHelpers.waitUntilClickable(loginPage.loginButton);
        loginPage.loginButton.click();
    }

    @And("verify Compose button is displayed")
    public void compose_button_is_displayed() {
        WaitHelpers.waitUntilVisibility(homePage.composeButton);
        Assert.assertTrue("Compose button is not displayed", homePage.composeButton.isDisplayed());
    }

    @And("user compose an email by enter to, subject and email body")
    public void compose_email() {
        homePage.composeEmail();
    }

    @Then("verify user can send the email")
    public void verify_send_button_is_clickable(){
        boolean isClickable = homePage.sendEmail.isDisplayed();
        Assert.assertTrue("Send button is not clickable, user cannot send email", isClickable);
    }

}

