package pl.kurs.kwiecien.zad18;

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