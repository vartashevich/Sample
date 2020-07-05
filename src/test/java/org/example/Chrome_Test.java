package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Chrome_Test {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\DRIVERS\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https:\\www.actitime.com");
        driver.findElement(By.linkText("TRY FREE")).click();
      WebDriverWait wait = new WebDriverWait(driver,10);
      wait.until(ExpectedConditions.urlToBe("https://www.actitime.com/free-online-trial"));
        driver.findElement(By.id("first-name")).sendKeys("First");
        Thread.sleep(1000);
        driver.findElement(By.id("last-name")).sendKeys("Last");
        Thread.sleep(1000);
        driver.findElement(By.id("email")).sendKeys("email@hr.com");
        Thread.sleep(1000);
        driver.findElement(By.id("company")).sendKeys("Company");
        Thread.sleep(1000);
        Actions action = new Actions(driver);
        WebElement features = driver.findElement(By.linkText("Features"));
        action.moveToElement(features).perform();



    }
}
