package com.syntax.HW02;
//HRMS Application Negative Login:
//Open chrome browser
//Go to "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login"
//Enter valid username
//Leave password field empty
//Click on login button
//Verify error message with text "Password cannot be empty" is displayed.

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task03 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        WebElement username= driver.findElement(By.id("txtUsername"));
        username.sendKeys("Admin");
        WebElement password=driver.findElement(By.id("txtPassword"));
        password.sendKeys("");
        WebElement loginButton=driver.findElement(By.id("btnLogin"));
        loginButton.click();
        WebElement error=driver.findElement(By.id("spanMessage"));
        if(error.isDisplayed()){
            System.out.println("Password can not be empty");
        }
        driver.quit();
    }
}
