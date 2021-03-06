package com.syntax.Review02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestededFrames {

    static String url = "https://chercher.tech/practice/frames";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        driver.switchTo().frame("frame1");
        driver.switchTo().frame("frame3");
        WebElement checkbox= driver.findElement(By.cssSelector("input#a"));
        checkbox.click();
    }
}

