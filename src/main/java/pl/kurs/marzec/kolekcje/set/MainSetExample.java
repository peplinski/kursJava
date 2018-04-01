package pl.kurs.marzec.kolekcje.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MainSetExample {
    /*1. Stwórz aplikację a w niej Zbiór (Set) słów (String).
   - dodaj kilka słów ze scannera do zbioru.
   - spróbuj dodać drugi raz taki sam string (czy uda się dodać obiekt?)
   - dodaj do zbioru obiekt null (2 razy)
   - wypisz zbiór (czy obiekt null występuje w zbiorze? ile razy?)
   */
    public static void main(String[] args) {
//        List<Integer> integers = new ArrayList<>();
//        Scanner scanner = new Scanner(System.in);
//        String linia = scanner.nextLine().toLowerCase();
//        String[] słowa = linia.split(" ");
        List<String> slowa = Arrays.asList("abc", "def", "gha", "abc", "ABC", "cba", "bca");
        Set<String> strings = new HashSet<>(slowa);
//        for (String slowo : słowa) {
//            strings.add(slowo);
//        }
        System.out.println(strings);
        for (String slowo : strings) {
            System.out.println(slowo);
        }
        if (slowa.size() == strings.size()) {
            System.out.println("Brak duplikatów");
        } else {
            System.out.println("Ilość słów usuniętych: " + (slowa.size() - strings.size()));
        }
    }
}

