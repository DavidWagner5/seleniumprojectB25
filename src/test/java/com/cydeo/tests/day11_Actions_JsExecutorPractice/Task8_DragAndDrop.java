package com.cydeo.tests.day11_Actions_JsExecutorPractice;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Task8_DragAndDrop {

    //TC #: Drag and drop
    //1. Go to https://demos.telerik.com/kendo-ui/dragdrop/index
    @Test
    public void Drag_and_Drop_test() {


        Driver.getDriver().get("https://demos.telerik.com/kendo-ui/dragdrop/index");


        //locate the accept cookies button
        WebElement acceptCookiesButton = Driver.getDriver().findElement(By.id("onetrust-accept-btn-handler"));
        BrowserUtils.sleep(2);
        acceptCookiesButton.click();


        //2. Drag and drop the small circle to bigger circle.
        WebElement smallcircle = Driver.getDriver().findElement(By.id("draggable"));
        WebElement bigcircle = Driver.getDriver().findElement(By.id("droptarget"));

        Actions actions = new Actions(Driver.getDriver());
        actions.dragAndDrop(smallcircle,bigcircle).perform();


        //3. Assert:
        String actualbigcircletext = bigcircle.getText();
        String expectdbigcircletext = "You did great!";

        Assert.assertEquals(actualbigcircletext, expectdbigcircletext);
        //Text in big circle changed to: “You did great!”
    }
}
