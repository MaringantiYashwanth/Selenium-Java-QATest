package practice.dev.SeleniumFreeCodeCamp.part3_4.com.demoqa.test.part3.javascript.forms;

import com.dev.SeleniumFreeCodeCamp.practice.demoqa.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import practice.dev.SeleniumFreeCodeCamp.part3_4.com.demoqa.base.BaseTest;

import static com.dev.SeleniumFreeCodeCamp.practice.demoqa.pages.HomePage.goToForms;


public class RadioButtonTest extends BaseTest {
    @Test
    public void testRadioButton() {
        var formsPage = goToForms().clickPracticeForm();
        formsPage.clickFemaleRadioButton();
        boolean isFemaleRadioButtonSelected = formsPage.isFemaleSelected();
        Assert.assertTrue(isFemaleRadioButtonSelected, "\n Radio button is not selected\n");
    }
}
