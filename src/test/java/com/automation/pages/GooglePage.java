package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GooglePage {

    private WebDriver driver;

    // Locators
    private By searchBox = By.name("q");

    // Constructor
    public GooglePage(WebDriver driver) {
        this.driver = driver;
    }

    // Actions
    public void search(String text) {

        driver.findElement(searchBox)
              .sendKeys(text);

        driver.findElement(searchBox)
              .submit();
    }

    public String getPageTitle() {
        return driver.getTitle();
    }
}