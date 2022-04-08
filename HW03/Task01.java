package com.syntax.HW03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import javax.swing.*;
import java.util.List;

//TC 1: Facebook dropdown verification
//Open chrome browser
//Go to "https://www.facebook.com"
//click on create new account
//Verify:
//month dd has 12 month options
//day dd has 31 day options
//year dd has 115 year options
//Select your date of birth
//Quit browser
public class Task01 {
    public static String url ="https://www.facebook.com";
    public static void main(String[] args) throws InterruptedException {

                  System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
                  WebDriver driver = new ChromeDriver();
                  driver.get(url);
                  driver.findElement(By.xpath("//a[text()='Create new account']")).click();
           Thread.sleep(1000);
                   WebElement month = driver.findElement(By.id("month"));
                   Select monthDD = new Select(month);
                   if(!monthDD.isMultiple()){
                   List<WebElement> option=monthDD.getOptions();
                   if(option.size()==12){
                   System.out.println("Month DD has 12 month options: True");
                   }else{
                   System.out.println("Month DD has 12 month options: False");
           }
       }
           Thread.sleep(1000);
                   monthDD.selectByVisibleText("Aug");

                   WebElement day= driver.findElement(By.id("day"));
                   Select dayDD = new Select(day);
                   if(!dayDD.isMultiple()){
                   List<WebElement> option=dayDD.getOptions();
                   if(option.size()==31){
                   System.out.println("Day DD has 31 day options: True");
                   }else{
                   System.out.println("Day DD has 31 day options: False");
               }
           }
           Thread.sleep(1000);
                   WebElement year = driver.findElement(By.id("year"));
                   Select yearDD = new Select(year);
                   if(!yearDD.isMultiple()){
                   List<WebElement> option = yearDD.getOptions();
                   if(option.size()>=115){
                   System.out.println("Year DD has 115 year options: True");
                   }else{
                   System.out.println("Year DD has 115 year options: False");
                   
               }
           }
                   driver.quit();


    }

}
