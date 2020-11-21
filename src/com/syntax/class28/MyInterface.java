package com.syntax.class28;

public interface MyInterface {
    // before Java 8
    public  static String name = "hi";
    void printInfo();

    //Java 8
    static void printNumbers(){
        System.out.println("123456789");
    }


    default void printName(){
        // these default methods are used to support lambdas
    }
}
