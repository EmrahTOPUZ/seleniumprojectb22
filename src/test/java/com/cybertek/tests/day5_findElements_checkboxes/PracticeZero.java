package com.cybertek.tests.day5_findElements_checkboxes;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class PracticeZero {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        driver.get("http://practice.cybertekschool.com/forgot_password");

        List<WebElement> webElementList = driver.findElements(By.xpath("//body//a"));

        for (WebElement webElement : webElementList) {
            System.out.println(webElement.getText());
            System.out.println(webElement.getAttribute("href"));
        }

        int numberOfLinks = webElementList.size();
        System.out.println("numberOfLinks = " + numberOfLinks);


    }
}
