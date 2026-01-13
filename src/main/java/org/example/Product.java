package org.example;

import net.datafaker.Faker;

public class Product {

    Faker faker = new Faker();

    double Price ;
    int Discount ;

    public Product(){

        this.Price = faker.number().numberBetween(10 , 1000);
        this.Discount = faker.number().numberBetween (10 ,50);
    }

    public void printPriceAfterDiscount(){
        System.out.println("საწყისი ფასი : " + Price);
        System.out.println("ფასი ფასდაკლების შემდგომ  : " + Price * Discount / 100);


    }


}
