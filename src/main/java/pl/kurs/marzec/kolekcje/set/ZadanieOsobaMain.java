package pl.kurs.marzec.kolekcje.set;

import java.util.*;

public class ZadanieOsobaMain {
    /*
    * Stwórz klasę Osoba która posiada imie, nazwisko i wiek.
Stwórz kilka instancji klasy osoba i dodaj je do zbioru.
Iteruj zbiór posługując się Iterator'em.
*Spróbuj usunąć ze zbioru osoby których wiek jest niższy niż 18 lat.
* */
    public static void main(String[] args) {

        Osoba ojciec = new Osoba("Michał","Kowalski",44);
        Osoba syn = new Osoba("Wojtek","Kowalczyk",20);
        Osoba dziecko = new Osoba("Jakub","Nowak",16);


        List<Osoba> listaOsob =  Arrays.asList(ojciec, syn, dziecko);
        Set<Osoba> stringSet =new HashSet<>(listaOsob);
        Iterator<Osoba> iterator = stringSet.iterator();

        Osoba[] tablica = new Osoba[stringSet.size()];//kopia
        tablica = stringSet.toArray(tablica);           //tablicy

        /*while (iterator.hasNext()){
            Osoba element = iterator.next();
            System.out.println(element);

            if (element.getWiek()<18){
                iterator.remove();
            }
        }
        System.out.println(stringSet);*/

        for (Osoba element:tablica) {
            if (element.getWiek()<18){
                stringSet.remove(element);
            }
        }
        System.out.println(stringSet);



    }
}

