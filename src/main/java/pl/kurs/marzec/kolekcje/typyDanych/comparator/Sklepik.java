package pl.kurs.marzec.kolekcje.typyDanych.comparator;

public class Sklepik {
    private String nazwaProduktu;
    private int cena;

    public Sklepik(String nazwaProduktu, int cena) {
        this.nazwaProduktu = nazwaProduktu;
        this.cena = cena;
    }

    public String getNazwaProduktu() {
        return nazwaProduktu;
    }

    public void setNazwaProduktu(String nazwaProduktu) {
        this.nazwaProduktu = nazwaProduktu;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    @Override
    public String toString() {
        return "Sklepik{" +
                "nazwaProduktu='" + nazwaProduktu + '\'' +
                ", cena=" + cena +
                '}';
    }
}
