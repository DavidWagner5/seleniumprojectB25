package com.Practicew.tests.day7_webtables_utilities_javafaker;

import com.Practicew.utilities.WebDriverFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Task1_WindowHandleling {

    WebDriver driver;

    @BeforeMethod
    public void setup(){

        //1. Open Chrome browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }

    @Test
    public void window_handling_test(){
        driver.get("https://www.amazon.com");

        //2. Go to: https://www.amazon.com
        //3. Copy-paste the lines from below into your class
        
       //these are 3 new tabs
        ((JavascriptExecutor) driver).executeScript("window.open('http://google.com','_blank');");
         ((JavascriptExecutor) driver).executeScript("window.open('http://etsy.com','_blank');");
         ((JavascriptExecutor) driver).executeScript("window.open('http://facebook.com','_blank');");


        //4. Create a logic to switch to the tab where Etsy.com is open

        Set<String> allWindowHandles = driver.getWindowHandles();

        for (String each : allWindowHandles) {
            driver.switchTo().window(each);

            System.out.println("Current URL: " + driver.getCurrentUrl());

            if(driver.getCurrentUrl().contains("etsy")){
                break;
            }


        }

        String expectedTitle = "Etsy";
        String actualTitle = driver.getTitle();

        Assert.assertTrue(actualTitle.contains(expectedTitle));


    



    }
}
