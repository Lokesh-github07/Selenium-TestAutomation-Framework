
package com.automation.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.automation.base.BaseTest;
import com.automation.driver.DriverFactory;
import com.automation.pages.LoginPage;
import com.automation.pages.InventoryPage;

public class LoginTest extends BaseTest {

    @Test
    public void validLoginTest() {

        // Step 1: Login
        LoginPage loginPage =
                new LoginPage(
                        DriverFactory.getDriver()
                );

        loginPage.login(
                "standard_user",
                "secret_sauce"
        );

        // Step 2: Verify successful login
        String currentUrl =
                DriverFactory.getDriver().getCurrentUrl();

        Assert.assertTrue(
                currentUrl.contains("inventory"),
                "Login failed"
        );

        // Step 3: Create InventoryPage object
        InventoryPage inventoryPage =
                new InventoryPage(
                        DriverFactory.getDriver()
                );

        // Step 4: Add backpack to cart
        inventoryPage.addBackpackToCart();

        // Step 5: Verify cart count
        Assert.assertEquals(
                inventoryPage.getCartCount(),
                "1",
                "Product was not added to cart"
        );

        // Step 6: Open cart
        inventoryPage.openCart();

        // Step 7: Verify cart page URL
        String cartUrl =
                DriverFactory.getDriver().getCurrentUrl();

        Assert.assertTrue(
                cartUrl.contains("cart"),
                "Shopping cart did not open"
        );
    }
}