package com.dev.SeleniumFreeCodeCamp.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static com.base.BasePage.find;


public class ActionsUtility extends Utility {
    private static Actions act() {
        return new Actions(driver);
    }

    public static void dragAndDropBy(WebElement source, int x, int y) {
        act().dragAndDropBy(source, x, y).perform();
    }

    public static void sendKeys(WebElement source, CharSequence keys) {
        act().sendKeys(source, keys).perform();
    }
}
