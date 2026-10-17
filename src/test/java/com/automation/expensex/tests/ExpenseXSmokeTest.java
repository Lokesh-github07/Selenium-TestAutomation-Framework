
package com.automation.expensex.tests;

import com.automation.expensex.base.BaseTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ExpenseXSmokeTest extends BaseTest {

    @Test
    public void shouldOpenExpenseXLoginPage() {

        Assert.assertTrue(
            driver.getCurrentUrl().contains("/login"),
            "ExpenseX login page did not open."
        );

        System.out.println(
            "ExpenseX login page opened successfully."
        );

        System.out.println(
            "Current URL: " + driver.getCurrentUrl()
        );
    }
}
