package pl.kurs.kwiecien.zad18;


import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
class Author {
    String id;
    String name;
    String surname;

    List<Book> ksiazki = new ArrayList<>();

    public Author(String id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public List<Book> getKsiazki() {
        return ksiazki;
    }
    public boolean isPolular(){
        if (ksiazki.size()<5){
            return false;
        }
            return true;
    }

    @Override
    public String toString() {
        return "Author: " + id  +
                ", name: " + name  +
                ", surname: " + surname +
                ", ksiazki: " + ksiazki +"\n";
     }
}