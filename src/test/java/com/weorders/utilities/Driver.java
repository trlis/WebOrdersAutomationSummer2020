package com.weorders.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.util.Properties;

public class Driver {

    private static WebDriver driver; // reference variable, pointer on object
    //If reference variable does not point on any obj. it will have null value
    //whenever we type new Class() -  we create a new obj
    //reference type can be class, parent class or interface implemented by class or parent class
    //since WebDriver is an interface implemented by RemoteWebDriver class
    //and RemoteWebDriver is a parent class of ChromeDriver, FireFoxDriver, etc.. classes
    //we can specify reference type as  a WebDriver
    //it helps to define obj type in a run time (polymorphism)

    private Driver() {
    } // constructor

    public static WebDriver getDriver() {// method
        if (driver == null) {
            String browser = "chrome";
            switch (browser) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;

                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
            }
        }
        return driver;

    }
}
