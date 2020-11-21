package com.syntax.class16;

public class tasks {

public void method1 (int n1, int n2){


    if (n1>n2) {
        System.out.println(n1+ "larger than"+n2);
    } else if (n2>n1){
        System.out.println(n2+"larger than"+n1);
    }else {
        System.out.println("two numbers are equal");
    }
}
public void method2 (int n1){
    if (n1%2==0){
        System.out.println("number is even");
    } else
        System.out.println("number is odd");
}
public  void method3(String sentence) {
    boolean isPalindrome = true;
    for (int i = (sentence.length() - 1), j = 0; i <= 1; i--, j++) {
        if (sentence.charAt(i) != sentence.charAt(j)) {
            isPalindrome = false;
            break;
        }
    }

    if (isPalindrome) {
        System.out.println("sentence is a palindrome");
    } else {
        System.out.println("sentence is not a palindrome");
    }
}

    public void method4( String country) {

    if (country.equalsIgnoreCase ("france")){
        System.out.println("bon jour");
    }else if (country.equalsIgnoreCase ("england")){
        System.out.println("hello");
    }else if (country.equalsIgnoreCase ("russia")){
        System.out.println("Zdraste");
    }else if (country.equalsIgnoreCase ("ukraine")){
        System.out.println("pryvit");
    }else if (country.equalsIgnoreCase ("spain")){
        System.out.println("hola");

    }
















}




}
