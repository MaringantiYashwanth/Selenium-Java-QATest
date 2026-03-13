package com.dev.SeleniumFreeCodeCamp.part3_4.com.demoqa.test.part4.modals;

import com.dev.SeleniumFreeCodeCamp.part3_4.com.demoqa.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ModalTest extends BaseTest {
    @Test
    public void testModalDialog() {
        var alertsFrameWindowPage = homePage.goToAlertsFramesWindowsCard();
        var modalDialogsPage = alertsFrameWindowPage.clickModalDialogs();
        modalDialogsPage.clickSmallModalButton();
        String actualText = modalDialogsPage.getSmallModalText();
        Assert.assertTrue(actualText.contains("small modal"), "\n The Message does not contain 'small modal' \n");
        modalDialogsPage.clickCloseButton();
    }
}
