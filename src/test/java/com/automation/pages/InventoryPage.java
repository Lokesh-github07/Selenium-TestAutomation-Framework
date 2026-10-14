
package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InventoryPage {

    WebDriver driver;

    // Constructor
    public InventoryPage(WebDriver driver) {
        this.driver = driver;
    }

    // Locator for Sauce Labs Backpack
    By backpackAddToCart =
            By.id("add-to-cart-sauce-labs-backpack");

    // Locator for shopping cart
    By shoppingCart =
            By.className("shopping_cart_link");

    // Locator for cart badge
    By cartBadge =
            By.className("shopping_cart_badge");

    // Add backpack to cart
    public void addBackpackToCart() {
        driver.findElement(backpackAddToCart).click();
    }

    // Open shopping cart
    public void openCart() {
        driver.findElement(shoppingCart).click();
    }

    // Get cart item count
    public String getCartCount() {
        return driver.findElement(cartBadge).getText();
    }
}