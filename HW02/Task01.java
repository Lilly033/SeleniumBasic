package com.syntax.HW02;
//Open chrome browser
//Go to "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login"
//Enter valid username and password (username - Admin, password - Hum@nhrm123)
//Click on login button
//Then verify Syntax Logo is displayed.

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task01 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        WebElement username= driver.findElement(By.id("txtUsername"));
        username.sendKeys("Admin");
        WebElement passwowrd= driver.findElement(By.id("txtPassword"));
        passwowrd.sendKeys("Hum@nhrm123");
        WebElement loginButton=driver.findElement(By.id("btnLogin"));
        loginButton.click();
        WebElement syntaxLogo=driver.findElement(By.cssSelector("img[src $='syntax.png']"));
        boolean syntaxLogoIsDisplayed=syntaxLogo.isDisplayed();
        if(syntaxLogoIsDisplayed){
            System.out.println("logo is displayed");
        }else{
            System.out.println("logo can not be displayed");
        }
        driver.quit();

    }


}
