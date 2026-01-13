package org.example;

import net.datafaker.Faker;

public class User {
    Address address;
    String name;
    String email;

Faker faker = new Faker();

public User (String name){
  this.name = faker.name().firstName();
    this.address = new Address();
}

public User (String name , String email){
    this.name = faker.name().firstName();
    this.email = faker.internet().emailAddress();
    this.address = new Address();
    address.AddressInfo();
}

}
