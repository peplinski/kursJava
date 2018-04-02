package pl.kurs.marzec.hashMap.zadSklep;

import java.util.HashMap;
import java.util.Map;

public class Sklep {
    /*
    * Stwórz aplikację a w niej klasę Sklep.
W sklepie mamy produkty identyfikowane po kodach kreskowych.
Stwórz w sklepie metodę dodawania produktu do sklepu po numerze kreskowym (wraz z opisem i ceną)
Stwórz metodę w sklepie do wyszukiwania produktów (opisu i ceny) po kodzie kreskowym.*/
    private Map<String, Towar> produkty = new HashMap<>();

    public Sklep() {
    }

    public void dodajProdukt(String nazwa, String kodKreskowy, double cena) {
        Towar towar = new Towar(nazwa,kodKreskowy, cena);
        produkty.put(kodKreskowy, towar);

    }

    public void wyszukajProdukt(String kodKreskowy) {
        if (produkty.containsKey(kodKreskowy)) {
            Towar towar = produkty.get(kodKreskowy);
            System.out.println(towar.toString());

        }else{
            System.out.println("Nie ma produktu w bazie danych");
        }

    }
}
