package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

public class Slider {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\DRIVERS\\chromedriver.exe");
        WebDriver driver = new ChromeDriver() ;
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(driver,15);

        driver.get("https:\\jqueryui.com\\slider\\#colorpicker");
        driver.switchTo().frame(0);
        Thread.sleep(2000);
        WebElement red = driver.findElement(By.cssSelector("div#red>span"));
        WebElement green = driver.findElement(By.cssSelector("div#green>span"));
        WebElement blue = driver.findElement(By.cssSelector("div#blue>span"));
        wait.until(ExpectedConditions.elementToBeClickable(By.id("gfd"))).click();
        Actions action = new Actions(driver);
        action.clickAndHold(red).moveByOffset(-40,0).release(red).build().perform();
        action.clickAndHold(green).moveByOffset(-80,0).release(green).build().perform();
    }
}
