package pl.kurs.marzec.kolekcje.typyDanych.date.zadania;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Zad6Czas {
    /*Napisz aplikację, ktora po podaniu przez użytkownika miasta, wypisuje obecną datę i godzinę w wybranym mieście.
   Miasta: Warszawa, Paryż, Whitehorse, Moskwa, Canberra, Sosnowiec.
   Wykorzystaj "ZoneId".
*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj Miasto: ");
        String wpisanyText = sc.nextLine();
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd.MM.yyyy  HH.mm");

        LocalDateTime miasto = LocalDateTime.parse(wpisanyText,formatter1);

        LocalDateTime teraz = LocalDateTime.now(ZoneId.of(String.valueOf(miasto)));
    }
}
