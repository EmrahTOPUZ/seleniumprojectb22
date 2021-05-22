package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CybertekPractice {
    public static void main(String[] args) {



        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.cybertekschool.com");

        String expected = "Cybertek";
        System.out.println("Expected title = " +expected);


        String actualTitle = driver.getTitle();
        System.out.println("ActualTitle = " + actualTitle);

        if (actualTitle.equals(expected)) {
            System.out.println("Title is as expected.Verification PASSED!");
        } else {
            System.out.println("Title is not as expected. Verification FAILED!!!");
        }
        driver.close();


    }
}
