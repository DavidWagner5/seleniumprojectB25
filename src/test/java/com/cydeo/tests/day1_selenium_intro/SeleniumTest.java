package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

    public static void main(String[] args) {
    //setting up the web driver
        //we create our browser driver
        WebDriverManager.chromedriver().setup();
    //created instance of chrome driver
        WebDriver driver = new ChromeDriver();

        driver.get("https://google.com");

    }
}
