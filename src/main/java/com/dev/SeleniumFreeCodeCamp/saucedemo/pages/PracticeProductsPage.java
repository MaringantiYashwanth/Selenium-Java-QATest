package com.dev.SeleniumFreeCodeCamp.saucedemo.pages;

import org.openqa.selenium.By;

public class PracticeProductsPage extends PracticeBasePage {
    private By productsHeader = By.xpath("//span[text()='Products'");
    public boolean isProductsHeaderDisplayed() {
        return find(productsHeader).isDisplayed();
    }
}
