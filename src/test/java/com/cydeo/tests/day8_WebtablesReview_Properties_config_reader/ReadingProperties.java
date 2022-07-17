package com.cydeo.tests.day8_WebtablesReview_Properties_config_reader;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadingProperties {

    @Test
    public void reading_from_properties_test() throws IOException {
        //create the object of
        Properties properties = new Properties();

        //2 We need to open the file in java memory: FileInputStream
        FileInputStream file = new FileInputStream("configuration.properties");

        //3 load the properties object using fileinputstream object
        properties.load(file);

        //4 use "properties" object to read value
        System.out.println("properties.getProperty(\"browser\") = " + properties.getProperty("browser")); //to make it print like this just put .soutv at the end

        System.out.println("properties.getProperty(\"env\") = " + properties.getProperty("env"));

        System.out.println("properties.getProperty(\"username\") = " + properties.getProperty("username"));

    }
}
