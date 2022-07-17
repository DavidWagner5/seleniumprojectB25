package com.cydeo.tests.day8_WebtablesReview_Properties_config_reader;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Task1_Webtable {


    public WebDriver driver;

    @BeforeMethod
    public void setupMethod(){

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/web-tables");

    }



    @Test
    public void order_name_verify_test(){
        //TC #1: Web table practice
        //1. Go to: https://practice.cydeo.com/web-tables

        //locate the sell that has bob martins text in it
        WebElement bobMartinCell = driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//td[.='Bob Martin']"));

        System.out.println("bobMartinCell = " + bobMartinCell.getText());


        //2. Verify Bob’s name is listed as expected.
        String expectedName = "Bob Martin";
        String actualName = bobMartinCell.getText();

        Assert.assertEquals(actualName, expectedName);



        //Expected: “Bob Martin”
        //3. Verify Bob Martin’s order date is as expected

        WebElement bobMartinDateCell = driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//td[.='Bob Martin']/following-sibling::td[3]"));

        System.out.println("bobMartinDateCell = " + bobMartinDateCell.getText());


        String expectedDate = "12/31/2021";
        String actualDate = bobMartinDateCell.getText();

        Assert.assertEquals(actualDate, expectedDate);
    }
}
