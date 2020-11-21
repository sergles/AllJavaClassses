package com.syntax.class17;

public class task3 {



  char getGrade(int marks){
      char grade;
      if (marks>90 && marks<=100){
          grade = 'A';
      }else if (marks > 80) {
          grade = 'B';
      }else if (marks>70){
          grade = 'C';
      }else if (marks>60){
          grade = 'D';
      }else {
          grade = 'F';
      }
      return grade;
        }


  //    public static void main (String[] args){
   //  Task3 task3 = new Task3();
    //  System.out.println(" task3.getGrade(90) "+ task3.getGrade(marks 90));
    //  System.out.println(" task3.getGrade(101) "+ task3.getGrade(marks 101));
    //  System.out.println(" task3.getGrade(40) "+ task3.getGrade(marks 40));
    /// System.out.println(" task3.getGrade(-1) "+ task3.getGrade(marks -1));


  }

