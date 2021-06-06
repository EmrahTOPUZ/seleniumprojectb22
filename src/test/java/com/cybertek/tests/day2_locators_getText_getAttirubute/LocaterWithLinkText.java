package com.cybertek.tests.day2_locators_getText_getAttirubute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocaterWithLinkText {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.google.com");

       // driver.findElement(By.linkText("Gmail")).click();
        driver.findElement(By.partialLinkText("mail")).click();

        String expectedInTitle = "Gmail";
        String actualTitle = driver.getTitle();

        if (actualTitle.contains(expectedInTitle)) {
            System.out.println("Verification is PASSED");
        } else {
            System.out.println("Verification is FAILED");
        }

        driver.navigate().back();

        String expectedTitle = "Google";
        actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Verification title is PASSED");
        } else {
            System.out.println("Verification title is FAILED");

        }
    }
}
