package com.dev.SeleniumFreeCodeCamp.com.demoqa.pages.widgets;

import com.dev.SeleniumFreeCodeCamp.com.demoqa.pages.HomePage;
import org.openqa.selenium.By;

import static com.dev.SeleniumFreeCodeCamp.utilities.JavaScriptUtility.scrollToElementJS;

public class WidgetsPage extends HomePage {
    private final By selectMenuItem = By.xpath("//li[@id='item-8']//span[text()='Select Menu']");

    public SelectMenuPage clickSelectMenu() {
        scrollToElementJS(selectMenuItem);
        click(selectMenuItem);
        return new SelectMenuPage();
    }
}
