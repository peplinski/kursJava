package pl.kurs.marzec.kolekcje.typyDanych.date.zadania;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Random;
import java.util.Scanner;

public class Zad7Czas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");



        boolean isWorking = true;

        while (isWorking) {
            //data urodzenia


            System.out.println("Podaj datę: yyyy-MM-dd");
            String wpisanaData = scanner.nextLine();
            LocalDate data = LocalDate.parse(wpisanaData, formatter2);

            LocalDate maxWiek=data.plusYears(100);

            //płeć
            System.out.println("Jesteś mezczyzną nacisnij: m .\n " +
                    "Jesteś kobietą naciśnik k. ");
            String plec = scanner.next();
            System.out.println("plec " + plec);


            if (plec.equals("m")){
                maxWiek = maxWiek.minusYears(10);
                System.out.println(maxWiek);
            }else if (plec.equals("k")){
                LocalDate wiekKobiety=maxWiek;
                System.out.println(maxWiek);
            }


            //fajki
            System.out.println("czy palisz papierosy t/n");
            String czyPalisz = scanner.next();
            if (czyPalisz.equals("t")){
                maxWiek = maxWiek.minusYears(9).minusMonths(3);
                System.out.println(maxWiek);
            }else if (czyPalisz.equals("n")){
                LocalDate niepalacy=maxWiek;
                System.out.println(maxWiek);
            }
            //stres
            System.out.println("Czy zyjesz w stresie? t/n");
            String stres = scanner.next();

            if (stres.equals("t")){
                Random generator = new Random();
                // maxWiek = maxWiek;
                System.out.println(maxWiek);
            }else if (stres.equals("n")){
                LocalDate niepalacy=maxWiek;
                System.out.println(maxWiek);
            }


            break;
        }
    }


}
