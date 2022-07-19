package com.Practicew.tests.day6__alerts_iframes_windows;

/*When you open another window, selenium is still on the old window,
so that's why we have to switch to window by following two steps.
 First step is get handle window, then switch to new window.
syntax: driver.getWindowHandle(); // return a String for one window
then    driver.switchTo().window(driver.getWindowHandle())*/

import com.Practicew.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Task5_Windows_PRactice {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        //1. Open browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2. Go to website: https://practice.cydeo.com/windows
        driver.get("https://practice.cydeo.com/windows");
    }

    @Test
    public void multiple_window_test(){

        //Storing the main page's window handle as string is
        // good practice for future re-usable purposes
        String mainHandle = driver.getWindowHandle();

        System.out.println("mainHandle = " + mainHandle);

        //4. Assert: Title is “Windows”
        String expectedTitle = "Windows";
        String actualTitle = driver.getTitle();

        Assert.assertEquals(actualTitle, expectedTitle);

        System.out.println("Title before click: " + actualTitle);

        //5. Click to: “Click Here” link
        WebElement clickHereLink = driver.findElement(By.linkText("Click Here"));

        clickHereLink.click();



        //6. Switch to new Window.
        for(String each: driver.getWindowHandles()){

            driver.switchTo().window(each);
            System.out.println("Current title while switching windows: " + driver.getTitle());

        }

        //7. Assert: Title is “New Window”
        String expectedTitleAfterClick = "New Window";
        actualTitle = driver.getTitle();

        Assert.assertEquals(actualTitle, expectedTitleAfterClick);

        System.out.println("Title after click: " + actualTitle);

    }

    @AfterMethod
    public void tearDown(){

        driver.quit();
    }

}
