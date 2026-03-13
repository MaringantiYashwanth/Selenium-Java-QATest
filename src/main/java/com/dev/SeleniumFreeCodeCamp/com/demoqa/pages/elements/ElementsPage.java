package com.dev.SeleniumFreeCodeCamp.com.demoqa.pages.elements;

import com.dev.SeleniumFreeCodeCamp.com.demoqa.pages.HomePage;
import org.openqa.selenium.By;

import static com.dev.SeleniumFreeCodeCamp.utilities.JavaScriptUtility.scrollToElementJS;

public class ElementsPage extends HomePage {
    private final By webTablesMenuItem = By.xpath("//li[@id='item-3']//span[text()='Web Tables']");
    private final By linksMenuItem = By.xpath("//li[@id='item-5']//span[text()='Links']");
    private final By dynamicPropertiesMenuItem = By.xpath("//li[@id='item-8']/span[contains(text(), 'Dynamic')]");
    private final By textBoxMenuItem = By.xpath("//li[@id='item-0']/span[text()='Text Box']");

    public TextBoxPage clickTextBox() {
        scrollToElementJS(textBoxMenuItem);
        click(textBoxMenuItem);
        return new TextBoxPage();
    }
    public DynamicPropertiesPage clickDynamicProperties() {
        scrollToElementJS(dynamicPropertiesMenuItem);
        click(dynamicPropertiesMenuItem);
        return new DynamicPropertiesPage();
    }

    public WebTablesPage clickWebTables() {
//        scrollToElementJS(webTablesMenuItem);
        click(webTablesMenuItem);
        return new WebTablesPage();
    }

    public LinksPage clickLinks() {
        click(linksMenuItem);
        return new LinksPage();
    }

}
