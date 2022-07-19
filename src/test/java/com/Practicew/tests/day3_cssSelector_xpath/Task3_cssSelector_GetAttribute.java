package com.Practicew.tests.day3_cssSelector_xpath;

import com.Practicew.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Task3_cssSelector_GetAttribute {

    public static void main(String[] args) {
        //NextBaseCRM, locators, getText(),getAttribute() practice



        //1 open chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2 go to https://login1.nextbasecrm.com
        driver.get("https://login1.nextbasecrm.com");

        //3 Verify if "Log In" button is as expected:
        //Expected: Log In
        WebElement signInButton = driver.findElement(By.cssSelector("input[type='submit']")); //or input[class='login-btn'], or input[value='Log In']

        String expectedButtonText = "Log In";

        //Getting the value of the attribute "value"
        String actualButtonText = signInButton.getAttribute("value");

        System.out.println("actualButtonText = " + actualButtonText);

        if (actualButtonText.equals(expectedButtonText)){
            System.out.println("Log In button text verification passed!");
        }else{
            System.out.println("Log In button text verification failed!");
        }


    }
}
