package com.syntax.class16;

import java.util.Arrays;

public class ReverseWords {
    public static void main (String [] args){

        String str = "Welcome to java Artem";
        String words[] = str.split(" ");
        String reversedString = "";
        for (int i = 0; i < words.length; i++) {
            reversedString = " " + words[i] + reversedString;
        }
        System.out.print("Reversed string word by word: ");
        System.out.println(reversedString);


String sentence = "Wht did u use the most?";
String [] stringArray = sentence.split(" ");
System.out.println(Arrays.toString(stringArray));

for (int i=0; i<stringArray.length; i++){
    StringBuilder stringBuilder = new StringBuilder(stringArray[i]);
}
System.out.println(Arrays.toString(stringArray));








    }
}
