package com.cybertek.tests.day4_cssSelector_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebOrderLogin {
    public static void main(String[] args) throws InterruptedException {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

        String expectedTitle = "Web Orders Login";

        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Verification Passed");
        }else{
            System.out.println("Verification FAiled");
        }
        WebElement inputUsername = driver.findElement(By.id("ctl00_MainContent_username"));
        inputUsername.sendKeys("Tester");

        WebElement inputPassword = driver.findElement(By.id("ctl00_MainContent_password"));
        inputPassword.sendKeys("test");

        Thread.sleep(2000);

        WebElement loginButton = driver.findElement(By.name("ctl00$MainContent$login_button"));
        loginButton.click();

        String expectedLoginTitle = "Web Orders";

        String actualLoginTitle = driver.getTitle();

        if (actualLoginTitle.equals(expectedLoginTitle)) {
            System.out.println("Login verification PASSED");
        }else{
            System.out.println("Login verification FAILED");

        }

    }
}
