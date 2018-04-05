package pl.kurs.kwiecien.strDanych.zad12;

public class Book {
    String title;
    String price;

    public Book(String title, String price) {
        this.title = title;
        this.price = price;
    }

    @Override
    public String toString() {
        return "\n title: " + title +
                ", price: " + price ;
    }
}