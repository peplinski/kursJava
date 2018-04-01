package pl.kurs.marzec.kolekcje.arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Zad2 {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        Random random = new Random();
        int z;
        double suma = 0.0;
        for (int i = 0; i < 11; i++) {
//            z = random.nextInt(99);
//            integers.add(z);
            integers.add(i);
        }
        ArrayList<Integer> list = new ArrayList<>();

//        integers.add(123);
        System.out.println(integers);
        for (int i = 0; i < integers.size(); i++) {
            suma += integers.get(i);
        }
        System.out.println(suma);

        Collections.sort(integers);
        System.out.println(integers);
        double srednia = 0;
        srednia = suma / integers.size();
        System.out.println(srednia);

        //podaj mediane
        //    - podaj medianę elementów na liście (wypisz ją)
        ArrayList<Integer> kopia = new ArrayList<>(list);
        Collections.sort(kopia); // kopia jest posortowana, list nie

        if (kopia.size() % 2 == 0) {
            // parzystych rozmiarów
            int indexSrodkowego1 = kopia.size() / 2;
            int indexSrodkowego2 = kopia.size() / 2 - 1;

            double mediana = kopia.get(indexSrodkowego1) + kopia.get(indexSrodkowego2);
            mediana /= 2.0;
            System.out.println("Mediana: " + mediana);

        } else {
            // nieparzysty
            int indexSrodkowego = kopia.size();
            double mediana = kopia.get(indexSrodkowego);
            System.out.println("Mediana: " + mediana);
        }

        //    - znajdź największy oraz najmniejszy element na liście (znajdź go pętlą for, a następnie określ index posługując się metodą indexOf)

        Integer min = list.get(0);   /// 1 2 3 4 5 6 7
        Integer max = list.get(0);  ///
        for (Integer element : list) {

            // szukam najmniejszej wartosci
            if (min > element) {
                min = element;
            }
            // szukam najwiekszej wartosci
            if (max < element) {
                max = element;
            }
        }

        System.out.println("index min: " + list.indexOf(min));
        System.out.println("index max: " + list.indexOf(max));

        // znajdź największy oraz najmniejszy element na liście (znajdź go posługując się pętlą for) - wypisz indeks elementu
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == min) {
                System.out.println("index min: " + i);
            }
            if (list.get(i) == max) {
                System.out.println("index max: " + i);
            }
        }
    }
}

