package com.dev.SeleniumFreeCodeCamp.practice.demoqa.pages.forms;

import com.dev.SeleniumFreeCodeCamp.com.demoqa.pages.forms.FormsPage;
import com.dev.SeleniumFreeCodeCamp.practice.demoqa.pages.HomePage;
import org.openqa.selenium.By;

import static com.dev.SeleniumFreeCodeCamp.practice.demoqa.pages.utility.JavascriptUtility.clickJS;
import static com.dev.SeleniumFreeCodeCamp.practice.demoqa.pages.utility.JavascriptUtility.scrollToElementsJS;

public class PracticeFormsPage extends FormsPage {
    private By femaleRadioButton = By.id("gender-radio-2");

    public void clickFemaleRadioButton() {
        scrollToElementsJS(femaleRadioButton);
        clickJS(femaleRadioButton);
    }
    public boolean isFemaleSelected() {
        return find(femaleRadioButton).isSelected();
    }

}
