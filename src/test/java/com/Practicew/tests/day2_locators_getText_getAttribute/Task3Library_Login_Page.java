package com.Practicew.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3Library_Login_Page {

    public static void main(String[] args) {


        //Library verifications

        //Open chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //Go to https://library2.cybertekschool.com/login.html
        driver.get("https://library2.cybertekschool.com/login.html");

        //locate by using className
        // Enter username"incorrect@email.com"
        WebElement usernameInput =driver.findElement(By.className("form-control"));
        usernameInput.sendKeys("incorrect@email.coom");

        //locate by using id
        // enter password: "incorrect password"
        WebElement passwordInput = driver.findElement(By.id("inputPassword"));
        passwordInput.sendKeys("!Generalkenobi54");

        //locate by using tagName
        // click sign in
        WebElement singInButton = driver.findElement(By.tagName("button"));
        singInButton.click();

        //verify: visually "sorry, wrong email or password
    }
}
