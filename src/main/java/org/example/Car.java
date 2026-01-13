package org.example;

import net.datafaker.Faker;

public class Car {

    Faker faker = new Faker();

    String model = faker.vehicle().model();
    String brand = faker.vehicle().make();
    int year = faker.number().numberBetween(1900, 2020) ;



    public void printInfo(){
        System.out.println(model + " " + brand + " " + year);
    }
}
