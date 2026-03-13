package com.dev.SeleniumFreeCodeCamp.part3_4.com.demoqa.test.part4.windows;

import com.dev.SeleniumFreeCodeCamp.com.demoqa.pages.alerts_frames_windows.BrowserWindowsPage;
import com.dev.SeleniumFreeCodeCamp.part3_4.com.demoqa.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.dev.SeleniumFreeCodeCamp.utilities.GetUtility.getURL;

public class WindowsTest extends BaseTest {
    @Test
    public void testNewWindowsURL() {
        BrowserWindowsPage windowsPage = homePage.goToAlertsFramesWindowsCard().clickBrowserWindows();
        windowsPage.clickNewWindowButton();
        windowsPage.switchToNewWindow();
        String actualURL = getURL();
        String expectedURL = "https://demoqa.com/sample";
        Assert.assertEquals(actualURL, expectedURL, "\n Actual & Expected URLs do not match.\n");
    }
}
