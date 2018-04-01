package pl.kurs.marzec.kolekcje.arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayInstrukcja {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        List<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(1, 2, 3, 4, 5, 6));
        System.out.println(list1);
        list1.add(7);
        System.out.println(list1);
    }
}
