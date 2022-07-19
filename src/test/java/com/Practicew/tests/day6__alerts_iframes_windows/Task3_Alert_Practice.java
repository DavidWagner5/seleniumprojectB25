package com.Practicew.tests.day6__alerts_iframes_windows;

import com.Practicew.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Task3_Alert_Practice {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){

        //Open Browser

        //1. Open browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2. Go to website: https://practice.cydeo.com/javascript_alerts
        driver.get("https://practice.cydeo.com/javascript_alerts");

    }

    @Test
    public void alert_test1(){

        //3 click to "Click for JS Alert" button
        WebElement informationAlertButton = driver.findElement(By.xpath("//button[.='Click for JS Alert']"));

        informationAlertButton.click();

        //4 to be able to click to alert OK button we need to switch driver's focus to alert itself
        Alert alert = driver.switchTo().alert();
        alert.accept();

        //5 verify "You successfully clicked on alert" text is displayed
        WebElement resultText = driver.findElement(By.xpath("//p[@id='result']"));


        //Failure message will only be displayed if assertion fails: "Result text is NOT displayed."
        Assert.assertTrue(resultText.isDisplayed(), "Result text is NOT displayed.");

        String expectedText = "You successfully clicked an alert";
        String actualText = resultText.getText();


        Assert.assertEquals(actualText, expectedText, "Actual result text is not as expected!!!");





    }

}
