package com.syntax.HW01;
//navigate to fb.com
//click on create new account
//fill up all the textboxes
//click on sign up button
//close the pop up
//close the browser

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task02 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("http://fb.com");
        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("firstname")).sendKeys("Coco");
        driver.findElement(By.name("lastname")).sendKeys("Chanel");
        driver.findElement(By.name("reg_email__")).sendKeys("ChanelCoco@aol.com");
        driver.findElement(By.id("password_step_input")).sendKeys("Milano2009");
        driver.findElement(By.id("month")).sendKeys("Mar");
        driver.findElement(By.id("day")).sendKeys("23");

        driver.findElement(By.id("year")).sendKeys("1999");
        driver.findElement(By.name("sex")).click();
        driver.findElement(By.name("websubmit")).click();
        Thread.sleep(2000);
        driver.quit();









    }
}
