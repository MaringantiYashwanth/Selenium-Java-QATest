package com.dev.SeleniumFreeCodeCamp.com.demoqa.pages.widgets;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import static com.dev.SeleniumFreeCodeCamp.utilities.ActionsUtility.dragAndDropBy;
import static com.dev.SeleniumFreeCodeCamp.utilities.GetUtility.getAttribute;

public class SliderPage extends WidgetsPage {
    private final By slider = By.xpath("//div[@id='sliderContainer']//input[@type=\"range\"]");
    private final By sliderValue = By.id("#sliderValue");

    public String getSliderValue() {
        return getAttribute(sliderValue, "value");
    }

    public void moveSlider(int x, int y) {
        Actions act = new Actions(driver);
        act.dragAndDropBy(find(slider), x, y).perform();
        dragAndDropBy(find(slider), x, y);
    }


}
