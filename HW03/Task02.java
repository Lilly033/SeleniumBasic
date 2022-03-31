package com.syntax.HW03;
//Go to facebook sign up page
//Fill out the whole form
//Click signup

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Task02 {

    public static String url= "https://www.facebook.com";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to(url);

        driver.findElement(By.partialLinkText("new account")).click();
        Thread.sleep(1000);
        driver.findElement(By.name("firstname")).sendKeys("Coco");
        driver.findElement(By.name("lastname")).sendKeys("Chanel");
        driver.findElement(By.name("reg_email__")).sendKeys("cocoChane123@gmail.com");
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("cocoChane123@gmail.com");
        driver.findElement(By.name("reg_passwd__")).sendKeys("cocochanel");

        WebElement month=driver.findElement(By.id("month"));
        Select monthDD = new Select(month);
        if(!monthDD.isMultiple()){
            monthDD.selectByVisibleText("Aug");
        }
        Thread.sleep(1000);

        WebElement day=driver.findElement(By.id("day"));
        Select dayDD = new Select(day);
        if(!dayDD.isMultiple()){
            dayDD.selectByVisibleText("19");
        }
        Thread.sleep(1000);

        WebElement year=driver.findElement(By.id("year"));
        Select yearDD = new Select(year);
        if(!yearDD.isMultiple()){
            yearDD.selectByVisibleText("1975");
        }
        Thread.sleep(1000);

        List<WebElement> checkBoxes = driver.findElements(By.cssSelector("input[type='radio']"));
        for (WebElement checkBox : checkBoxes
        ) {
            String text = checkBox.getAttribute("value");
            if (text.equals("Female")) {
                checkBox.click();
                break;
            }
        }
        Thread.sleep(1000);

        driver.findElement(By.name("websubmit")).click();

        Thread.sleep(1000);

        driver.quit();

    }
}
