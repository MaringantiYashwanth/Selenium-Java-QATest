package com.dev.SeleniumFreeCodeCamp.com.demoqa.pages.widgets;

import org.openqa.selenium.By;

import static com.dev.SeleniumFreeCodeCamp.utilities.DropDownUtility.selectByVisibleText;

public class DatePickerMenuPage extends WidgetsPage {
    private final By selectDateField = By.id("datePickerMonthYearInput");
    private final By monthDropDown = By.className("react-datepicker__month-select");
    private final By yearDropDown = By.cssSelector(".react-datepicker__year-select");

    private By dayValue(String day) {
        return By.xpath("//div[contains(@class, 'react-datepicker__day react-datepicker__day--')][text()='" + day + "']");
    }

    public void clickDay(String day) {
        By dayValue = By.xpath("//div[contains(@class, 'react-datepicker__day react-datepicker__day--')][text()='" + day + "']");
        click(dayValue(day));
    }

    public boolean isDayInMonth(String day) {
        By.xpath("//div[contains(@class, 'react-datepicker__day react-datepicker__day--')][text()='" + day + "']");
        return find(dayValue(day)).isDisplayed();
    }

    public void clickSelectedDate() {
        click(selectDateField);
    }

    public String getDate() {
        return find(selectDateField).getDomAttribute("value");
    }

    public void selectMonth(String month) {
        selectByVisibleText(monthDropDown, month);
    }

    public void selectYear(String year) {
        selectByVisibleText(yearDropDown, year);
    }
}
