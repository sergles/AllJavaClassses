package com.syntax.class20;

public class Book {

    String title;
    int pages;
    char bestseller;
    String author;
    Book(String title, String author, int pages){
        this.title=title;
        this.author=author;
        this.pages=pages;
    }
    Book(String title, String author, int pages,char bestseller){
        this(title, author, pages);
        this.bestseller=bestseller;
    }
    void Print(){
        System.out.println(title+" by "+author+" has "+pages+" pages "+bestseller);
    }
    public static void main(String[] args) {
        Book book1=new Book("Moby Dick","Herman Menville",400);
        Book book2=new Book("About me","Serg Les",33,'Y');
        book1.Print();
        book2.Print();
    }





}
