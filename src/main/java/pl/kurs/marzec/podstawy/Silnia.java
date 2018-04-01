package pl.kurs.marzec.podstawy;

import java.util.Scanner;

public class Silnia {
    /*
       Napisz program, który oblicza silnię dla zadanej liczby
       przez użytkownika (do n=12) korzystając z pętli while
       https://pl.wikipedia.org/wiki/Silnia
        */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę");
        int liczba = scanner.nextInt();
        int licznik=1;
        int suma=1;

        while (licznik !=liczba){
            licznik++;
            suma*=licznik;
        }
        System.out.println(suma);
    }
}
