package com.company;
import java.util.Scanner;
import java.util.ArrayList;


public class Main {



    public static void main(String[] args) {
        //create ArrayList to keep all books
        ArrayList<String> bookList = new ArrayList<>();

        //create a Scanner object to let user make an input
        Scanner s = new Scanner(System.in);




        System.out.println("Welcome to Library!");
        System.out.println("What do you wish to do? add the book, borrow the book, or return the book");
        String answer = s.nextLine();


        //if user picks to add book
        if(answer.equalsIgnoreCase("add")){
            bookList.add(addNewbook());




        }



	// write your code here
    }
    //create method to add the book to the library
    public static Book addNewbook(String title, String author, String yearPub, String isbnNumber, String image) {

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
        bookList



    }
}
