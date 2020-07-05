package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;

public class Facebook {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\DRIVERS\\chromedriver.exe");
        WebDriver driver = new ChromeDriver() ;
        driver.get("https:\\facebook.com");
       List<WebElement> month = driver.findElements(By.cssSelector("select#month>option"));
       for (WebElement m : month){
           if (m.getAttribute("value").equals("3")){
               m.click();
               break;
           }
       }
      String parentWindow = driver.getWindowHandle();
       driver.findElement(By.linkText("Условия")).click();
       Set<String> windows = driver.getWindowHandles();
       for(String window : windows){
           if(!window.equals(parentWindow)){
               driver.switchTo().window(window);
           }
       }
       driver.switchTo().window(parentWindow);

    }



}
