package org.example;

import net.datafaker.Faker;

public class User {
    String name;
    String email;
    Address address;

Faker faker = new Faker();

public User (String name){
  this.name = faker.name().fullName();
  this.address = new Address();

}

public User (String name , String email){
    this(name);
    this.email = faker.internet().emailAddress();

}

}
