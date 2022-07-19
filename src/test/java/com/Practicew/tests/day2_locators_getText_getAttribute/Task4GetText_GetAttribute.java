package com.Practicew.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task4GetText_GetAttribute {
    public static void main(String[] args) {




     //TC #5: getText() and getAttribute() method practice
    //1- Open a chrome browser\

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

    //2- Go to: https://practice.cydeo.com/registration_form
        driver.get("https://practice.cydeo.com/registration_form");


    //3- Verify header text is as expected:
        WebElement headerText = driver.findElement(By.tagName("h2"));


    //Expected: Registration form
        String expectedHeaderText = "Registration form";
        String actualHeaderText = headerText.getText();

        if(actualHeaderText.equals(expectedHeaderText)){
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
        }

        //4- Locate “First name” input box
        //locating web element
        WebElement firstNameInput =  driver.findElement(By.name("firstname"));

    //5- Verify placeholder attribute’s value is as expected:
    //Expected: first name*/
        //now we get the value of the web element's placeholder, which is the same as the name attribute
        String expectedPlaceHolder = "first name";
        String actualPlaceHolder = firstNameInput.getAttribute("placeholder");

        if(actualPlaceHolder.equals(expectedPlaceHolder)){
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
        }

    }
}
