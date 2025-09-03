package com.dev.SeleniumFreeCodeCamp.part3_4.com.demoqa.base;

import com.base.BasePage;
import com.dev.SeleniumFreeCodeCamp.com.demoqa.pages.HomePage;
import com.dev.SeleniumFreeCodeCamp.utilities.Utility;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


import java.time.Duration;

import static com.base.BasePage.delay;
import static com.dev.SeleniumFreeCodeCamp.utilities.Utility.setUtilityDriver;

public class BaseTest {
    protected BasePage basePage;
    protected HomePage homePage;
    private WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @BeforeMethod
    public void loadApplication() {
        final String DEMOQA_URL = "https://demoqa.com/";
        driver.get(DEMOQA_URL);
        basePage = new BasePage();
        basePage.setDriver(driver);
        setUtilityDriver();
        homePage = new HomePage();
        // Utility.driver = driver;
    }

    @AfterClass
    public void tearDown() {
        delay(3000);
        driver.quit();
    }
}
