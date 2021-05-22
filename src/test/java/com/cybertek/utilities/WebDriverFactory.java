package com.cybertek.utilities;

// TASK: NEW METHOD CREATION
// Method name : getDriver
// Static method
// Accepts String arg : browserType
//   - This arg will determine what type of browser is opened
//   - if "chrome" passed --> it will open chrome browser
//   - if "firefox" passed --> it will open firefox browser
// RETURN TYPE: "WebDriver"

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {
    public static void main(String[] args) {
        getDriver("Chrome");
    }

        public static WebDriver getDriver(String browserType) {
            if (browserType.equalsIgnoreCase("Chrome")) {
                WebDriverManager.chromedriver().setup();
                WebDriver driver = new ChromeDriver();
                return driver;

            } else if (browserType.equalsIgnoreCase("Firefox")) {
                WebDriverManager.firefoxdriver().setup();
                WebDriver driver = new FirefoxDriver();
                return driver;
            } else {
                System.out.println("CANNOT FIND THE BROWSER");
            }
            return null;


        }}