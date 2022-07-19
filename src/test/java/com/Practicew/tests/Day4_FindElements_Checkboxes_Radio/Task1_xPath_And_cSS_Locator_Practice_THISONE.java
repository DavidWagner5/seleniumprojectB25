package com.Practicew.tests.Day4_FindElements_Checkboxes_Radio;
//   > symbol can be used to find a child class of a parent class if there are no tags to use
import com.Practicew.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Task1_xPath_And_cSS_Locator_Practice_THISONE {

    public static void main(String[] args) {

        //DO NOT USE ANY DEVELOPER TOOLS TO GET ANY LOCATORS.
        //TC #1: XPATH and cssSelector Practices
        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2. Go to https://practice.cydeo.com/forgot_password
        driver.get("https://practice.cydeo.com/forgot_password");

        //3. Locate all the WebElements on the page using XPATH and/or CSS
        //locator only (total of 6)
        //a. “Home” link

        //Locate homeLink using cssSelector syntax#1
        WebElement homeLink_ex1= driver.findElement(By.cssSelector("a[class='nav-link']"));

        //Locate homeLink using cssSelector syntax #2
        WebElement homeLink_ex2= driver.findElement(By.cssSelector("a.nav-link"));

        WebElement homeLink_ex3 = driver.findElement(By.cssSelector("a[href='/']"));


        //b. “Forgot password” header
        WebElement headerEx_1= driver.findElement(By.cssSelector("div.example > h2"));

        //using xpath
        WebElement headerEx_2 = driver.findElement(By.xpath("//h2[text()='Forgot Password']"));


        //c. “E-mail” text
        WebElement emailEx_1 = driver.findElement(By.xpath("//label[@for='email']"));


        //d. E-mail input box
        WebElement inputBoxEX_1 = driver.findElement(By.xpath("//input[@type='text']"));

        WebElement inputBoxEx_2 = driver.findElement(By.xpath("//input[contains(@pattern,'a-z')]"));


        //e. “Retrieve password” button
        WebElement passwordButtonEX_1 = driver.findElement(By.xpath("//i[@class='icon-2x icon-signin']"));

        //f. “Powered by Cydeo text
        WebElement poweredByCydeoText = driver.findElement(By.xpath("//div[@style='text-align: center;']"));

        //4. Verify all web elements are displayed.
        System.out.println("homeLink_ex1 = " + homeLink_ex1.isDisplayed());
        System.out.println("headerEx_1 = " + headerEx_1.isDisplayed());
        System.out.println("emailEx_1 = " + emailEx_1.isDisplayed());
        System.out.println("inputBoxEX_1 = " + inputBoxEX_1.isDisplayed());
        System.out.println("passwordButtonEX_1 = " + passwordButtonEX_1.isDisplayed());
        System.out.println("poweredByCydeoText = " + poweredByCydeoText.isDisplayed());


    }
}
