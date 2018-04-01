package pl.kurs.marzec.kolekcje.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ZadSetParaMain {
    /*
    * 4 f. Utwórz klasę ParaLiczb (int a,int b)
     * i dodaj kilka instancji do zbioru:
            {(1,2), (2,1), (1,1), (1,2)}.
    g. Wyświetl wszystkie elementy zbioru na ekran.
     Czy program działa zgodnie z oczekiwaniem? */
    public static void main(String[] args) {
        ParaLiczb p1 = new ParaLiczb(1, 2);
        ParaLiczb p2 = new ParaLiczb(2, 1);
        ParaLiczb p3 = new ParaLiczb(1, 1);
        ParaLiczb p4 = new ParaLiczb(1, 2);

        Set<ParaLiczb> listaPary = new HashSet<>();
        listaPary.addAll(Arrays.asList(p1, p2, p3, p4));
        System.out.println(listaPary);
    }
}