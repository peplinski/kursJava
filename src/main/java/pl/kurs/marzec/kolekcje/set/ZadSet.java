package pl.kurs.marzec.kolekcje.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ZadSet {
    /*Wykonaj polecenia:
    a. Umieść wszystkie elementy tablicy {10,12,10,3,4,12,12,300,12,40,55} w zbiorze (HashSet) oraz:
    b. Wypisz liczbę elementów na ekran (metoda size())
    c. Wypisz wszystkie zbioru elementy na ekran (forEach)
    d. Usuń elementy 10 i 12, wykonaj ponownie podpunkty a) i b)

    e. Napisz metodę sprawdzającą, czy w tekście nie powtarzają się litery z wykorzystaniem zbioru. (boolean containDuplicates(String text))
    f. Utwórz klasę ParaLiczb (int a,int b) i dodaj kilka instancji do zbioru:
            {(1,2), (2,1), (1,1), (1,2)}.
    g. Wyświetl wszystkie elementy zbioru na ekran. Czy program działa zgodnie z oczekiwaniem?
*/
    public static void main(String[] args) {
        Set<Integer> liczby = new HashSet<>();
        liczby.addAll(Arrays.asList(10,12,10,3,4,12,12,300,12,40,5));
        Set<Integer> intSet = new HashSet<>(liczby);

        System.out.println(liczby.size());

        for (Integer element:liczby) {
            System.out.println(element);
        }

//usun 10 i 12
        Integer[] tablica = new Integer[intSet.size()];

        tablica = intSet.toArray(tablica);
        for (Integer element: tablica) {
            if(element==10 || element==12){
                intSet.remove(element);
            }
        }

        System.out.println(intSet.size());
        for (Integer element:intSet) {
            System.out.println(element);
        }

    }
}

