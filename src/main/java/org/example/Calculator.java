package org.example;

import net.datafaker.Faker;

public class Calculator {

    Faker faker = new Faker();

    int a = faker.number().numberBetween(1,20);
    int b = faker.number().numberBetween(1,20);
    int c = faker.number().numberBetween(1,20);

    public void multiply(int a , int b ){
        System.out.println(a + " * " + b + " = " + (a * b));
    }
    public void multiply(int a , int b , int c){
        System.out.println(a + " * " + b + " * " + c + " = " + (a * b * c));
    }

        }





