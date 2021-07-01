package com.cybertek.utilities;

//TASK : NEW METHOD CREATION
// METHOD NAME: getDriver
// Static method
// Accepts String ard: browser type
// This arg will determine what type of browser is opened
//   if "chrome" passed --> it will open chrome browser
//   if "firefox" passed --> it will open firefox browser
// return type : "WebDriver"


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactoryV2 {

    // when we make method static , we dont have to create an object.
    public static WebDriver getDriver(String browserType){

        if (browserType.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();

            return new ChromeDriver();
        } else if (browserType.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();

            return new FirefoxDriver();
        }else{
            System.out.println("Given browser type does not exist");
            return null;
        }

    }
}
