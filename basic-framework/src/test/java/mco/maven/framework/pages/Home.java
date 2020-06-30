package mco.maven.framework.pages;

import mco.maven.framework.core.Browser;

import org.openqa.selenium.NoSuchElementException;

public class Home {

    public static final String URL = "https://www.google.com/";
    public static final String TITLE = "google";

    private static final String LOGIN_BUTTON = "#gb_70";
    private static final String USER_AVATAR = "#gbw > div > div > div.gb_3c.gb_Og.gb_i > div.gb_Sa.gb_md.gb_Og.gb_i.gb_Zf > div.gb_Xf.gb_Wa.gb_Og.gb_i";

    public static boolean isAuthenticated() {

        return userIsVisible() && !loginIsVisible();
    }

    public static boolean loginIsVisible() {

        try {

            return Browser.find(LOGIN_BUTTON).isDisplayed();

        } catch (NoSuchElementException e) {

            return false;
        }
    }

    public static boolean userIsVisible() {

        try {
            return Browser.find(USER_AVATAR).isDisplayed();
        } catch (NoSuchElementException e) {

            return false;
        }

    }

}