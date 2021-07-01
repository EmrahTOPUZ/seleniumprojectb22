package com.cybertek.tests.day4_cssSelector_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Lg {

    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://www.lg.com");

        Thread.sleep(5000);

        WebElement noThxButton = driver.findElement(By.cssSelector("input[id='input0input']"));
        noThxButton.sendKeys("9099234567");

    }
}
