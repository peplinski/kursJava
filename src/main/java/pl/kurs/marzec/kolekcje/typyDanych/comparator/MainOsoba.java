package pl.kurs.marzec.kolekcje.typyDanych.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainOsoba {
    public static void main(String[] args) {
        List<Osoba> osoby = new ArrayList<>();
        osoby.add(new Osoba("Marcin","Kowalski",124));
        osoby.add(new Osoba("Marek","Kowalski",42));
        osoby.add(new Osoba("Krzychu","Kowalski",29));
        osoby.add(new Osoba("Witek","Kowalski",92));
        osoby.add(new Osoba("Łukasz","Kowalski",52));
        osoby.add(new Osoba("Wojtek","nowak",33));
        osoby.add(new Osoba("Pawel","Kowal",12));

        ComperatorOsob comperatorOsob = new ComperatorOsob();

        System.out.println(osoby);
        Collections.sort(osoby,comperatorOsob);
        System.out.println(osoby);

    }

    public static class ComperatorOsob implements Comparator<Osoba>{

        @Override
        public int compare(Osoba o1, Osoba o2) {
            if (o1.getWiek()>o2.getWiek()){
                return -1;
            }else if(o1.getWiek()<o2.getWiek()){
                return 1;
            }
            return 0;
        }
    }

}
