package com.dev.SeleniumFreeCodeCamp.part3_4.com.demoqa.test.part4.dynamic_wait;

import com.dev.SeleniumFreeCodeCamp.part3_4.com.demoqa.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DynamicWaitTests extends BaseTest {
    @Test
    public void testVisibleAfterButtonText() {
        var dynamicPage = homePage.goToElements().clickDynamicProperties();
        String actualText = dynamicPage.getVisibleAfterButtonText();
        String expectedText = "Visible After 5 Seconds";
        Assert.assertEquals(actualText, expectedText, "\n Actual & Expected Text Do Not Match. \n");
    }

    @Test
    public void testProgressBar() {
        var progressBarPage = homePage.goToWidgets().clickProgressBar();
        progressBarPage.clickStartButton();
        String actualValue = progressBarPage.getProgressValue();
        String expectedValue = "100%";
        assertEquals(actualValue, expectedValue, "\n Value is not 100% \n");
    }


}
