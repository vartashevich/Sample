package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DnsShop {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\DRIVERS\\chromedriver.exe");
        WebDriver driver = new ChromeDriver() ;
        driver.get("https://www.dns-shop.ru/");
        Thread.sleep(2000);
        driver.switchTo().defaultContent();

        System.out.println(driver.findElement(By.cssSelector("div.header__login")).getCssValue("font-size"));
       // driver.findElement(By.xpath("//a[text()='Да']")).click();
        driver.findElement(By.linkText("Бытовая техника")).click();
      Thread.sleep(1000);
        driver.findElement(By.cssSelector("span.catalog-spoiler")).click();


    }
}
