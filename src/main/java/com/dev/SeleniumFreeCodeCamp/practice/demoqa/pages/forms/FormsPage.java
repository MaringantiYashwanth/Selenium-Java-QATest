package com.dev.SeleniumFreeCodeCamp.practice.demoqa.pages.forms;

import com.base.BasePage;
import com.dev.SeleniumFreeCodeCamp.com.demoqa.pages.forms.PracticeFormPage;
import com.dev.SeleniumFreeCodeCamp.practice.demoqa.pages.HomePage;
import org.openqa.selenium.By;

import static com.dev.SeleniumFreeCodeCamp.practice.demoqa.pages.utility.JavascriptUtility.scrollToElementsJS;

public class FormsPage extends HomePage {
    private By practiceFormsPageMenuItem = By.xpath("//li[@id='item-0']/span[text()='Practice Form']");
    public PracticeFormPage clickPracticeFormsPage() {
        HomePage.goToForms();
        scrollToElementsJS(practiceFormsPageMenuItem);
        click(practiceFormsPageMenuItem);
        return new PracticeFormPage();
    }
}
