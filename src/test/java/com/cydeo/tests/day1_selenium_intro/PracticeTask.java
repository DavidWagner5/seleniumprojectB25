package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeTask {
    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();

        WebDriver driver= new ChromeDriver();


        driver.get("https://practice.cydeo.com/");

        if (driver.getCurrentUrl().contains("cydeo")){
            System.out.println("This URL contains the specified word, test passed");
        }else{
            throw new RuntimeException("This URL does not have the specified word, test failed");

        }

        String expectedTitle = "Practice";

        if(driver.getTitle().equals(expectedTitle)){
            System.out.println("The title is matched, test passed");
        }else{
            throw new RuntimeException("The title is not matched, test failed");
        }



    }
}
