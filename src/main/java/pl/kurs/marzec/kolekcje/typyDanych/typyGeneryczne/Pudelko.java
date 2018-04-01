package pl.kurs.marzec.kolekcje.typyDanych.typyGeneryczne;

public class Pudelko <T>{
    private T zawartosc;

    public Pudelko(T zawartosc) {
        this.zawartosc = zawartosc;
    }

    public T getZawartosc() {
        return zawartosc;
    }

    public void setZawartosc(T zawartosc) {
        this.zawartosc = zawartosc;
    }

    public boolean czyPudełkoJestPuste(){
        if (getZawartosc()!=null){
            System.out.println("Pełne");
            return false;
        }else {
            System.out.println("Puste");
        }
        return true;
    }
}
