package com.company;
import java.util.Scanner;
import java.util.ArrayList;


public class Main {



    public static void main(String[] args) {
        //create ArrayList to keep all books
        ArrayList<Book> bookList = new ArrayList<>();
        //create an object to keep info about book
        Book item = new Book("Red Hat", "Perrault", "1950", "12345", "picture");
        bookList.add(item);
        Book item2 = new Book("Three piglets", "folklor", "1960", "123423", "picture");
        bookList.add(item2);
        Book item3 = new Book("Snow quin", "Andersen", "1945", "123234", "image");
        bookList.add(item3);


        System.out.println("Welcome to Library!");
        System.out.println("What do you wish to do? check the List, add the book, borrow the book, or return the book");

        //create a Scanner object to let user make an input
        Scanner s = new Scanner(System.in);
        String answer = s.nextLine();



        //if user picks to add book
        if(answer.equalsIgnoreCase("add")){

            bookList.add(addNewbook());
            System.out.println("Title" + "\t\t\t\t\t" + "Author" + "\t\t\t\t\t" + "Year of Publication" + "\t\t\t\t\t" + "ISBN Number");
            for (Book eachBook: bookList) {
                System.out.println( eachBook.getTitle() + "\t\t\t" + eachBook.getAuthor() + "\t\t\t" + eachBook.getYearPub() + "\t\t\t" + eachBook.getIsbnNumber());
            }




        } else if (answer.equalsIgnoreCase("list")) {
            System.out.println("Title" + "\t\t\t\t\t" + "Author" + "\t\t\t\t\t" + "Year of Publication" + "\t\t\t\t\t" + "ISBN Number");

            for (Book eachBook: bookList) {
                System.out.println( eachBook.getTitle() + "\t\t" + eachBook.getAuthor() + "\t\t\t" + eachBook.getYearPub() + "\t\t\t" + eachBook.getIsbnNumber());
            }

        }else if (answer.equalsIgnoreCase("borrow")) {
            System.out.println("Pick the book");
            System.out.println("Title" + "\t\t\t\t\t" + "Author" + "\t\t\t\t\t" + "Year of Publication" + "\t\t\t\t\t" + "ISBN Number");
            for (Book eachBook: bookList) {
                System.out.println( eachBook.getTitle() + "\t\t\t" + eachBook.getAuthor() + "\t\t\t" + eachBook.getYearPub() + "\t\t\t" + eachBook.getIsbnNumber());
            }


            }




        }




	// write your code here

    //create method to add the book to the library
    public static Book addNewbook() {

        //create an object book to keep all info about each book
        Book newBook = new Book();
        //create a Scanner object to let user make an input
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the book title");
        String bookName = s.nextLine();
        newBook.setTitle(bookName);git

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
