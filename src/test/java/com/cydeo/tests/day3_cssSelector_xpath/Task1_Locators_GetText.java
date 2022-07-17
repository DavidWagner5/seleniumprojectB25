package com.cydeo.tests.day3_cssSelector_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1_Locators_GetText {

    public static void main(String[] args) {

        //TC #1: NextBaseCRM, Locators and getText() practice
        // open chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();



        //go to https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

        //enter incorrect username: "incorrect"
        WebElement username = driver.findElement(By.className("login-inp"));
        username.sendKeys("incorrect");



        //enter incorrect password: "incorrect"
        WebElement password = driver.findElement(By.name("USER_PASSWORD"));
        password.sendKeys("incorrect");


        //click log in button.
        WebElement Loginbutton = driver.findElement(By.className("login-btn"));
        Loginbutton.click();

        //verify error message text is as expected:
        //Expected: Incorrect login or password

        WebElement errorMessage = driver.findElement(By.className("errortext"));
        String expectedErrorMessage = "Incorrect login or password";
        String actualErrorMessage = errorMessage.getText();
        if(actualErrorMessage.equals(expectedErrorMessage)){
            System.out.println("Verification Passed");
        }else{
            System.out.println("Verification Failed");
        }
    }
}
