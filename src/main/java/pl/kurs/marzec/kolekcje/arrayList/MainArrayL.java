package pl.kurs.marzec.kolekcje.arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainArrayL {
    public static void main(String[] args) {
        List<String> lista2 = new ArrayList<>();
        lista2.addAll(Arrays.asList("10030", "3004", "4000", "12355", "12222", "67888", "111200", "225355", "2222", "1111", "3546", "138751", "235912"));
        System.out.println(lista2.indexOf("138751"));
        System.out.println(lista2.contains("67889"));
        lista2.remove("67888");
        lista2.remove("67889");
        System.out.println(lista2.contains("67888"));
        System.out.println(lista2.contains("67889"));
        System.out.println(lista2);
        for (int i = 0; i < lista2.size(); i++) {
            System.out.println(lista2.get(i));
        }

    }
}
