package com.syntax.class14;
import java.util.Scanner;


public class Task {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your username");
        String user = scan.next();
        System.out.println("Enter your password");
        String password = scan.next();
        while(user.isEmpty() || password.isEmpty() ) {
            System.err.println("Username or password cannot be empty");
            System.out.println("Enter your username");
            user = scan.next();
            System.out.println("Enter your password");
            password = scan.next();
        }


    }
}
