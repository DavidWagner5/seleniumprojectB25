package com.Practicew.tests.day8_WebtablesReview_Properties_config_reader;

import com.Practicew.utilities.ConfiguratonReader;
import com.Practicew.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Task4_Config_Practice {
/*
    public WebDriver driver;

    @BeforeMethod
    public void setupMethod(){


        String browserType = ConfiguratonReader.getProperty("browser");
        driver = WebDriverFactory.getDriver(browserType);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.google.com");

    }*/


    @Test
    public void google_search_test(){

        Driver.getDriver().get("https://www.google.com");
        //3- Write “apple” in search box
        WebElement googleSearchBox = Driver.getDriver().findElement(By.xpath("//input[@name='q']"));

        googleSearchBox.sendKeys(ConfiguratonReader.getProperty("searchValue") + Keys.ENTER);

        //4- Verify title:
        //Expected: apple - Google Search
        String expectedTitle = ConfiguratonReader.getProperty("searchValue")+" - Google Search";
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals(actualTitle, expectedTitle);
    }






    }





    //Use configuration.properties for the following:
    //1. The browser type
    //2. The URL
    //3. The search keyword
    //4. Make title verification dynamic. If search value changes, title
   // assertion should not fail.

