package com.cydeo.tests.day6__alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DisneyPlusMethod{

    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        //1. Open Chrome browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);



    }

    @Test
    public void loginAndWatchStarWars (){
        driver.get("https://www.disneyplus.com/home");

        WebElement LoginBtn = driver.findElement(By.xpath("//a[@href='/login']"));
        LoginBtn.click();
        WebElement EmailBox = driver.findElement(By.xpath("//input[@aria-label='Email']"));
        EmailBox.click();
        EmailBox.sendKeys("alexwagnercello224@gmail.com" + Keys.ENTER);
        WebElement pwBox = driver.findElement(By.xpath("//input[@aria-label='Enter your password']"));
        pwBox.click();
        pwBox.sendKeys("loopytoosdays69" + Keys.ENTER);
        WebElement DavidIcon = driver.findElement(By.xpath("//div[@aria-label='David']"));
        DavidIcon.click();
        WebElement StarWarsIcon = driver.findElement(By.xpath("//div[@aria-label='Star Wars']"));
        StarWarsIcon.click();
        WebElement BoBFIcon = driver.findElement(By.xpath("//a[@class='sc-bZQynM dljDpR basic-card skipToContentTarget gv2-tracked']"));
        BoBFIcon.click();
        WebElement BobFEp5 = driver.findElement(By.cssSelector("div[data-testid='episode-s1-e5']"));
        BobFEp5.click();



    }


}
