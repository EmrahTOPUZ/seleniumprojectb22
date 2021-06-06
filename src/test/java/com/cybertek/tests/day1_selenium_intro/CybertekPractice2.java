package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CybertekPractice2 {
    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/");

        String expectedInUrl = "cybertekschool";

        String actualUrl= driver.getCurrentUrl();

        if (actualUrl.contains(expectedInUrl)) {
            System.out.println("URL verification is PASSED");
        }else {
            System.out.println("URL verification is FAILED");

        }

        String expectedTitle = "Practice";

        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Verification is PASSED");
        }else{
            System.out.println("Verification is Failed");

        }


    }
}
