package com.cybertek.tests.day2_locators_getText_getAttirubute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookPractice2 {
    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        driver.get("https://www.facebook.com");

        WebElement inputUSername =  driver.findElement(By.id("email"));

        inputUSername.sendKeys("sometghing@gmail.com");

        WebElement inputPassword = driver.findElement(By.id("pass"));

        inputPassword.sendKeys("some wrong password " + Keys.ENTER);

        String expectedTitle = "Log into Facebook";
        String actualTitle = driver.getTitle();


        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Title verification facebook PASSED");
        } else {
            System.out.println("title verification facebook FAILED");
        }
        driver.findElement(By.name("email")).sendKeys("erf");
        driver.findElement(By.name("pass")).sendKeys("f8f43r");
        driver.findElement(By.name("login")).click();

        String actualPG=driver.getTitle();
        String expectedPG="Log into Facebook";


    }

}
