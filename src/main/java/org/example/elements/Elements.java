package org.example.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Elements {
    WebDriver driver;
    @FindBy(xpath = "//a[@href='/payments/']") public WebElement payments;

    @FindBy(xpath = "//header[text()='Коммунальные услуги']") public WebElement services;

    public Elements(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }


}
