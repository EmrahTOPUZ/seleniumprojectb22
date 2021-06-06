package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ApplePractice {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.apple.com");

        String expectedTitle = "Apple";
        System.out.println("expectedTitle = " + expectedTitle);

        String actualTitle = driver.getTitle();
        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Title is expected.Verification passed");
        }else {
            System.out.println("Title is expected.Verification failed");

        }
        driver.close();


    }
}
