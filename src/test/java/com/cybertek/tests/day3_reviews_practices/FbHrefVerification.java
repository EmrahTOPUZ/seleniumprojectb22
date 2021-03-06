package com.cybertek.tests.day3_reviews_practices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbHrefVerification {
    public static void main(String[] args) {



        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.facebook.com");

        WebElement createPageLink = driver.findElement(By.linkText("Create a Page"));

        String expectedInHref = "registration_form";
        String actualHrefValue = createPageLink.getAttribute("href");

        System.out.println("actualHrefValue = " + actualHrefValue);

        if (actualHrefValue.contains(expectedInHref)) {
            System.out.println("Href value verification PASSED");
        }else{
            System.out.println("Href value verification Failed");

        }


    }
}
