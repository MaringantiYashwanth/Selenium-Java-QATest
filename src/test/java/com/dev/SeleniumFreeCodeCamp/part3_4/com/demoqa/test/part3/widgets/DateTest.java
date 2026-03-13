package com.dev.SeleniumFreeCodeCamp.part3_4.com.demoqa.test.part3.widgets;

import com.dev.SeleniumFreeCodeCamp.part3_4.com.demoqa.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DateTest extends BaseTest {

    @Test
    public void testSelectingDate() {
        String month = "December";
        String day = "31";
        String year = "2034";
        String monthNumber = "12";
        var datePickerPage = homePage.goToWidgets().clickDatePicker();
        datePickerPage.clickSelectedDate();
        datePickerPage.selectMonth(month);
        datePickerPage.selectYear(year);
        datePickerPage.clickDay(day);

        String actualDate = datePickerPage.getDate();
        String expectedDate = monthNumber + "/" + day + "/" + year;
        Assert.assertEquals(actualDate, expectedDate,
                "\n Actual & Expected Dates do not match"
                        + "\n Actual Date: " + actualDate
                        + "\n Expected Date: " + expectedDate);
    }
}

























