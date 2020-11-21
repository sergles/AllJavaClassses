package com.syntax.class20;

public class Person {

    String name;
    String address;
    int age;
    String id;
    String phone;
    String SSN;
    char gender;
    char martialStatus;
    Double height;
    double weight;
    double salary;
    String education;
    // if i have 100 fields and 100 lines of code that i want to execute every time someone is creating an object of my class
    Person(){
        System.out.println("These are impotant lines they must be exucuted every time constructor is created");
        System.out.println("The lines of code are important, they must be executed before we create the object of the class");
        System.out.println("The lines of code are important, they must be executed before we create the object of the class");
        System.out.println("The lines of code are important, they must be executed before we create the object of the class");
        System.out.println("The lines of code are important, they must be executed before we create the object of the class");
        System.out.println("The lines of code are important, they must be executed before we create the object of the class");
    }

    Person(String name, int age, String phone, double salary){
        this();
        this.name=name;
        this.age=age;
        this.salary=salary;
        this.weight = 60;
        this.height = 5.4;
        System.out.println("I am the first constructor, i only have 4 fields mandatory");
    }
    Person(String name, int age, String phone, double salary, char martialStatus, String education) {
        this(name, age, phone, salary);
        this.martialStatus=martialStatus;
        this.education=education;
        System.out.println("I am the first constructor, i only have 6 fields mandatory");

    }
    Person(String name, int age, String phone, double salary, char martialStatus, String education, double height, double weight) {
       this(name, age, phone, salary, martialStatus, education);
        this.height=height;
        this.weight=weight;
        System.out.println("I am the first constructor, i only have 7 fields mandatory");
    }

public static void main(String[] args){

    Person person = new Person("Serg", 31, "66666666", 0, 'S', "SDET", 6, 170 );







}

    }
