package com.dev.SeleniumFreeCodeCamp.part3_4.com.demoqa.test.part4.interactions;

import com.dev.SeleniumFreeCodeCamp.part3_4.com.demoqa.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class KeyboardTest extends BaseTest {
    public void testApplicationUsingKeyboard() {
        var textBoxPage = homePage.goToElements().clickTextBox();
        textBoxPage.setFullName("Yashwanth Maringanti");
        textBoxPage.setEmail("yashwanthmaringanti@gmail.com");
        textBoxPage.setCurrentAddressField("1234 Selenium Avenue");
        textBoxPage.setCurrentAddressField("Suite 3500");
        textBoxPage.setCurrentAddressField("Dallas Texas");

        textBoxPage.clickSubmitButton();
        String actualAddress = textBoxPage.getCurrentAddress();
        Assert.assertEquals(actualAddress.contains("Suite 3500"), "\n Actual address does not contain Suite 3500 \n");
    }
}
