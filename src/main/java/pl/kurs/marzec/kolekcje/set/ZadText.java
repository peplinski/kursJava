package pl.kurs.marzec.kolekcje.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ZadText {
    /*
     * e. Napisz metodę sprawdzającą, czy w tekście nie powtarzają się litery z wykorzystaniem zbioru.
     * (boolean containDuplicates(String text))
     */
    public static void main(String[] args) {
    }

    public static boolean czyZawieraDuplikaty(String slowo) {
        // odfiltrować / usunąć wszystkie spacje
        slowo = slowo.replaceAll(" ", "");
        // zmieniamy na same małe litery
//        slowo = slowo.toLowerCase();
        String[] litery = slowo.split("");
        Set<String> zbior = new HashSet<>(Arrays.asList(litery));
        // weryfikujemy czy przed dodaniem liter do zbioru i po ich dodaniu
        // mamy dalej tak samo wielkie zbiory
        // czy tablica jest tego samego rozmiaru co zbiór
        return zbior.size() == litery.length;
    }

}

