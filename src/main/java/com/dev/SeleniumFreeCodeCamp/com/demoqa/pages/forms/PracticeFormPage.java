package com.dev.SeleniumFreeCodeCamp.com.demoqa.pages.forms;

import com.dev.SeleniumFreeCodeCamp.utilities.JavaScriptUtility;
import org.openqa.selenium.By;

import static com.dev.SeleniumFreeCodeCamp.utilities.JavaScriptUtility.clickJS;
import static com.dev.SeleniumFreeCodeCamp.utilities.JavaScriptUtility.scrollToElementJS;

public class PracticeFormPage extends FormsPage {
    private final By femaleRadioButton = By.id("gender-radio-2");
    private final By sportsHobbyCheckbox = By.id("hobbies-checkbox-1");
    private final By readingHobbyCheckbox = By.id("hobbies-checkbox-2");
    private final By musicHobbyCheckbox = By.id("hobbies-checkbox-3");


    public void clickFemaleRadioButton() {
        scrollToElementJS(femaleRadioButton);
        clickJS(femaleRadioButton);
    }

    public boolean isFemaleSelected() {
        return find(femaleRadioButton).isSelected();
    }

    public void clickSportsCheckbox() {
        if (!find(sportsHobbyCheckbox).isSelected()) {
            scrollToElementJS(sportsHobbyCheckbox);
            JavaScriptUtility.clickJS(sportsHobbyCheckbox);
        }
    }

    public void clickReadingCheckbox() {
        if (!find(readingHobbyCheckbox).isSelected()) {
            scrollToElementJS(readingHobbyCheckbox);
            JavaScriptUtility.clickJS(readingHobbyCheckbox);
        }
    }

    public void unclickReadingCheckbox() {
        if (find(readingHobbyCheckbox).isSelected()) {
            scrollToElementJS(readingHobbyCheckbox);
            JavaScriptUtility.clickJS(readingHobbyCheckbox);
        }
    }

    public boolean isReadingSelected() {
        return find(readingHobbyCheckbox).isSelected();
    }

    public void clickMusicCheckbox() {
        if (!find(musicHobbyCheckbox).isSelected()) {
            scrollToElementJS(musicHobbyCheckbox);
            JavaScriptUtility.clickJS(musicHobbyCheckbox);
        }
    }
}















