package com.cybertek.tests.day4_cssSelector_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class XpathPractice {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        //WebElement buttonOne = driver.findElement(By.xpath("//button[.='Button 1']")); find with text
        WebElement buttonOne = driver.findElement(By.xpath("//button[@onclick='button1()']"));
        buttonOne.click();

        WebElement resultText = driver.findElement(By.xpath("//p[@id='result']"));


        String expectedText = "Clicked on button one!";
        String actualText = resultText.getText();

        if (expectedText.equals(actualText)) {
            System.out.println("Verification is Passed");
        }else{
            System.out.println("Verification failed");
        }

    }
}
