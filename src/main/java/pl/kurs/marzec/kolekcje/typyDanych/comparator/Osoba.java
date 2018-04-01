package pl.kurs.marzec.kolekcje.typyDanych.comparator;

public class Osoba {
    /*
    * 1.
Stwórz klasę Osoba (String imie, String nazwisko, int wiek),
 a następnie stwórz dla niego Comparator, który sortuje osoby po wieku.
W mainie stwórz kilka instancji klasy osoba i dodaj je do Listy.
 Po dodaniu posortuj listę i na ekran wypisz  wynik przed sortowaniem, oraz po sortowaniu*/

    private String imie;
    private String nazwisko;
    private int wiek;

    public Osoba(String imie, String nazwisko, int wiek) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    @Override
    public String toString() {
        return "Osoba{" +
                imie +" "+ nazwisko +" "+ wiek + '}';
    }
}
