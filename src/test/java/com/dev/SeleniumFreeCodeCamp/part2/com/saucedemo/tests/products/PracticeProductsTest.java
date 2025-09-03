package com.dev.SeleniumFreeCodeCamp.part2.com.saucedemo.tests.products;

import com.dev.SeleniumFreeCodeCamp.part2.com.saucedemo.base.BaseTest;
import com.dev.SeleniumFreeCodeCamp.part2.com.saucedemo.base.PracticeBaseTest;
import com.dev.SeleniumFreeCodeCamp.saucedemo.pages.ProductsPage;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PracticeProductsTest extends BaseTest {
    @Test
   protected void testProductsHeaderIsDisplayed() {
       ProductsPage productsPage = loginPage.logIntoApplication("standard_user", "secret_sauce");
        assertTrue(productsPage.isProductsHeaderDisplayed(), "\n Products Header Is Not Displayed \n");
   }
}
