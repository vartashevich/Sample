package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Aviasales {
    public static void main(String[] args) throws InterruptedException {
        String expMonth = "2020-09";

        System.setProperty("webdriver.chrome.driver", "C:\\DRIVERS\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https:\\aviasales.ru");
        driver.findElement(By.xpath("//div[@class='trip-duration__field --departure']")).click();
        Thread.sleep(2000);
        List<WebElement> months = driver.findElements(By.xpath("//select[@class='calendar-caption__select']"));
        for (WebElement m : months) {

            while (m.getAttribute("value") != expMonth) {
                driver.findElement(By.xpath("//button[@class='calendar-navbar__button --next']")).click();
                break;
            }
            String x = driver.findElement(By.xpath("//select[@class='calendar-caption__select']")).getAttribute("value");
            System.out.println(x);
      /*
        }*/

        }
    }
}
