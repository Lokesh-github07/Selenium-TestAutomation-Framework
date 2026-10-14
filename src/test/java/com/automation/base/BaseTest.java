
package com.automation.base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.automation.driver.DriverFactory;
import com.automation.utils.ConfigReader;

public class BaseTest {

    @BeforeMethod
    public void setUp() {

        // Read browser and URL from config.properties
        String browser = ConfigReader.get("browser");
        String baseUrl = ConfigReader.get("baseUrl");

        System.out.println("=================================");
        System.out.println("Starting Test");
        System.out.println("Browser: " + browser);
        System.out.println("URL: " + baseUrl);
        System.out.println("=================================");

        // Start browser
        DriverFactory.initDriver(browser);

        // Open application
        DriverFactory.getDriver().get(baseUrl);
    }

    @AfterMethod
    public void tearDown() {

        System.out.println("Test completed.");

        // Keep browser open for 5 seconds
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        // Close browser
        DriverFactory.quitDriver();

        System.out.println("Browser closed.");
    }
}