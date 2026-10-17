package com.automation.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.automation.base.BaseTest;
import com.automation.driver.DriverFactory;
import com.automation.pages.GooglePage;

public class GoogleTest extends BaseTest {

    @Test
    public void googleSearchTest() {

        GooglePage googlePage =
                new GooglePage(
                        DriverFactory.getDriver()
                );

        googlePage.search("Selenium");

        String title =
                googlePage.getPageTitle();

        System.out.println(
                "Page Title: " + title
        );

        Assert.assertTrue(
                title.toLowerCase().contains("selenium")
        );
    }
}