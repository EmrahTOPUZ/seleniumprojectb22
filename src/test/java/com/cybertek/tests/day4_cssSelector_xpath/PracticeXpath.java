package com.cybertek.tests.day4_cssSelector_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PracticeXpath {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/forgot_password");

        WebElement homeLink = driver.findElement(By.xpath("//a[@class='nav-link']"));
        //System.out.println("Home Link is displayed = " + homeLink.isDisplayed());

        WebElement forgotPasswrodText = driver.findElement(By.xpath("//h2[.='Forgot Password']"));
       // System.out.println("Forgot Password is displayed = " + forgotPasswrodText.isDisplayed());

        WebElement emailText = driver.findElement(By.xpath("//label[@for='email']"));
        //System.out.println("Email text is displayed = " +emailText.isDisplayed());

        WebElement emailInputBox = driver.findElement(By.xpath("//input[@type='text']"));
        //System.out.println("Email input box is displayed = " +emailInputBox.isDisplayed());

        WebElement retrievePasswordButton = driver.findElement(By.xpath("//i[@class='icon-2x icon-signin']"));
        //System.out.println("Retrieve password is displayed = " +retrievePasswordButton.isDisplayed());

        WebElement cybertekText = driver.findElement(By.xpath("//div[@style='text-align: center;']"));
        //System.out.println("Cybertek school text is displayed = " +cybertekText.isDisplayed());

        if (homeLink.isDisplayed() && forgotPasswrodText.isDisplayed() && emailText.isDisplayed() && emailInputBox.isDisplayed()
                && retrievePasswordButton.isDisplayed() && cybertekText.isDisplayed()) {
            System.out.println("All of the web elements are displayed");
        }else{
            System.out.println("One or more web elements couldn't fine");

        }
    }
}
