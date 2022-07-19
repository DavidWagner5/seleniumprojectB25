package com.Practicew.tests.day9_javafaker_testbase_driverUtil;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class JavaFakerPractice {

    @Test
    public void test1(){

        //creating faker object to reach methods
        Faker faker = new Faker();

        System.out.println("faker.name().firstName() = " + faker.name().firstName());

        System.out.println("faker.name().lastName() = " + faker.name().lastName());

        System.out.println("faker.name().fullName() = " + faker.name().fullName());

        System.out.println("faker.numerify(\"###-###-####\") = " + faker.numerify("###-###-####")); //or

        System.out.println("faker.numerify(\"847-###-####\") = " + faker.numerify("847-###-####"));

        System.out.println("faker.letterify(\"???-????\") = " + faker.letterify("???-????"));

        System.out.println("faker.lordOfTheRings().character() = " + faker.lordOfTheRings().character());

        System.out.println("faker.chuckNorris().fact() = " + faker.chuckNorris().fact());

        System.out.println("faker.yoda().quote() = " + faker.yoda().quote());




    }
}
