package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;

    // Locators
    private By usernameField =
            By.id("pandelokesh18@gmail.com");

    private By passwordField =
            By.id("Lp2004@12");

    private By loginButton =
            By.id("login-button");
    
    

    // Constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // Actions
    public void enterUsername(String username) {
        driver.findElement(usernameField)
              .sendKeys(username);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordField)
              .sendKeys(password);
    }

    public void clickLogin() {
        driver.findElement(loginButton)
              .click();
    }

    public void login(String username, String password) {

        enterUsername(username);
        enterPassword(password);
        clickLogin();
    }
}