package com.syntax.class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sample {
    public static void main(String[] args)  throws InterruptedException{
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver=new ChromeDriver();

        driver.get("http://amazon.com");
        WebElement account=driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
        Actions action=new Actions(driver);
        action.moveToElement(account).perform();

        WebElement element=driver.findElement(By.xpath("//div[@id='nav-flyout-ya-newCust']"));
        if(element.getText().contains("Start")){
            System.out.println("Many displayed");

        }else{
            System.out.println("Many did not displayed");
        }
        action.contextClick(element).perform();
        WebElement searchBox=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));

        action.moveToElement(searchBox).click().sendKeys("Movies").perform();
        searchBox.submit();
        Thread.sleep(5000);
        driver.quit();


    }
}
