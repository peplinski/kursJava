package pl.kurs.marzec.hashMap.zadSklep;

import lombok.Getter;

@Getter
public class Towar {
    private String nazwa;
    private String kodKreskowy;
    private double cena;

    public Towar(String nazwa, String kodKreskowy, double cena) {
        this.nazwa = nazwa;
        this.kodKreskowy = kodKreskowy;
        this.cena = cena;
    }

    @Override
    public String toString() {
        return "Towar{" +
                "nazwa='" + nazwa + '\'' +
                ", kodKreskowy='" + kodKreskowy + '\'' +
                ", cena=" + cena +
                '}';
    }
}

