package pl.kurs.marzec.kolekcje.arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Zad5Main {
    public static void main(String[] args) {
        List<Integer> losoweLiczby = new ArrayList<>();
        Random random = new Random();
        int e;

        for (int i = 0; i < 99; i++) {
            e = random.nextInt(50);
            losoweLiczby.add(e);
        }
        System.out.println(losoweLiczby);
        //srednia
        int suma = 0;
        for (int i = 0; i < losoweLiczby.size(); i++) {
            suma += losoweLiczby.get(i);
        }
        double srednia = suma / losoweLiczby.size();
        System.out.println(srednia);


    }
}

