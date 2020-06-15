package mco.maven.framework.core;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Browser {

    public static void navigateTo(String url) {

        Configuration.driver().get(url);
    }

    public static String url() {

        return Configuration.driver().getCurrentUrl();
    }

    public static String title() {

        return Configuration.driver().getTitle();
    }

    public static WebElement find(String selector) {

        return Configuration.driver().findElement(By.cssSelector(selector));
    }

    public static List<WebElement> findAll(String selector) {

        return Configuration.driver().findElements(By.cssSelector(selector));
    }

    public static WebElement get(String id) {

        return Configuration.driver().findElement(By.id(id));
    }

}