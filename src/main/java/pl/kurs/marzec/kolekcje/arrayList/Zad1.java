package pl.kurs.marzec.kolekcje.arrayList;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Zad1 {
    public static void main(String[] args) {
        /*1.
Stwórz listę Integerów. Wykonaj zadania:
    - dodaj do listy 5 elementów ze scannera
    - dodaj do listy 5 elementów losowych
    - wypisz elementy
Sprawdź działanie aplikacji.
*/
        ArrayList<Integer> integers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);


        for (int i = 0; i < 5; i++) {
            int z = scanner.nextInt();
            integers.add(z);
        }
        System.out.println(integers);
    }

}

