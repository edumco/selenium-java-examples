package mco.maven.framework.pages;

import mco.maven.framework.core.Browser;

public class Home {

    public static final String URL = "www.google.com";
    public static final String FULL_URL = "https://www.google.com/";
    public static final String TITLE = "google";

    private static final String LOGIN_BUTTON = "css selector";
    private static final String USER_AVATAR = "css selector";

    public static boolean isAuthenticated() {

        return (loginIsVisible() && loginIsEnabled() && !userIsVisible());
    }

    public static boolean loginIsEnabled() {
        return Browser.find(LOGIN_BUTTON).isEnabled();
    }

    public static boolean loginIsVisible() {
        return Browser.find(LOGIN_BUTTON).isDisplayed();
    }

    public static boolean userIsVisible() {
        return Browser.find(USER_AVATAR).isEnabled();
    }

}