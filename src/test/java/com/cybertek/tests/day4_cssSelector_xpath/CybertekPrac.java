package com.cybertek.tests.day4_cssSelector_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CybertekPrac {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/forgot_password");

        WebElement homeLink = driver.findElement(By.cssSelector("a[class='nav-link']"));
        System.out.println("homeLink.isDisplayed() = " + homeLink.isDisplayed());

        WebElement forgotPassHeader = driver.findElement(By.tagName("h2"));
        System.out.println("forgotPassHeader.isDisplayed() = " + forgotPassHeader.isDisplayed());

        WebElement eMailText = driver.findElement(By.cssSelector("label[for='email']"));
        System.out.println("eMailText.isDisplayed() = " + eMailText.isDisplayed());

        WebElement emailInputBox = driver.findElement(By.cssSelector("input[type='text']"));
        System.out.println("emailInputBox.isDisplayed() = " + emailInputBox.isDisplayed());

        WebElement retrieveButton = driver.findElement(By.cssSelector("i[class='icon-2x icon-signin']"));
        System.out.println("retrieveButton.isDisplayed() = " + retrieveButton.isDisplayed());

        WebElement poweredCyber = driver.findElement(By.cssSelector("div[style='text-align: center;']"));
        System.out.println("poweredCyber.isDisplayed() = " + poweredCyber.isDisplayed());
    }
}
