package com.company;

public class Book {

    private String title;
    private String author;
    private String yearPub;
    private String isbnNumber;
    private String image;
    private boolean isBorrowed;

    public Book() {

    }

    public Book(String title, String author, String yearPub, String isbnNumber, String image) {
        this.title = title;
        this.author = author;
        this.yearPub = yearPub;
        this.isbnNumber = isbnNumber;
        this.image = image;

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

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }

    @Override
    public String toString() {
        String avail = isBorrowed() ? "borrowed" : "available";
        return getTitle() + "\t\t" + getAuthor() + "\t\t\t" + getYearPub() + "\t\t\t" + getIsbnNumber() + "\t\t\t" + avail;
    }
}
