package com.cydeo.tests.Day5_xPath_DynamicAttributes_testNG_introDropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Task3_RadioButtonCont {

    public static void main(String[] args) {



        //TC 3
        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        //2. navigate to website
        driver.get("https://practice.cydeo.com/radio_buttons");

        //Locate name = 'sports radio buttons and store them in a list of Web Element
        List<WebElement> sportsRadioButtons = driver.findElements(By.xpath("//input[@name='sport']"));

        //loop through the list of webelement and select matching result "hockey"
        for (WebElement each : sportsRadioButtons) {

         String eachId = each.getAttribute("id");
            System.out.println("eachId = " + eachId);

            if(eachId.equals("hockey")){
                each.click();
                System.out.println("Hockey is selected");
                break;
            }

        }





    }


    private static void clickAndVerifyRadioButton(WebDriver driver, String nameAttribute, String idValue){
        List<WebElement> radioButtons = driver.findElements(By.name(nameAttribute));

        for (WebElement each : radioButtons) {

            String eachId = each.getAttribute("id");
            System.out.println("eachId = " + eachId);

            if(eachId.equals(idValue)){
                each.click();
                System.out.println(eachId+ " is selected" + each.isSelected());
                break;
            }

        }



    }
}
