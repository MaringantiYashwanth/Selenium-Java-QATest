package practice.dev.SeleniumFreeCodeCamp.part3_4.com.demoqa.base;

import com.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import com.dev.SeleniumFreeCodeCamp.practice.demoqa.pages.HomePage;

import static com.base.BasePage.delay;
import static com.dev.SeleniumFreeCodeCamp.practice.demoqa.pages.utility.Utility.setUtilityDriver;

public class BaseTest {
    public static WebDriver driver;
    public static HomePage homePage;
    protected static BasePage basePage;
    private static final String DEMOQA_URL = "https://demoqa.com/";
    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @BeforeMethod
    public void loadApplication() {
        driver.get(DEMOQA_URL);
        basePage = new BasePage();
        basePage.setDriver(driver);
        setUtilityDriver();
        homePage = new HomePage();
    }
    @AfterClass
    public void tearDown() {
        delay(3000);
        driver.quit();
    }
}
