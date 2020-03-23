package core;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MinimalSeleniumTest {

	@Test
	public void minimalTest() {

		WebDriverManager.chromedriver().setup();

		WebDriver browserDriver = new ChromeDriver();

		browserDriver.get("https://www.google.com/");

		browserDriver.quit();
	}

}
