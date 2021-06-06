package com.cybertek.tests.day7_alerts_iframes_windows;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LifeGood {


    WebDriver driver;

    @BeforeMethod
    public void setUpMethod() {


        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://www.lg.com/us");


    }

    @Test
    public void killThePop() throws InterruptedException {

        WebElement info = driver.findElement(By.id("//span[.='NO THANKS']/../.."));

        info.click();
        Thread.sleep(2000);

        Alert alert = driver.switchTo().alert();

        alert.accept();
}}