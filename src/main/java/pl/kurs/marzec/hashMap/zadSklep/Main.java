package pl.kurs.marzec.hashMap.zadSklep;

public class Main {
    public static void main(String[] args) {
        Sklep sklep = new Sklep();
        sklep.dodajProdukt("N","1234",1.99);
        sklep.dodajProdukt("M","2234",2.60);
        sklep.dodajProdukt("L","2244",4.50);
        sklep.dodajProdukt("K","2245",0.45);
        sklep.dodajProdukt("J","2246",0.57);
        sklep.dodajProdukt("I","1242",0.99);
        sklep.dodajProdukt("H","3333",5.99);
        sklep.dodajProdukt("G","2233",2.09);
        sklep.dodajProdukt("a","1636",1.88);
        sklep.dodajProdukt("B","3987",1.78);
        sklep.dodajProdukt("C","4553",1.22);
        sklep.dodajProdukt("D","1234",1.33);
        sklep.dodajProdukt("E","1544",1.44);
        sklep.dodajProdukt("F","1254",1.55);

        sklep.wyszukajProdukt("1234");
    }
}
