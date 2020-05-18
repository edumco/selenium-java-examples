package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {

    private static WebDriver browser;

    public static WebDriver getBrowser() {

        if (browser == null) {
            setupBrowser();
        }

        return browser;
    }

    public static void setupBrowser() {

        String browserName = getBrowserName();

        if (browserName.contains("firefox")) {

            configureFirefoxInstance();
        }

        if (browserName.contains("chrome")) {

            configureChromeInstance();
        }
    }

    private static void configureChromeInstance() {
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();

        options.addArguments("--headless");

        browser = new ChromeDriver(options);
    }

    private static void configureFirefoxInstance() {
        WebDriverManager.firefoxdriver().setup();

        FirefoxOptions options = new FirefoxOptions();

        options.setHeadless(true);

        browser = new FirefoxDriver(options);
    }

    private static String getBrowserName() {

        String browserName = System.getenv("BROWSER_NAME");

        if (browserName == null) {
            browserName = "firefox";
        }
        return browserName.toLowerCase();
    }

}