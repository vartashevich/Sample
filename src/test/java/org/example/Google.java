package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.util.List;

public class Google {
    public static void main(String[] args) {
        String expResult="sword";
        System.setProperty("webdriver.chrome.driver", "C:\\DRIVERS\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        List<WebElement> links = driver.findElements(By.cssSelector("a"));
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys(expResult,Keys.ENTER);
        List<WebElement> results = driver.findElements(By.xpath("//div[@class='g']"));
        for (WebElement result : results){
            String s = result.getText().trim();
            if (s.contains(expResult)){
                System.out.println(result.getText() + " contains " + expResult);
            }
        }
    }
}
