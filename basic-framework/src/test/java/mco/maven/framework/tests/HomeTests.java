package mco.maven.framework.tests;

import static org.junit.Assert.assertTrue;

import mco.maven.framework.core.Browser;
import mco.maven.framework.pages.Home;

public class HomeTests {

	public void checkBrowserTitle() {

		Browser.navigateTo(Home.URL);
		assertTrue("Title contains google", Browser.title().equalsIgnoreCase(Home.TITLE));
	}

	public void checkBrowserURL() {

		Browser.navigateTo(Home.URL);
		assertTrue("Redirect correctly ", Browser.url().equalsIgnoreCase(Home.FULL_URL));
	}

	public void checkNotAuthenticated() {

		Browser.navigateTo(Home.URL);
		assertTrue("User is not not authenticated", Home.isAuthenticated() == false);
	}

}
