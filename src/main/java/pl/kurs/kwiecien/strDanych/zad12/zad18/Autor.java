package pl.kurs.kwiecien.strDanych.zad12.zad18;

public class Autor {
    private int id;
    private String imie;
    private String nazwisko;
    private String ksiazki;

    public Autor(int id, String imie, String nazwisko, String ksiazki) {
        this.id = id;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.ksiazki = ksiazki;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getKsiazki() {
        return ksiazki;
    }

    public void setKsiazki(String ksiazki) {
        this.ksiazki = ksiazki;
    }
}
