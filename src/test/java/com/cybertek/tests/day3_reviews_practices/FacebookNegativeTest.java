package com.cybertek.tests.day3_reviews_practices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookNegativeTest {
    public static void main(String[] args) throws InterruptedException {



        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.facebook.com");

        WebElement inputUsername = driver.findElement(By.id("email"));
        inputUsername.sendKeys("emrahtopuz@gmail.com");

        WebElement inputPassword = driver.findElement(By.id("pass"));
        inputPassword.sendKeys("12345" + Keys.ENTER);

        String ExpectedTitle = "Log into Facebook";
        System.out.println("ExpectedTitle = " + ExpectedTitle);

        Thread.sleep(5000);

        String actualTitle = driver.getTitle();
        System.out.println("actualTitle = " + actualTitle);


        if (actualTitle.equals(ExpectedTitle)) {
            System.out.println("Verification PASSED");
        }else{
            System.out.println("Verification Failed");

        }

    }
}
