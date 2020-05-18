package core;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MinimalSeleniumTest {

	@Test
	public void minimalTest() {

		Browser.getBrowser().get("https://www.google.com/");

		assertTrue("browser title contains google", Browser.getBrowser().getTitle().toLowerCase().contains("google"));
	}

}
