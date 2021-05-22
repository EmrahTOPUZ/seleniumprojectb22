package com.cybertek.tests.day2_locators_getText_getAttirubute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P2_CybertekUrlVerification {
    public static void main(String[] args) {
       // TC #2: Cybertek practice tool verifications


        //SETUP THE BROWSER
        WebDriverManager.chromedriver().setup();

        //1. OpenChromebrowser
        WebDriver driver = new ChromeDriver();

        //maximize the page
        driver.manage().window().maximize();


       // 2. Gotohttps://practice.cybertekschool.com
        driver.get("http://practice.cybertekschool.com");


       // 3. VerifyURLcontains
        //Expected: cybertekschool

        String expectedInUrl = "cybertekschool";
        String actualUrl = driver.getCurrentUrl();


        if (actualUrl.contains(expectedInUrl)) {
            System.out.println("URL verification passed");
        } else {
            System.out.println("URL verification FAiLED");
        }

       // 4. Verifytitle:

       // Expected: Practice

        String expectedTitle = "Practice";
        String actualTitle = driver.getTitle();

        if (actualTitle.contains(expectedTitle)) {
            System.out.println("Title verification is PASSED!");
        } else {
            System.out.println("Title verification is FAilED");
        }
    }
}
