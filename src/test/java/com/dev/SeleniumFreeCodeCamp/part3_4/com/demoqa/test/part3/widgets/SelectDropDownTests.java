package com.dev.SeleniumFreeCodeCamp.part3_4.com.demoqa.test.part3.widgets;

import com.dev.SeleniumFreeCodeCamp.part3_4.com.demoqa.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.base.BasePage.delay;
import java.util.List;
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
        List<String> actualSelectedOptions = selectMenuPage.getAllSelectedStandardMultiOptions();
        Assert.assertTrue(actualSelectedOptions.contains("Volvo"));
        Assert.assertTrue(actualSelectedOptions.contains("Opel"));
        Assert.assertTrue(actualSelectedOptions.contains("Saab"), "\n Saab is selected as an option. \n");
        Assert.assertTrue(actualSelectedOptions.contains("Audi"));
    }
}
