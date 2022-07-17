package com.cydeo.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class VeirfyRadioButton {
    //give driver and website first

    public static void clickAndVerifyRadioButton(WebDriver driver, String nameAttribute, String idValue){
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
