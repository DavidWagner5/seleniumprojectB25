package com.Practicew.tests.day10_upload_actions_jsExecutor;

import com.Practicew.utilities.BrowserUtils;
import com.Practicew.utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class Task6_JavaScriptExecutor {

    @Test
    public void javascript_executor_test1(){

       // TC #6: Scroll using JavascriptExecutor
        //1- Open a chrome browser
       // 2- Go to: https://practice.cydeo.com/infinite_scroll
        Driver.getDriver().get("https://practice.cydeo.com/infinite_scroll");


       // 3- Use below JavaScript method and scroll
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

        BrowserUtils.sleep(2); //you can put it in a loop if you want to scroll like 10 times. 750 is one scroll
        js.executeScript("window.scrollBy(0,750)");

       // a.  750 pixels down 10 times.
        // b.  750 pixels up 10 times

       // JavaScript method to use : window.scrollBy(0,0)

    }
}
