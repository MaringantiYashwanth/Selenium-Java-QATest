package com.dev.SeleniumFreeCodeCamp.part3_4.com.demoqa.test.part3.elements;

import com.dev.SeleniumFreeCodeCamp.com.demoqa.pages.HomePage;
import com.dev.SeleniumFreeCodeCamp.part3_4.com.demoqa.base.BaseTest;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WebTableTest extends BaseTest {
    @Test
    public void testWebTable() {
        String email = "kierra@example.com";
        String expectedAge = "34";
        var webTablePage = homePage.goToElements().clickWebTables();
        webTablePage.clickEdit(email);
        webTablePage.setAge("34");
        webTablePage.clickSubmit();
        String actualAge = webTablePage.getTableAge(email);
        assertEquals(actualAge, expectedAge, "\n Actual & Expected Ages do not match \n");
    }
}
