package com.cybertek.tests.day4_cssSelector_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class P4_cssSelector_ForgotPassword {
    public static void main(String[] args) {

        List<WebDriver> list = new ArrayList<>();
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/forgot_password");

        WebElement homeLink = driver.findElement(By.cssSelector("a.nav-link"));
       // WebElement homeLink = driver.findElement(By.cssSelector("a[class='nav-link']"));

        WebElement forgotPasswordHeader = driver.findElement(By.tagName("h2"));

        WebElement emailLabel = driver.findElement(By.cssSelector("label[for='email']"));

        WebElement inputEmail = driver.findElement(By.cssSelector("input[name='email']"));

        WebElement retrievePasswordButton = driver.findElement(By.cssSelector("button[id='form_submit']"));

        WebElement cybertekSchool = driver.findElement(By.cssSelector("div[style='text-align: center;']"));

        System.out.println("homeLink.isDisplayed() = " + homeLink.isDisplayed());
        System.out.println("forgotPasswordHeader.isDisplayed() = " + forgotPasswordHeader.isDisplayed());
        System.out.println("emailLabel.isDisplayed() = " + emailLabel.isDisplayed());
        System.out.println("inputEmail.isDisplayed() = " + inputEmail.isDisplayed());
        System.out.println("retrievePasswordButton.isDisplayed() = " + retrievePasswordButton.isDisplayed());
        System.out.println("cybertekSchool.isDisplayed() = " + cybertekSchool.isDisplayed());


        }

    }

