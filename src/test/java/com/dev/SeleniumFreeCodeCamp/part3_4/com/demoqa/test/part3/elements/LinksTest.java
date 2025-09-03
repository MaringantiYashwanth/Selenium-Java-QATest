package com.dev.SeleniumFreeCodeCamp.part3_4.com.demoqa.test.part3.elements;

import com.dev.SeleniumFreeCodeCamp.part3_4.com.demoqa.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LinksTest extends BaseTest {
    @Test
    public void testLinks() {
        var linksPage = homePage.goToElements().clickLinks();
        linksPage.clickBadRequestLink();
        String actualResponse = linksPage.getResponse();
        Assert.assertTrue(actualResponse.contains("400") && actualResponse.contains("Bad Request"),
                "\n Actual Response (" + actualResponse +
                        ") Does not contain '400' and 'Bad Request'" +
                        "\n");
    }
}
