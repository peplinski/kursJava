package pl.kurs.marzec.kolekcje.typyDanych.typyGeneryczne;

class ExtednNumber<T extends Number> {
    private int liczba1;
    private int liczba2;

    public ExtednNumber(int liczba1, int liczba2) {
        this.liczba1 = liczba1;
        this.liczba2 = liczba2;
    }
}
