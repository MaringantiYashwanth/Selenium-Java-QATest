package com.dev.SeleniumFreeCodeCamp.part2.com.saucedemo.tests.products;

import com.dev.SeleniumFreeCodeCamp.part2.com.saucedemo.base.BaseTest;
import com.dev.SeleniumFreeCodeCamp.saucedemo.pages.ProductsPage;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ProductsTest extends BaseTest {
    @Test
    public void testProductsHeaderIsDisplayed() {
        ProductsPage productsPage = loginPage.logIntoApplication("standard_user", "secret_sauce");
        assertTrue(productsPage.isProductsHeaderDisplayed(), "\n Products Header is not displayed \n");
    }
}
