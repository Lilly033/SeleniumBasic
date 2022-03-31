package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
       driver.navigate().to("https://www.google.com/");
       driver.navigate().back();
       driver.navigate().forward();
       Thread.sleep(5000);  //we not be using this method we just use it now to see the flow of the executes
                                      //pause the execution for 5 sec
       driver.navigate().refresh();
    //   driver.close();   // it is closig the curent tab (active one will close)
         driver.quit();   // will quit the whole browser


    }
}
