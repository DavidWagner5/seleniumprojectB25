package com.cydeo.tests.day11_Actions_JsExecutorPractice;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Task7_ScrollPractice {

    //open chrome browser
    // go to https://practice.cydeo.com/large

    @Test
    public void Scroll_Test(){

        Driver.getDriver().get("https://practice.cydeo.com/large");

        WebElement cydeoLink = Driver.getDriver().findElement(By.linkText("CYDEO"));
        WebElement homeLink = Driver.getDriver().findElement(By.linkText("Home"));


        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

        //3 Scroll down to cydeo link
        BrowserUtils.sleep(2);
        js.executeScript("arguments[0].scrollIntoView(true)", cydeoLink); //dont worry about the syntax just know what it does

        //4 Scroll up to home link
        BrowserUtils.sleep(2);
        js.executeScript("arguments[1].scrollIntoView(true)",cydeoLink, homeLink);  //cydeo link is index 0 and home link is index 1

    }
}
