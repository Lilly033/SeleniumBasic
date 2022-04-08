package com.syntax.class06;
//Navigate to https://syntaxprojects.com/bootstrap-iframe.php
//verify the header text AUTOMATION TESTING PLATFORM BY SYNTAX is displayed
//verify enroll today button is enabled

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {
    public static String url = "https://syntaxprojects.com/bootstrap-iframe.php";


    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        Thread.sleep(500);
        WebElement headerText=driver.findElement(By.cssSelector("span.gum"));
        System.out.println(headerText.getText());
        if(headerText.getText().equals("AUTOMATION TESTING PLATFORM BY SYNTAX")){
            System.out.println("Header is verified");
        }else{
            System.out.println("Header is NOT verified");
        }
        Thread.sleep(500);
    }
}
