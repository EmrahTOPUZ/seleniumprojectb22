package com.cybertek.tests.day4_cssSelector_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P3_cssSelector_Amazon {
    public static void main(String[] args) {

        // 1- Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        // 2
        driver.get("https://amazon.com");

        WebElement amazonSearchBAr = driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"));


        amazonSearchBAr.sendKeys("wooden spoon" + Keys.ENTER);

        String expectedTitle = "Amazon.com : wooden spoon";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Title verification PASSED");
        }else {
            System.out.println("Title verification FAILED");
    }
}}
