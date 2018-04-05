package pl.kurs.kwiecien.strDanych.zad12.zad18;

public class Ksiazka {
   private String tytul;
   private double cena;

    public Ksiazka(String tytul, double cena) {
        this.tytul = tytul;
        this.cena = cena;
    }

    public String getTytul() {
        return tytul;
    }

    public double getCena() {
        return cena;
    }

    @Override
    public String toString() {
        return "Ksiazka{" +
                "tytul='" + tytul + '\'' +
                ", cena=" + cena +
                '}';
    }
}
