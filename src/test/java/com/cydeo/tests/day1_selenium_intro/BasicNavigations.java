package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {

    public static void main(String[] args) throws InterruptedException {


        //set up the browser driver
        WebDriverManager.chromedriver().setup();

        //create instance of selenium web driver
        WebDriver driver = new ChromeDriver();

        //go to tesla website
        driver.get("https://www.tesla.com");

        //stop code execution for 3 seconds
        Thread.sleep(3000);

        //use selenium to navigate back to an empty page
        driver.navigate().back();

    }
}
