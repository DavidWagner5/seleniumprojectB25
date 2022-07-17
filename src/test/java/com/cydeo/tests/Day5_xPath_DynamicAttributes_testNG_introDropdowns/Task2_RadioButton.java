package com.cydeo.tests.Day5_xPath_DynamicAttributes_testNG_introDropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class Task2_RadioButton {

    public static void main(String[] args) {


        //TC 2
        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        driver.get("https://practice.cydeo.com/radio_buttons");

        //3 click to "Hockey" radio button
        WebElement hockeyRadioBtn = driver.findElement(By.xpath("//input[@id='hockey']"));
        hockeyRadioBtn.click();

        //verify hockey radio button is selected after clicking

        if(hockeyRadioBtn.isSelected()){
            System.out.println("Button is selected. Verification passed");
        }else{
            System.out.println("Button is not selected. Verification failed");
        }

    }
}
