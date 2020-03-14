package core;

import java.util.Map;

import org.junit.Test;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

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
