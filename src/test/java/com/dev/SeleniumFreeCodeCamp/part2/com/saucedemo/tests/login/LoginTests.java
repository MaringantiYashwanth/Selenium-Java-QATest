package com.dev.SeleniumFreeCodeCamp.part2.com.saucedemo.tests.login;

import com.dev.SeleniumFreeCodeCamp.part2.com.saucedemo.base.BaseTest;
import com.dev.SeleniumFreeCodeCamp.saucedemo.pages.ProductsPage;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest {
    @Test
    public void testLoginErrorMessage() {
        loginPage.setUsername("standard_user");
        loginPage.setPassword("test123");
        loginPage.clickLoginButton();
        String actualMessage = loginPage.getErrorMessage();
        Assert.assertTrue(actualMessage.contains("Epic sadface"));
    }
}
