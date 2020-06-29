package mco.maven.framework.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Configuration {

    private static WebDriver driver;

    public static WebDriver driver() {

        if (driver == null) {
            driver = loadDriver();
        }

        return driver;
    }

    private static WebDriver loadDriver() {

        if (getBrowserName().contains("firefox")) {

            return getFirefoxInstance();
        } else {

            return getChromeInstance();
        }
    }

    private static ChromeDriver getChromeInstance() {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        // options.addArguments("--headless");
        return new ChromeDriver(options);
    }

    private static FirefoxDriver getFirefoxInstance() {

        WebDriverManager.firefoxdriver().setup();
        final FirefoxOptions options = new FirefoxOptions();
        options.setHeadless(true);
        return new FirefoxDriver(options);
    }

    public static String getBrowserName() {

        String browserName = System.getenv("BROWSER_NAME");

        if (browserName == null) {
            browserName = "chrome";
        }
        return browserName.toLowerCase();
    }

}