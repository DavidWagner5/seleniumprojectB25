package com.Practicew.tests.day11_Actions_JsExecutorPractice;

import com.Practicew.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionsPractice {

    @Test
    public void task_4_and_5_test() {

//scroll practice

        //go to https://practice.cydeo.com/
        Driver.getDriver().get("https://practice.cydeo.com");

        //scroll down to "Powered by CYDEO"

        Actions actions = new Actions(Driver.getDriver());

        //locate cydeo link to be able to pass in the actions method
        WebElement cydeoLink = Driver.getDriver().findElement(By.linkText("CYDEO"));

        //scroll using action class moveTo
        actions.moveToElement(cydeoLink).perform();

        //scroll back up to "home link using pageUP button
        //actions.sendKeys(Keys.PAGE_UP, Keys.PAGE_UP).perform();  //this function is another option for scrolling

        Driver.getDriver().close();

    }


    @Test
    public void test() {
        Driver.getDriver().get("https://practice.cydeo.com");


    }

}
