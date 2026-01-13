package org.example;

import net.datafaker.Faker;

public class BankAccount {

    Faker faker = new Faker();
    double   Balance = faker.number().randomDouble(2, 0, 500);;

    public void CurrentBalance() {
        System.out.println("მიმდინარე ბალანსი " + Balance + " ₾");

        if (this.Balance < 100) {
            System.out.println("ბალანსი არასაკმარისია ");
        } else {
            System.out.println();
        }

        }
    }


