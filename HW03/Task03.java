package com.syntax.HW03;
//Go to ebay.com
//get all the categories and print them in the console
//select Computers/Tables & Networking
//click on search
//verify the header

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Task03 {
    public static String url = "http://ebay.com";

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
    //    WebElement allCategoriesDD = driver.findElement(By.id("gh-cat"));
        Select  allCategoriesDD = new Select(driver.findElement(By.id("gh-cat")));

        List<WebElement> options = allCategoriesDD.getOptions();
        for (WebElement option : options) {
        //    String optionText = option.getText();
            System.out.println(option.getText());
        }
        allCategoriesDD.selectByValue("58058");
        Thread.sleep(1000);

        WebElement searchButton = driver.findElement(By.cssSelector("input[type='submit']"));
        searchButton.click();
        Thread.sleep(1000);

        if(driver.getTitle().equals("Computers, Laptops, Tablets & Network Hardware for Sale - eBay"))
        {
            System.out.println("Title is verified.");
        }else{
            System.out.println("Title is NOT verified.");
        }

        Thread.sleep(1000);
        driver.quit();
    }
}




