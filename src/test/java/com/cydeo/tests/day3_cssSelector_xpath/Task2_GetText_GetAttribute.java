package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Task2_GetText_GetAttribute {
    public static void main(String[] args) {


        //TC #2: NextBaseCRM, locators, getText(), getAttribute() practice
        //1- Open a chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

        // 3- Verify “remember me” label text is as expected:
        WebElement rememberMeLabel = driver.findElement(By.className("login-item-checkbox-label"));

        //Expected: Remember me on this computer
        String expectedRememberMeLabel = "Remember me on this computer";
        String actualRememberMeLabel = rememberMeLabel.getText();

        if(actualRememberMeLabel.equals(expectedRememberMeLabel)){
            System.out.println("Verification for label passed");
        }else{
            System.out.println("Verification for label failed");
        }


        //4- Verify “forgot password” link text is as expected:
        WebElement forgotPassowrd = driver.findElement(By.className("login-link-forgot-pass"));


        //Expected: Forgot your password?
        String expectedForgotPass = "FORGOT YOUR PASSWORD?";
        String actualForgotPass = forgotPassowrd.getText();

        if(actualForgotPass.equals(expectedForgotPass)){
            System.out.println("Verification for Forgot Password passed");
        }else{
            System.out.println("Verification for Forgot Password failed");
        }


        //5- Verify “forgot password” href attribute’s value contains expected:
        //expected: forgot_password=yes
        String expectedInHref = "forgot_password=yes";
        String actualHrefAttributeValue = forgotPassowrd.getAttribute("href");

        if(actualHrefAttributeValue.contains(expectedInHref)){
            System.out.println("Verification passed");
        }else{
            System.out.println("Verification failed");
        }



        //PS: Inspect and decide which locator you should be using to locate web
        //elements.

    }
}
