package mco.maven.framework.tests;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import mco.maven.framework.core.Browser;
import mco.maven.framework.pages.Home;

public class HomeTests {

	@Test
	public void checkBrowserTitle() {

		Browser.navigateTo(Home.URL);
		assertTrue("Title contains google", Browser.title().equalsIgnoreCase(Home.TITLE));
	}

	@Test
	public void checkBrowserURL() {

		Browser.navigateTo(Home.URL);
		assertTrue("Redirect correctly ", Browser.url().equalsIgnoreCase(Home.FULL_URL));
	}

	@Test
	public void checkNotAuthenticated() {

		Browser.navigateTo(Home.URL);
		assertTrue("User is not not authenticated", Home.isAuthenticated() == false);
	}

}
