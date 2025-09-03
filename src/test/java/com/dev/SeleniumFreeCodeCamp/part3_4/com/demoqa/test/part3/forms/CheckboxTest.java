package com.dev.SeleniumFreeCodeCamp.part3_4.com.demoqa.test.part3.forms;

import com.dev.SeleniumFreeCodeCamp.part3_4.com.demoqa.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;


public class CheckboxTest extends BaseTest {
    @Test
    public void testCheckBox() {
        var formsPage = homePage.goToForms().clickPracticeForm();
        formsPage.clickSportsCheckbox();
        formsPage.clickReadingCheckbox();
        formsPage.clickMusicCheckbox();
        formsPage.unclickReadingCheckbox();
        boolean isReadingCheckboxSelected = formsPage.isReadingSelected();
        Assert.assertTrue(isReadingCheckboxSelected, "\n Reading Checkbox is selected \n");
    }
}
