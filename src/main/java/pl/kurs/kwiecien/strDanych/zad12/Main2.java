package pl.kurs.kwiecien.strDanych.zad12;

import java.util.List;

public class Main2 {

    public static void main(String[] args) {
        List<Author>authors = new Biblioteka().getAuthors();
        for (Author a:authors){
            System.out.println("("+ a.getId()+")"+a.getSurname());
            if (a.isPolular()){
                System.out.println("*");
            }else {
                System.out.println(" ");
            }
            System.out.println(a.getSurname());
        }

     //   System.out.println(new Biblioteka().getAuthors());
    }
}