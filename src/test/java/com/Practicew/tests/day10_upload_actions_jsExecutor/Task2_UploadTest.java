package com.Practicew.tests.day10_upload_actions_jsExecutor;

import com.Practicew.utilities.BrowserUtils;
import com.Practicew.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Task2_UploadTest {

    @Test
    public void upload_test(){
        //TC #2 Upload Test
        //1. Go to https://practice.cydeo.com/upload
        Driver.getDriver().get("https://practice.cydeo.com/upload");

        //2. Find some small file from your computer, and get the path of it.
        String path = "C:\\Users\\beatr\\OneDrive\\Pictures\\Screenshot 2022-02-24 140024.png";

        //3. Upload the file.
        WebElement fileUpload = Driver.getDriver().findElement(By.id("file-upload"));

        BrowserUtils.sleep(2);
        fileUpload.sendKeys(path);

        WebElement uploadButton = Driver.getDriver().findElement(By.id("file-submit"));
        uploadButton.click();

        //4. Assert:
        //-File uploaded text is displayed on the page
        WebElement fileUploadedHeader = Driver.getDriver().findElement(By.tagName("h3"));
        Assert.assertTrue(fileUploadedHeader.isDisplayed());
    }
}
