package org.example;

import net.datafaker.Faker;

public class Student {
    Faker faker = new Faker();

    private String name = faker.name().fullName();
    private int age = faker.number().numberBetween(18, 22);
    private String grade = faker.options().option("A", "B", "C", "D", "F");

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGrade() {
        return grade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {

        this.age = age;
    }


    public void setGrade(String grade) {

        this.grade = grade;

    }

    public void printInfoStudent(){
        System.out.println(name + " " + age + " " + grade);
    }

}
