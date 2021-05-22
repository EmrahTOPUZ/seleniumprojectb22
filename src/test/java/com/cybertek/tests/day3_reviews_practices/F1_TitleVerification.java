package com.cybertek.tests.day3_reviews_practices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class F1_TitleVerification {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        driver.get( "https://google.com");
        driver.get("https://facebook.com");


        String expected = "Facebook - Log In or Sign Up";
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
