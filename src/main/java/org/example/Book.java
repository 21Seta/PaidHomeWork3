package org.example;

import net.datafaker.Faker;

public class Book {
    Faker faker = new Faker();

    String tittle = faker.book().title() ;
    String author = faker.book().author() ;
    int pages = faker.number().numberBetween(1,600);

    @Override
    public String toString(){
        return "Tittle : " + tittle +
                " Author : " + author +
                " Pages : " + pages ;

    }
}

