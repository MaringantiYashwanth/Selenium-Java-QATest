package com.dev.SeleniumFreeCodeCamp.part3_4.com.demoqa.test.part3.forms;


import com.dev.SeleniumFreeCodeCamp.com.demoqa.pages.forms.FormsPage;
import com.dev.SeleniumFreeCodeCamp.part3_4.com.demoqa.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RadioButtonTest extends BaseTest {
    @Test
    public void testRadioButton() {
        var formsPage = homePage.goToForms().clickPracticeForm();
//        formsPage.clickPracticeForm();
        formsPage.clickFemaleRadioButton();
        boolean isFemaleRadioButtonSelected = formsPage.isFemaleSelected();
        Assert.assertTrue(isFemaleRadioButtonSelected, "\n The Female Radio Button is not selected. \n");
    }


}
