package com.dev.SeleniumFreeCodeCamp.part3_4.com.demoqa.test.part4.interactions;

import com.dev.SeleniumFreeCodeCamp.part3_4.com.demoqa.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SliderTest extends BaseTest {
    @Test
    public void testSliderResult() {
        int x = 180, y = 0;
        var sliderPage = homePage.goToWidgets().clickSlider();
        sliderPage.moveSlider(x, y);
        String actualValue = sliderPage.getSliderValue();
        String expectedValue = "95";
        Assert.assertEquals(actualValue, expectedValue, "\n Actual and Expected Values Do Not Match\n");
    }
}
