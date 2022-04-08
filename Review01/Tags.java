package com.syntax.Review01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Tags {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/basic-radiobutton-demo.php");
       WebElement femalebth= driver.findElement(By.xpath("//input[@name='optradio'and@value='Female']"));
       // check if the radio button is enabled
        System.out.println("the female radio btn is enabled "+ femalebth.isEnabled());
        //  check if the radio btn is displayed
        System.out.println("the female radio btn is displayed "+ femalebth.isDisplayed());
      //  check if its selected or not
        System.out.println("the female radio btn is deselected " + femalebth.isSelected());
    //check if the btn is not selected and select it
        if(!femalebth.isSelected()){
            femalebth.click();
        }
      //  check the status of election again
        System.out.println("the female radio btn is deselected " + femalebth.isSelected());

      //  to get all the links in the current webpage
      List<WebElement> links =  driver.findElements(By.tagName("a"));

      for( WebElement link:links){
          String name= link.getText();
          if(!name.isEmpty()){
              System.out.println(name);
          }

      }




    }

}
