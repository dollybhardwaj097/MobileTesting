package com.browserstack;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class TrueCallerTest extends AppiumTest {

    @Test
    public void loginTest() throws Exception {
        WebElement usernameField =  new WebDriverWait(driver, Duration.ofSeconds(30)).until(
                ExpectedConditions.elementToBeClickable(AppiumBy.id("com.truecaller:id/username_field")));
        usernameField.sendKeys("helloworld");

        WebElement passwordField =  new WebDriverWait(driver, Duration.ofSeconds(30)).until(
                ExpectedConditions.elementToBeClickable(AppiumBy.id("com.truecaller:id/password_field")));
        passwordField.sendKeys("testing123");

        WebElement loginButton = new WebDriverWait(driver, Duration.ofSeconds(30)).until(
                ExpectedConditions.elementToBeClickable(AppiumBy.id("com.truecaller:id/login_button")));
        loginButton.click();

        WebElement homeScreenTitle =new WebDriverWait(driver, Duration.ofSeconds(30)).until(
                ExpectedConditions.elementToBeClickable(AppiumBy.id("com.truecaller:id/home_screen_title")));
        Assert.assertEquals(homeScreenTitle.getText(), "Home");
    }
}
