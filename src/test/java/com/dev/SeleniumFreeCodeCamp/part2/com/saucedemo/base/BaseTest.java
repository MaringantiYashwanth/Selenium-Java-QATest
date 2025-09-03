package com.dev.SeleniumFreeCodeCamp.part2.com.saucedemo.base;

import com.base.BasePage;
import com.dev.SeleniumFreeCodeCamp.com.demoqa.pages.HomePage;
import com.dev.SeleniumFreeCodeCamp.saucedemo.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    protected WebDriver driver;
    protected BasePage basePage;
    protected LoginPage loginPage;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        String URL = "https://www.saucedemo.com";
        driver.get(URL);
        basePage = new BasePage();
        basePage.setDriver(driver);
        loginPage = new LoginPage();
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
