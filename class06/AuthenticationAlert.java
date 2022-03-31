package com.syntax.class06;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationAlert {     // this is only for AUTHENTICATION ALERTS
    public static String url = "https://admin:admin@the-internet.herokuapp.com/basic_auth";
                                   // username:password@ you put it in right in url

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
    }
}
