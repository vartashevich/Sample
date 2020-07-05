package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Avito {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\DRIVERS\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https:\\avito.ru");
        driver.manage().window().fullscreen();

        driver.findElement(By.xpath("//input[@type='checkbox' and @name='withImagesOnly']/following::span[1]")).click();
        boolean x = driver.findElement(By.xpath("//input[@type='checkbox' and @name='withImagesOnly']")).isSelected();
        Thread.sleep(5000);
        System.out.println(x);

        driver.findElement(By.id("search")).click();
        driver.findElement(By.id("search")).sendKeys("Велосипед");
        driver.findElement(By.cssSelector("button[data-marker='search-form/submit-button']")).click();
        Thread.sleep(5000);

        List<WebElement> items = driver.findElements(By.cssSelector("div.item_table-description"));

        for (WebElement item : items){
            String itm1 = item.findElement(By.cssSelector("span[data-marker='item-price']")).getText();
            String itm2 = itm1.replace(" ₽","");
            System.out.println(itm2);
        }
    }
}
