package com.cydeo.tests.day6__alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Task4_iframe {
    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        //1. Open browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2. Go to website: https://practice.cydeo.com/javascript_alerts
        driver.get("https://practice.cydeo.com/iframe");
    }

    @Test
    public void iframe_test(){

        //we need to focus driver attention to iframe
        //1 switch to iframe using id attribute value
        driver.switchTo().frame("mce_0_ifr");

        //locate the p tag
        WebElement yourCointentGoesHereText = driver.findElement(By.xpath("//p"));  //we can do //p because it is the only paragraph on the page

        Assert.assertTrue(yourCointentGoesHereText.isDisplayed());


        //Verify "An iFrame containing the TinyMCE WYSIWYG Editor" is displayed
        //to be able to verify the header, we must switch back to "main HTML"
        driver.switchTo().parentFrame();

        WebElement headerText = driver.findElement(By.xpath("//h3")); //we can do //h3 because it is the only h3 on the page

        //assertion of header text is displayed or not

       Assert.assertTrue(headerText.isDisplayed());

    }
}
