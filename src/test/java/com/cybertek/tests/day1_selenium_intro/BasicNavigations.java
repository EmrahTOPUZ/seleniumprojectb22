package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        //3- get the page for Tesla.com
        driver.get("https://www.tesla.com");
        System.out.println("Current title: " +driver.getTitle());

        driver.manage().window().maximize();




        String currentUrl = driver.getCurrentUrl();
        System.out.println("current URL: " + currentUrl);



        Thread.sleep(3000);

        driver.navigate().back();

        //putting 3 seconds of wait /stops the code for 3 second
        Thread.sleep(3000);

        //going forward using navigation
        driver.navigate().forward();


        Thread.sleep(3000);


        driver.navigate().refresh();

        Thread.sleep(3000);

        driver.navigate().to("https://www.google.com");

        System.out.println("Current title: " +driver.getTitle());

        currentUrl = driver.getCurrentUrl();
        System.out.println("current URL: " + currentUrl);


        driver.close();



    }
}
