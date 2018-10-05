package com.company;

import java.util.Scanner;
import java.util.ArrayList;


public class Main {


    public static void main(String[] args) {
        //create ArrayList to keep all books
        ArrayList<Book> bookList = new ArrayList<>();
        //create an object to keep info about book
        bookList.add(new Book("Red Hat", "Perrault", "1950", "12345", "picture"));
        bookList.add(new Book("Three piglets", "folk", "1960", "123423", "picture"));
        bookList.add(new Book("Snow queen", "Andersen", "1945", "123234", "image"));

        System.out.println("Welcome to Library!");
        System.out.println("What do you wish to do? check the List, add the book, borrow the book, or return the book");

        while(true) {
            //create a Scanner object to let user make an input
            Scanner s = new Scanner(System.in);
            String answer = s.nextLine();

            //if user picks to add book
            if (answer.equalsIgnoreCase("add")) {
                cmdAdd(bookList);
                cmdList(bookList);
            } else if (answer.equalsIgnoreCase("list")) {
                cmdList(bookList);
            } else if (answer.equalsIgnoreCase("borrow")) {
                cmdBorrow(bookList);
                cmdList(bookList);
            } else if (answer.equalsIgnoreCase("return")) {
                cmdReturn(bookList);
                cmdList(bookList);
            } else if (answer.equalsIgnoreCase("exit")) {
                break;
            }
        }
    }

    public static void cmdList(ArrayList<Book> bookList) {
        System.out.println("Title" + "\t\t\t\t\t" + "Author" + "\t\t\t\t\t" + "Year of Publication" + "\t\t\t\t\t" + "ISBN Number");
        for (Book eachBook : bookList) {
            System.out.println(eachBook);
        }
    }

    public static void cmdAdd(ArrayList<Book> bookList) {
        bookList.add(addNewBook());
    }

    public static void cmdBorrow(ArrayList<Book> bookList) {
        System.out.println("Pick the book");
        System.out.println("Title" + "\t\t\t\t\t" + "Author" + "\t\t\t\t\t" + "Year of Publication" + "\t\t\t\t\t" + "ISBN Number");
        for (int i = 0; i < bookList.size(); i++) {
            Book eachBook = bookList.get(i);
            System.out.println((i + 1) + ". " + eachBook.toString());
        }

        int idx = new Scanner(System.in).nextInt();
        Book selected = bookList.get(idx - 1);
        selected.setBorrowed(true);
    }

    public static void cmdReturn(ArrayList<Book> bookList) {
        System.out.println("Pick the book");
        System.out.println("Title" + "\t\t\t\t\t" + "Author" + "\t\t\t\t\t" + "Year of Publication" + "\t\t\t\t\t" + "ISBN Number");
        for (int i = 0; i < bookList.size(); i++) {
            Book eachBook = bookList.get(i);
            System.out.println((i + 1) + ". " + eachBook.toString());
        }

        int idx = new Scanner(System.in).nextInt();
        Book selected = bookList.get(idx - 1);
        selected.setBorrowed(false);
    }

    //create method to add the book to the library
    public static Book addNewBook() {
        //create an object book to keep all info about each book
        Book newBook = new Book();
        //create a Scanner object to let user make an input
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the book title");
        String bookName = s.nextLine();
        newBook.setTitle(bookName);

        System.out.println("Enter the author");
        String nameAuthor = s.nextLine();
        newBook.setAuthor(nameAuthor);

        System.out.println("Enter the year of publication");
        String yearOfpub = s.nextLine();
        newBook.setYearPub(yearOfpub);

        System.out.println("Enter ISBN number. Optional");
        String isbnn = s.nextLine();
        newBook.setIsbnNumber(isbnn);

        System.out.println("Enter the image. Optional");
        String bookimage = s.nextLine();
        newBook.setImage(bookimage);

        return newBook;


    }


}
