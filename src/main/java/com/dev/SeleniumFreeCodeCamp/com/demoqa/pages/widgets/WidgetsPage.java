package com.dev.SeleniumFreeCodeCamp.com.demoqa.pages.widgets;

import com.dev.SeleniumFreeCodeCamp.com.demoqa.pages.HomePage;
import org.openqa.selenium.By;

import static com.dev.SeleniumFreeCodeCamp.utilities.JavaScriptUtility.scrollToElementJS;

public class WidgetsPage extends HomePage {
    private final By selectMenuItem = By.xpath("//li[@id='item-8']//span[text()='Select Menu']");
    private final By datePickerMenuItem = By.xpath("//li[@id='item-2']//span[text()='Date Picker']");
    private final By progressBarMenuItem = By.xpath("//li[@id='item-4']/span[contains(text(), 'Progress')]");
    private final By sliderMenuItem = By.xpath("//li[@id='item-3']/span[text() = 'Slider']");

    public SliderPage clickSlider() {
        scrollToElementJS(sliderMenuItem);
        click(sliderMenuItem);
        return new SliderPage();
    }
    public ProgressBarPage clickProgressBar() {
        scrollToElementJS(progressBarMenuItem);
        click(progressBarMenuItem);
        return new ProgressBarPage();
    }

    public SelectMenuPage clickSelectMenu() {
        scrollToElementJS(selectMenuItem);
        click(selectMenuItem);
        return new SelectMenuPage();
    }

    public DatePickerMenuPage clickDatePicker() {
        scrollToElementJS(datePickerMenuItem);
        click(datePickerMenuItem);
        return new DatePickerMenuPage();
    }
}
