package org.example;

import net.datafaker.Faker;

public class Product {

    Faker faker = new Faker();

    double Price = faker.number().numberBetween(10 , 1000); ;
    int Discount = faker.number().numberBetween (10 ,50); ;


    public void printPriceAfterDiscount(){
        System.out.println("საწყისი ფასი : " + Price);
        System.out.println("ფასი ფასდაკლების შემდგომ  : " + Price * Discount / 100);


    }


}
