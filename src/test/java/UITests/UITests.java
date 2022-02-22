package UITests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import utils.PropertyReader;


public class UITests {
    protected static WebDriver driver;

    @BeforeAll
    public static void setUp() {
        String browsers = PropertyReader.BROWSER;
        switch (browsers) {

            case ("chrome"): {
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            }
            case ("firefox"): {
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            }

            default:
                System.out.println("Please use chrome or firefox");
        }
    }

    @AfterAll
    public static void tearDown() {
        driver.close();
    }
}
