package com.dev.SeleniumFreeCodeCamp.com.demoqa.pages.elements;

import org.openqa.selenium.By;

import static com.dev.SeleniumFreeCodeCamp.utilities.GetUtility.getText;
import static com.dev.SeleniumFreeCodeCamp.utilities.WaitUtility.*;

public class DynamicPropertiesPage extends ElementsPage {
    private final By visibleAfterButton = By.id("visibleAfter");

    public String getVisibleAfterButtonText() {
        explicitWaitUntilVisible(30, visibleAfterButton);
        String visibleText = getText(visibleAfterButton);
        System.out.println("Button Text: " + visibleText);
        return visibleText;
    }

}
