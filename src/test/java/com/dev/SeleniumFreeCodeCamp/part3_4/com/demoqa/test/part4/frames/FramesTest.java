package com.dev.SeleniumFreeCodeCamp.part3_4.com.demoqa.test.part4.frames;

import com.dev.SeleniumFreeCodeCamp.part3_4.com.demoqa.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FramesTest extends BaseTest {
    @Test
    public void testFramesBigBox() {
        var framesPage = homePage.goToAlertsFramesWindowsCard().clickFrames();
        String actualBigTextBox = framesPage.getTextInBigFrame();
        String expectedBigTextBox = "This is a sample page";
        Assert.assertEquals(actualBigTextBox, expectedBigTextBox, "\n Actual & Expected test cases do not match \n");
        String actualHeaderText = framesPage.getHeaderFramesText();
        String expectedHeaderText = "Frames";
        Assert.assertEquals(actualHeaderText, expectedHeaderText, "\n Actual & Expected test cases do not match\n");
    }

    @Test
    public void testFramesSmallBox() {
        var framesPage = homePage.goToAlertsFramesWindowsCard().clickFrames();
        String actualSmallBoxText = framesPage.getTextInSmallFrame();
        String expectedSmallBoxText = "This is a sample page";
        Assert.assertEquals(actualSmallBoxText, expectedSmallBoxText, "\n Actual & Expected Text Do Not Match\n");
        String actualHeaderText = framesPage.getHeaderFramesText();
        String expectedHeaderText = "Frames";
        Assert.assertEquals(actualHeaderText, expectedHeaderText, "\n Actual & Expected Text Do Not Match\n");
    }
}
