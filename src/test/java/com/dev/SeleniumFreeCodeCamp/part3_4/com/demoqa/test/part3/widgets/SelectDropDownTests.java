package com.dev.SeleniumFreeCodeCamp.part3_4.com.demoqa.test.part3.widgets;

import com.dev.SeleniumFreeCodeCamp.part3_4.com.demoqa.base.BaseTest;
import org.testng.annotations.Test;

import static com.base.BasePage.delay;

public class SelectDropDownTests extends BaseTest {

    @Test
    public void testMultiSelectDropDown() {
        var selectMenuPage = homePage.goToWidgets().clickSelectMenu();
        delay(1000);
        selectMenuPage.selectStandardMulti("Volvo");
        delay(1000);
        selectMenuPage.selectStandardMulti(1);
        delay(1000);
        selectMenuPage.selectStandardMulti("Audi");
        delay(1000);
        selectMenuPage.selectStandardMulti(2);
        delay(1000);
        selectMenuPage.deselectStandardMulti("saab");
    }
}
