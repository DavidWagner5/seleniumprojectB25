package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Task4_cssSelector_GetText {


    public static void main(String[] args) {

        //NextBaseCRM, locators, getText(),getAttribute() practice



        //1 open chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2 go to https://login1.nextbasecrm.com/?forgot_password=yes
        driver.get("https://login1.nextbasecrm.com/?forgot_password=yes");

        //3 verify "Reset password" button text is as expected:
        //Expected: Reset password
        //first find the web element
        WebElement resetPassword = driver.findElement(By.cssSelector("button[class='login-btn']"));

        String actualResetPassword = resetPassword.getText();
        String expectedResetPassword = "Reset password";

        if(actualResetPassword.equals(expectedResetPassword)){
            System.out.println("Password verification passed");
        }else{
            System.out.println("Password verification failed");
        }

    }
}
