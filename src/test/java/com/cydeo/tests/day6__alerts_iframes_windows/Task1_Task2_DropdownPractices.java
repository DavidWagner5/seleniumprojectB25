package com.cydeo.tests.day6__alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Task1_Task2_DropdownPractices {
   public WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
    WebDriver driver = WebDriverFactory.getDriver("chrome");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.get("https://practice.cydeo.com/dropdown");

        }


        @Test
    public void dropdown_task5(){



        Select stateDropdown = new Select(driver.findElement(By.xpath("//select[@id='state']")));


        //3. Select Illinois
        stateDropdown.selectByVisibleText("Illinois");

        //4. select Virginia
        stateDropdown.selectByValue("VA");

        //5. Select California
        stateDropdown.selectByIndex(5);

        //6. verify that actualStateDropdown is expected

        String expectedStateDropdown = "California";
        String actualStateDropdown = stateDropdown.getFirstSelectedOption().getText();

        //7. now assert instead of if statement
        Assert.assertEquals(actualStateDropdown, expectedStateDropdown);
    }


    @Test
    public void dropdown_task6(){
        //Select “December 1 , 1923” and verify it is selected.
        Select yearDropdown = new Select(driver.findElement(By.xpath("//select[@id='year']")));
        Select monthDropdown = new Select(driver.findElement(By.xpath("//select[@id='month']")));
        Select dayDropdown = new Select(driver.findElement(By.xpath("//select[@id='day']")));

        //Select year using : visible text
        yearDropdown.selectByVisibleText("1923");

        //Select month using : value attribute
        monthDropdown.selectByValue("11");

        //Select day using : index number
        dayDropdown.selectByIndex(0);

        //creating expected values
        String expectedYear = "1923";
        String expectedMonth = "December";
        String expectedDay = "1";

        //getting actual values from browser
        String actualYear = yearDropdown.getFirstSelectedOption().getText();
        String actualMonth = monthDropdown.getFirstSelectedOption().getText();
        String actualDay = dayDropdown.getFirstSelectedOption().getText();

        //create assertions
        Assert.assertTrue(actualYear.equals(expectedYear));
        Assert.assertEquals(actualMonth, expectedMonth);
        Assert.assertEquals(actualDay, expectedDay);

    }

}
