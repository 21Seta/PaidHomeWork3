package org.example;

import net.datafaker.Faker;

public class Address {
    Faker faker = new Faker();

    String Country = faker.address().country();
    String City = faker.address().city();
    String Zipcode = faker.address().zipCode();


    public void AddressInfo(){
        System.out.println("Country is : " + Country);
        System.out.println("City is : " + City);
        System.out.println("Zipcode is : " + Zipcode);
        System.out.println();
    }
}
