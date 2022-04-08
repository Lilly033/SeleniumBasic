package com.syntax.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitDemo {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://syntaxprojects.com/dynamic-data-loading-demo.php");

        //Task: click on 'get new user' and get the firstname text
        // and print in the console.
        WebElement getNewUserButton = driver.findElement(By.id("save"));
        getNewUserButton.click();

        //we need to create an object of webDriver wait:
        WebDriverWait wait = new WebDriverWait(driver, 20);
        // need to add wait condition based on visibility of the element by locator
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='First-Name']/child::p")));

        // get the firstname text
        WebElement firstName = driver.findElement(By.xpath("//div[@id='First-Name']/child::p"));
        System.out.println(firstName.getText()); // works
    }
}
