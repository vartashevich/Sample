package org.example;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {

    @BeforeMethod
    public void setUp(){
        System.out.println("Set up!");
    }

    @AfterMethod
    public void tearDown(){
        System.out.println("Tear down!");

    }
}
