package core;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MinimalSeleniumTest {

	@Test
	public void minimalTest() {

		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--headless");

		WebDriver browserDriver = new ChromeDriver(options);

		browserDriver.get("https://www.google.com/");

		browserDriver.quit();
	}

}
