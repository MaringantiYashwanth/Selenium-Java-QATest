package com.dev.SeleniumFreeCodeCamp.part2.com.saucedemo.tests.login;

import com.dev.SeleniumFreeCodeCamp.part2.com.saucedemo.base.PracticeBaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PracticeLoginTests extends PracticeBaseTest {
    @Test
    public void testLoginErrorMessage() {
        loginPage.setUsername("standard_user");
        loginPage.setPassword("test123");
        loginPage.clickLoginButton();
        String actualMessage = loginPage.getErrorMessage();
//        Assert.assertEquals(actualMessage, "Epic Sad Face");
        Assert.assertFalse(actualMessage.contains("Epic sadface"));
    }
}
