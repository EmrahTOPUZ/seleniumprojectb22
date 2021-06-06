package com.cybertek.tests.day7_alerts_iframes_windows;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class IframePractice {


    WebDriver driver;

    @BeforeMethod
    public void setUpMethod() {


        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/iframe");

    }

    @Test
    public void iframe_test(){


        driver.switchTo().frame("mce_0_ifr");

        WebElement yourContentGoesHere = driver.findElement(By.xpath("//p"));

        Assert.assertTrue(yourContentGoesHere.isDisplayed());

      //  driver.switchTo().parentFrame();
        driver.switchTo().defaultContent();

        WebElement headerText = driver.findElement(By.xpath("//h3"));

    }
}