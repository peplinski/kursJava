package pl.kurs.marzec.dziedziczenie.osoby;


public class Main {
    public static void main(String[] args) {
        Student jan = new Student("Jan","Kowalski",22,12345);

        jan.przedstawSie();
        final Osoba paulina = new Osoba("Paulina","Nowacka",23);
        paulina.przedstawSie();
        //   zmieniono na finalna     paulina.imie = "Anna";
        paulina.przedstawSie();

        Osoba beata = new Osoba("Beata","Tapińska",24);

        Student jacek = new Student("Jacek","Nowak",25,12345);
        System.out.println(jan.equals(jacek));
        beata = paulina;
        // finalna paulina = beata;
    }
}