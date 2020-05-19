package core;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MinimalSeleniumTest {

	@Test
	public void minimalTest() {

		String browserName = getBrowserName();

		WebDriver browserDriver;

		if (browserName.contains("chrome")) {

			browserDriver = createChromeInstance();
		} else {

			browserDriver = createFirefoxInstance();
		}

		browserDriver.get("https://www.google.com/");

		browserDriver.quit();
	}

	private static String getBrowserName() {

		String browserName = System.getenv("BROWSER_NAME");

		if (browserName == null) {
			browserName = "chrome";
		}
		return browserName.toLowerCase();
	}

	private static ChromeDriver createChromeInstance() {

		WebDriverManager.chromedriver().setup();
		final ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		return new ChromeDriver(options);
	}

	private static FirefoxDriver createFirefoxInstance() {

		WebDriverManager.firefoxdriver().setup();
		FirefoxOptions options = new FirefoxOptions();
		options.setHeadless(true);
		return new FirefoxDriver(options);
	}

}
