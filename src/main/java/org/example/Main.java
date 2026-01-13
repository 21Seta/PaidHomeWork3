package org.example;


import java.sql.SQLOutput;

public class Main
{
    public static void main( String[] args )

    {

        System.out.println("ამოცანა : 1");
        System.out.println();

        User user1 = new User("");
        User user2 = new User("" , "");


        System.out.println("username : " + user1.name);
        System.out.println("username : " + user2.name + " , " +  user2.email);

        System.out.println();
        System.out.println(" ამოცანა : 2");
        System.out.println();

        Car car = new Car();
        car.printInfo();

        System.out.println();
        System.out.println(" ამოცანა : 3");
        System.out.println();

        Student student = new Student();
        student.printInfoStudent();

        System.out.println();
        System.out.println(" ამოცანა : 4");
        System.out.println();


        Calculator calculator = new Calculator();
        calculator.multiply(calculator.a , calculator.b );
        calculator.multiply(calculator.a, calculator.b, calculator.c);

        System.out.println();
        System.out.println(" ამოცანა : 5");
        System.out.println();


        Book book = new Book();
        System.out.println(book.toString());

        System.out.println();
        System.out.println(" ამოცანა : 6");
        System.out.println();

        BankAccount bankAccount = new BankAccount();
        bankAccount.CurrentBalance();

        System.out.println();
        System.out.println(" ამოცანა : 7");
        System.out.println();

        Product product = new Product();
        product.printPriceAfterDiscount();







    }



}
