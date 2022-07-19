package com.Practicew.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day2_Linktext_Practice {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();


        //go to https://practice.cydeo.com
        driver.get("https://practice.cydeo.com");

        //click to A/B testing from the top of the list
        WebElement abTestLink = driver.findElement(By.linkText("A/B Testing"));
        abTestLink.click();


        //verify the title
        //Expected: No A/B Test
        String expectedTitle = "No A/B Test";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title verification PASS!");
        }else{
            System.out.println("Title verification FAILED!!!");
        }

        //5- Go back to home page by using the .back();
        driver.navigate().back();

        //6- Verify title equals:
        //Expected: Practice
        expectedTitle= "Practice";
        actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title verification PASSED!");
        }else{
            System.out.println("Title verification FAILED!!!");
        }

    }





}
