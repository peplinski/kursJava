package pl.kurs.marzec.kolekcje.typyDanych.date;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class PeriotMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*LocalDate teraz = LocalDate.now();
        LocalDate grunwald = LocalDate.of(1410,7,15);
        Period okres = Period.between(teraz,grunwald);

        System.out.println(okres.getYears());*/
//        LocalTime time = LocalTime.now();
//        Duration czasTrwania = Duration.between(time,grunwald);

//        Napisz aplikację, która wyświetli "różnicę" dwóch dat w formacie: "years: , months: , days: "
//        Wskazówka: skorzystaj z klasy Period:
//        Period period = Period.between(data_start, data_stop);
//        Napisz aplikację, która wyświetli "różnicę" dwóch PODANYCH PRZEZ UŻYTKOWNIKA dat w
// formacie: "years: , months: , days: "
//        Wskazówka: skorzystaj z DateTimeFormatter oraz metody stworzeniowej
// LocalDateTime.parse(ciag_znakow, formatter).


        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd.MM.yyyy");
//        LocalDate teraz = LocalDate.now();
////        LocalDate urodziny = LocalDate.of(1977,02,06);
////        Period okres = Period.between(urodziny,teraz);

        System.out.println("Wpisz 1 datę: ");
        String wpisanaData = sc.nextLine();
        System.out.println("Wpisz 2 datę: ");
        String drugaData = sc.nextLine();

        LocalDate data1 = LocalDate.parse(wpisanaData, formatter1);
        LocalDate data2 = LocalDate.parse(drugaData, formatter1);

        Period roznica = Period.between(data1, data2);
        System.out.println("Lat: " + roznica.getYears()+" miesięcy: "+roznica.getMonths()+" dni: "+roznica.getDays()+".");


    }
}
