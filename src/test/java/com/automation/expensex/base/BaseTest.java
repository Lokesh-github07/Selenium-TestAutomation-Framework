
package com.automation.expensex.base;

import com.automation.framework.driver.DriverFactory;
import com.automation.framework.config.ConfigReader;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    protected WebDriver driver;

   
    public void setUp() {

        // Read browser and application URL from config.properties
    	String browser = ConfigReader.getProperty("browser");
    	String baseUrl = ConfigReader.getProperty("base.url");

        System.out.println("=================================");
        System.out.println("Starting ExpenseX Test");
        System.out.println("Browser: " + browser);
        System.out.println("URL: " + baseUrl);
        System.out.println("=================================");

        // Initialize browser
        DriverFactory.initDriver(browser);

        // Get the initialized WebDriver
        driver = DriverFactory.getDriver();

        // Maximize browser window
        driver.manage().window().maximize();

        // Open ExpenseX login page
        driver.get(baseUrl + "/login");
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {

        try {
            System.out.println("ExpenseX test completed.");

            // Close browser if initialized
            DriverFactory.quitDriver();

        } finally {
            driver = null;
            System.out.println("Browser closed.");
        }
    }
}
