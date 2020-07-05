package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Yandex {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\DRIVERS\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.yandex.ru/");
        List<WebElement> news = driver.findElements(By.cssSelector("span.news__item-content"));

        for (WebElement mainNews : news) {
            String x = mainNews.getText();
            if (!x.isEmpty()) {
                System.out.println(mainNews.getText());
            }

        }
        driver.close();
    }
}
