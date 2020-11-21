package com.syntax.class16;
import java.util.Scanner;
public class Methods {
    public static void main(String[] args) {

tasks task1 = new tasks();
task1.method1(3,8);
task1.method2(7);
task1.method3("whats up");

Scanner input = new Scanner(System.in);
System.out.println("where are you from?");
task1.method4(input.next());







    }
}
