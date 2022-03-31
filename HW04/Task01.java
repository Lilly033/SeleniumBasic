package com.syntax.HW04;
//Navigate to https://syntaxprojects.com/bootstrap-iframe.php
//verify the header text AUTOMATION TESTING PLATFORM BY SYNTAX is displayed
//verify enroll today button is enabled

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task01 {
    static String url="https://syntaxprojects.com/bootstrap-iframe.php";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to(url);
        Thread.sleep(1000);

        WebElement headerText = driver.findElement(By.cssSelector("span.gum"));
        if (headerText.getText().equals("AUTOMATION TESTING PLATFORM BY SYNTAX")) {
            System.out.println("Header is Verified");
        } else {
            System.out.println("Header is NOT Verified");
        }
        Thread.sleep(1000);

        driver.switchTo().frame("FrameTwo");
        if (driver.findElement(By.linkText("Enroll today")).isEnabled()) {
            System.out.println("Enroll Today button is  enabled ");
        } else {
            System.out.println("Enroll Today button is NOT  enabled");
        }
        Thread.sleep(1000);
        driver.quit();



    }
}
