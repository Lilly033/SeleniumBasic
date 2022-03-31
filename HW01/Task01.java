package com.syntax.HW01;
//navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
//fill out the form
//click on register
//close the browser

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task01 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
   driver.findElement(By.id("customer.firstName")).sendKeys("Coco");
   driver.findElement(By.id("customer.lastName")).sendKeys("Chanel");
   driver.findElement(By.id("customer.address.street")).sendKeys("007 Bond Street");
   driver.findElement(By.id("customer.address.city")).sendKeys("Las Vegas");
   driver.findElement(By.name("customer.address.state")).sendKeys("Nevada");
   driver.findElement(By.id("customer.address.zipCode")).sendKeys("89117");
   driver.findElement(By.id("customer.phoneNumber")).sendKeys("702 555 7777");
   driver.findElement(By.id("customer.ssn")).sendKeys("606-23-4456");
   driver.findElement(By.name("customer.username")).sendKeys("ChanelCoco");
   driver.findElement(By.name("customer.password")).sendKeys("chanel@123");
   driver.findElement(By.name("repeatedPassword")).sendKeys("chanel@123");
   driver.findElement(By.className("button")).click();
   driver.quit();



    }



}
