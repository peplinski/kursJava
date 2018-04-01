package pl.kurs.marzec.dziedziczenie.pojazdy;

public class Main {
    public static void main(String[] args) {
        Samochod audi = new Samochod("Audi","czerwony",2015);
        Kabriolet bmw = new Kabriolet("BMW","czarny",2005);

        audi.przyspiesz();
        audi.wlaczSwiatla();

        bmw.przyspiesz();
        bmw.schowajDach();

    }
}
