package com.company;

public class Book {

    private String title;
    private String author;
    private String yearPub;
    private String isbnNumber;
    private String image;
    private String option1;
    private String option2;

    public Book() {

    }
    public Book(String title, String author, String yearPub) {
        this.title = title;
        this.author = author;
        this.yearPub = yearPub;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getYearPub() {
        return yearPub;
    }

    public void setYearPub(String yearPub) {
        this.yearPub = yearPub;
    }

    public String getIsbnNumber() {
        return isbnNumber;
    }

    public void setIsbnNumber(String isbnNumber) {
        this.isbnNumber = isbnNumber;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}