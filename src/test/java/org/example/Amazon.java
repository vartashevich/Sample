package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class Amazon {

    @FindBy(css="hgf") WebElement xyz;

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\DRIVERS\\chromedriver.exe");
        WebDriver driver = new ChromeDriver() ;
        driver.get("https:\\facebook.com");
     /*   driver.findElement(By.name("field-keywords")).sendKeys("German helmet");
        driver.findElement(By.className("nav-input")).click();
        Thread.sleep(1000);
        driver.findElement(By.partialLinkText("Spiked Officer")).click();
        Thread.sleep(2000);
        String productTitle = driver.findElement(By.id("productTitle")).getText();
        String productPrice = driver.findElement(By.id("priceblock_ourprice")).getText();
        System.out.println(productTitle);
        System.out.println(productPrice);
        driver.findElement(By.xpath("//a[@aria-label=\"Computers & Accessories\"]")).click();
        driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]")).sendKeys("Printer");*/
        driver.findElement(By.xpath("//label[text()=\"Мужчина\" and @class=\"_58mt\"]"));


    }
}
