package pl.kurs.marzec.kolekcje.typyDanych.date;


import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Data {
    protected int dzien;
    protected int miesiac;
    protected int rok;
    public Data(int dzien, int miesiac, int rok) {
        this.dzien = dzien;
        this.miesiac = miesiac;
        this.rok = rok;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isWorking=true;

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM uuuu");
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("d MMM yyyy");


        while (isWorking){
            String coWypisac = scanner.next();

            if (coWypisac.equals("date")){
                System.out.println(LocalDate.now());
            }else if (coWypisac.equals("time")){
                DateTimeFormatter form = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:ss");
                System.out.println(LocalDateTime.now().format(form));
            }
            break;
        }


    }

}

