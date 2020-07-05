package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Ebay_Test {
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","C:\\DRIVERS\\chromedriver.exe");
        driver = new ChromeDriver() ;
    }
    @AfterMethod
    public void tearDown(){
        driver.close();
    }

    @Test
    public void search_Test(){

        driver.get("https:\\ebay.com");
        driver.findElement(By.cssSelector("input#gh-btn")).click();
        System.out.println(driver.getTitle());
        Assert.assertEquals("","","Verifying");

    }
    @Test
    public void search_Test_soft(){
        SoftAssert sa = new SoftAssert();
               driver.get("https:\\ebay.com");
        driver.findElement(By.cssSelector("input#gh-btn")).click();
        System.out.println(driver.getTitle());
        sa.assertEquals("","","Verifying");
                sa.assertAll();
    }
}
