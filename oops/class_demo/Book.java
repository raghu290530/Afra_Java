package oops.class_demo;

import java.util.Scanner;

public class Book {
    String title;
    int pages;
    Book(String title,int pages){
        this.title = title;
        this.pages = pages;
    }
    public void printMessage(){
        System.out.println(this.title + " has " + this.pages + " pages.");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book b1 = new Book(sc.nextLine(), sc.nextInt());
        sc.nextLine();
        Book b2 = new Book(sc.nextLine(), sc.nextInt());
        b1.printMessage();
        b2.printMessage();
    }
}
