package com.Practicew.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Driver {

    /* we make webdriver private because we want to create close access from outside the class*/
    private static WebDriver driver;


    /* creating a private constructor,
    so we are closing access to the object of this class from outside the class*/

    private Driver() {
    }

    //create reusable utility method which will return same driver instance when we call it
    public static WebDriver getDriver(){
        if(driver==null){

            String browserType= ConfiguratonReader.getProperty("browser");
            switch (browserType){
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;

            }

        }
        return driver;
    }

    //this method will make sure our driver value is always null after using quit method
    public static void closeDriver(){
        if(driver!=null){
            driver.quit(); //this line will terminate the existing session. value will not be null
            driver = null;
        }
    }

}
