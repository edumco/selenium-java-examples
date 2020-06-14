package core;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MinimalSeleniumTest {

	@Test
	public void minimalTest() {

		WebDriver browser = getBrowserDriver();
		browser.get("https://www.google.com/");
		assertTrue("Title contains google", browser.getTitle().toLowerCase().contains("google"));
		browser.quit();
	}

	private WebDriver getBrowserDriver() {

		WebDriverManager.chromedriver().setup();
		final ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		return new ChromeDriver(options);
	}
}
