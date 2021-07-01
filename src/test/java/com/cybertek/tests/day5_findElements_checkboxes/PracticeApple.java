package com.cybertek.tests.day5_findElements_checkboxes;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class PracticeApple {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://apple.com");

        List<WebElement> Links = driver.findElements(By.xpath("//ul[@class='ac-gn-list']//li/a"));

        for (int headerLink = 1; headerLink < Links.size() -1; headerLink++) {

            System.out.println(Links.get(headerLink).getText());

            Links.get(headerLink).click();
            Links = driver.findElements(By.xpath("//ul[@class='ac-gn-list']//li/a"));

            System.out.println("Current title in the page : " + driver.getTitle());

            List<WebElement> allLinks = driver.findElements(By.xpath("//body//a"));

            System.out.println("Total number of links in current page: " +allLinks.size());

            int withNoText = 0;
            int withText = 0;

            for (WebElement each : allLinks) {

                if (each.getText().isEmpty()) {
                    withNoText++;
                }else{
                    withText++;
                }

            }

            System.out.println("--> Current page links with NO TEXTS: " +withNoText);
            System.out.println("--> Cuurent page links with TEXT: " +withText);

            driver.close();


        }
    }
}
