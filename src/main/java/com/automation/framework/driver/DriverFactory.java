
package com.automation.framework.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public final class DriverFactory {

    private static WebDriver driver;

    private DriverFactory() {
        // Prevent object creation
    }

    public static WebDriver initDriver(String browser) {

        if (browser == null || browser.isBlank()) {
            throw new IllegalArgumentException(
                "Browser name must not be empty."
            );
        }

        switch (browser.trim().toLowerCase()) {

            case "chrome":
                driver = new ChromeDriver();
                break;

            case "edge":
                driver = new EdgeDriver();
                break;

            default:
                throw new IllegalArgumentException(
                    "Unsupported browser: " + browser
                );
        }

        driver.manage().window().maximize();

        return driver;
    }

    public static WebDriver getDriver() {

        if (driver == null) {
            throw new IllegalStateException(
                "WebDriver is not initialized. Call initDriver() first."
            );
        }

        return driver;
    }

    public static void quitDriver() {

        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
