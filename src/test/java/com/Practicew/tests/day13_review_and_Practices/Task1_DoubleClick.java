package com.Practicew.tests.day13_review_and_Practices;

import com.Practicew.pages.DoubleClickPage;
import com.Practicew.utilities.Driver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Task1_DoubleClick {


    @Test
    public void Double_click_to_test(){

        //Go To
        //https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2

        Driver.getDriver().get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2");

        //find iframe
        Driver.getDriver().switchTo().frame("iframeResult");

        //double click on the text "Double-Click me to change my text color"
        DoubleClickPage doubleClickPage = new DoubleClickPage();
        Actions actions = new Actions(Driver.getDriver());


        actions.doubleClick(doubleClickPage.textToDoubleClick).perform();



        //4. Assert:Text’s “style” attribute value contains “red”.
        System.out.println("doubleClickPage.textToDoubleClick.getAttribute(\"style\") = "
                + doubleClickPage.textToDoubleClick.getAttribute("style"));

        String actualStyleAttributeValue = doubleClickPage.textToDoubleClick.getAttribute("style");
        String expectedInStyleAttribute = "red";

        Assert.assertTrue(actualStyleAttributeValue.contains(expectedInStyleAttribute));



    }
}
