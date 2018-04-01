package pl.kurs.marzec.kolekcje.set;

import java.util.*;

public class SetIterable {
    public static void main(String[] args) {
        List<String> elementy = Arrays.asList("slowo 1", "slowo 2", "slowo 3");
        Set<String> stringSet = new HashSet<>(elementy);
        Iterator<String> iterator = stringSet.iterator();
        // dopóki istnieje jakiś element w zbiorze
        while (iterator.hasNext()){
            // wyciągam element z iteratora
            // oraz przechodzę do następnego
            String element = iterator.next();
            System.out.println(element);
        }
    }
}
