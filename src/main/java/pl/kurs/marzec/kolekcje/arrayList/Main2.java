package pl.kurs.marzec.kolekcje.arrayList;

import java.util.ArrayList;
import java.util.Random;

public class Main2 {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 5; i++) {
            int z = random.nextInt(99);
            integers.add(z);
        }
        System.out.println(integers);
    }
}
