package org.example;

import org.example.elements.Elements;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Tinkoff extends BaseClass {

        String expRegion = "Москве";
        Elements elements;
        @Test
        public void paymentServicesTest() throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "C:\\DRIVERS\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            WebDriverWait wait = new WebDriverWait(driver, 10);

            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            driver.get("https:\\tinkoff.ru");
            elements = new Elements(driver);
            PageFactory.initElements(driver, elements);
            elements.payments.click();

            //  wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[@href=\"/payments/\"]")))).click();
            //driver.findElement(By.xpath("//a[@href=\"/payments/\"]")).click();
            wait.until(ExpectedConditions.urlToBe("https://www.tinkoff.ru/payments/"));
           try{
               elements.services.click();
           }
           catch (StaleElementReferenceException e){
               elements.services.click();
           }

            wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//span[@class='PaymentsCatalogHeader__regionSelect_wxV0X']"))));
            String actRegion = driver.findElement(By.xpath("//span[@class='PaymentsCatalogHeader__regionSelect_wxV0X']")).getText();
            if (!actRegion.equals(expRegion)) {
                try{
                    driver.findElement(By.xpath("//span[@class='PaymentsCatalogHeader__regionSelect_wxV0X']")).click();
                }
                catch (StaleElementReferenceException e){
                    driver.findElement(By.xpath("//span[@class='PaymentsCatalogHeader__regionSelect_wxV0X']")).click();
                }
                try {
                    driver.findElement(By.xpath("//span[text()='г. Москва']")).click();
                }
                catch (StaleElementReferenceException e){
                    driver.findElement(By.xpath("//span[text()='г. Москва']")).click();
                }
            }
           try {
               List<WebElement> providers = driver.findElements(By.xpath("//div[@data-qa-file='ProvidersItem']"));
               String providerTitle = providers.get(0).getText().trim();
               providers.get(0).click();

           }
           catch (StaleElementReferenceException e){
               List<WebElement> providers = driver.findElements(By.xpath("//div[@data-qa-file='ProvidersItem']"));
               String providerTitle = providers.get(0).getText().trim();
               providers.get(0).click();


           }


            driver.findElement(By.xpath("//a[@href='/zhku-moskva/oplata/']")).click();
           driver.findElement(By.xpath("//input[@id='payerCode']")).sendKeys("1021456578");
           String s = driver.findElement(By.xpath("//input[@id='payerCode']")).getAttribute("value");
            System.out.println(s);
            Assert.assertEquals("1021456578", s);
            try{
                driver.findElement(By.xpath("//input[@id='payerCode']")).clear();
                driver.findElement(By.xpath("//input[@id='payerCode']")).sendKeys("102");

            }
           catch(StaleElementReferenceException e){
               driver.findElement(By.xpath("//input[@id='payerCode']")).clear();
               driver.findElement(By.xpath("//input[@id='payerCode']")).sendKeys("102");

           }
            try {
                driver.findElement(By.xpath("//div[@class='Input__value_3uAc-']")).click();
                driver.findElement(By.xpath("//div[@class='Input__value_3uAc-']")).sendKeys("400");
            }
            catch(StaleElementReferenceException e){
                driver.findElement(By.xpath("//div[@class='Input__value_3uAc-']")).click();
                driver.findElement(By.xpath("//div[@class='Input__value_3uAc-']")).sendKeys("400");
            }
           /*String p = driver.findElement(By.xpath("//div[@class='Input__value_3uAc-']")).getAttribute("value");
            System.out.println("Entered payment = " + p);
            Assert.assertEquals(p,"");
            Actions action = new Actions(driver);
            action.sendKeys(Keys.BACK_SPACE);*/

        }
    }

