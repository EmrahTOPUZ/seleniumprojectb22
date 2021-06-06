package com.cybertek.tests.day6_testing_intro_dropdowns;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P04_amazon_practice {
    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://www.lg.com/");

        Thread.sleep(3000);

        driver.findElement(By.xpath("//span[.='NO THANKS']/../..")).click();
        Alert alert =driver.switchTo().alert();

        //driver.findElement(By.xpath("//span[@class='css-r06ghi ekxwqh01']")).click();
    }
}
