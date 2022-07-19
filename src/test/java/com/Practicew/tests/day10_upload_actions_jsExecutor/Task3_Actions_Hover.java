package com.Practicew.tests.day10_upload_actions_jsExecutor;

import com.Practicew.utilities.BrowserUtils;
import com.Practicew.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Task3_Actions_Hover {
@Test
    public void hovering_test() {


    //1 go to https://practice.cydeo.com/hovers
    Driver.getDriver().get("https://practice.cydeo.com/hovers");

    //locate all images under here
    WebElement firstProfile = Driver.getDriver().findElement(By.xpath("(//img[@alt='User Avatar'])[1]"));
    WebElement secondProfile = Driver.getDriver().findElement(By.xpath("(//img[@alt='User Avatar'])[2]"));
    WebElement thirdProfile = Driver.getDriver().findElement(By.xpath("(//img[@alt='User Avatar'])[3]"));

    //locate all "user" texts under here
    WebElement user1 =Driver.getDriver().findElement(By.xpath("//h5[text()='name: user1']"));
    WebElement user2 =Driver.getDriver().findElement(By.xpath("//h5[text()='name: user2']"));
    WebElement user3 =Driver.getDriver().findElement(By.xpath("//h5[text()='name: user3']"));


    Actions actions = new Actions(Driver.getDriver());

    //2 hover over images, assert //a "name: user1" is displayed
    BrowserUtils.sleep(2);
    actions.moveToElement(firstProfile).perform();
    Assert.assertTrue(user1.isDisplayed());

    BrowserUtils.sleep(2);
    actions.moveToElement(secondProfile).perform();
    Assert.assertTrue(user2.isDisplayed());


    BrowserUtils.sleep(2);
    actions.moveToElement(thirdProfile).perform();
    Assert.assertTrue(user3.isDisplayed());




}
}
