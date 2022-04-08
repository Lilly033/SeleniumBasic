package com.syntax.Review01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Checkboxes {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/basic-checkbox-demo.php");

        // check the check box
        WebElement checkbox1 = driver.findElement(By.cssSelector("input#isAgeSelected"));
        // select the checkbos
        checkbox1.click();
        Thread.sleep(3000);
        //deselect the checkbox
        //  checkbox1.click();

        //print out text under checkbos
        WebElement message = driver.findElement(By.id("txtAge"));
        System.out.println(message.getText());

        //   get the all available options
        List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@class='cb1-element']"));
        for (WebElement checkbox : checkboxes) {
            checkbox.click();
        }
        Thread.sleep(1000);
        for (WebElement checkbox : checkboxes) {
            checkbox.click();


        }

    }
}