package com.dev.SeleniumFreeCodeCamp.practice.demoqa.pages;

import com.base.BasePage;
import com.dev.SeleniumFreeCodeCamp.com.demoqa.pages.forms.FormsPage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static com.dev.SeleniumFreeCodeCamp.practice.demoqa.pages.utility.JavascriptUtility.scrollToElementsJS;


public class HomePage extends BasePage {
    private static final By formsCard = By.xpath("//div[@id='app']//h5[text()='Forms']");

    public static FormsPage goToForms() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        scrollToElementsJS(formsCard);
        click(formsCard);
        return new FormsPage();
    }
}
