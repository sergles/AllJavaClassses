package com.review01;
import java.util.Scanner;
public class ReplItStringArray {
    public static void main(String [] args) {

        Scanner input = new Scanner(System.in);
        String[] arr = new String[5];
        //leave above alone!  write your code below
        int size=arr.length;
        String [] names=new String [size];

        for (int i=0; i<size; i++) {

            names[i]=input.next();
        }
        for (int i=0; i<names.length; i++) {
            System.out.println(names[i].substring(0, 3));
        }






    }
}
