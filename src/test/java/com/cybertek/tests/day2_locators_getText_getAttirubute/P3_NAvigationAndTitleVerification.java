package com.cybertek.tests.day2_locators_getText_getAttirubute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P3_NAvigationAndTitleVerification {
    public static void main(String[] args) {

      //  TC #3: Back and forth navigation

        //Setup the browser
        WebDriverManager.chromedriver().setup();
      //  1- Open a chrome browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

      //  2- Go to: https://google.com
        driver.get("https://google.com");

      //  3- Click to Gmail from top right.
        driver.findElement(By.linkText("Gmail")).click();



      //  4- Verify title contains:
      //  Expected: Gmail
        String expectedTitle = "Gmail";
        String actualTitle = driver.getTitle();

        if (actualTitle.contains(expectedTitle)) {
            System.out.println("Title verification Passed");
        } else {
            System.out.println("Title verification Failed");
        }

        //Command + D  : multiplies the current line
        //Command + shift : moving the line up and down∂
      //  5- Go back to Google by using the .back();
        driver.navigate().back();

        driver.findElement(By.partialLinkText("mail")).click();


      //  6- Verify title equals:
      //  Expected: Google
        String expectedGoogleTitle = "Google";
        String actualGoogleTitle = driver.getTitle();

        if (expectedGoogleTitle.contains(actualGoogleTitle)) {
            System.out.println("Title verification is PASSED");
        } else {
            System.out.println("Title verification is FAILED");
        }















    }
}
