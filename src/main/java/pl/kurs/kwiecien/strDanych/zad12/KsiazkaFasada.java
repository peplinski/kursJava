package pl.kurs.kwiecien.strDanych.zad12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

 class KsiazkiFasada {

    public static List<Map<String, String>> pobierzKsiazki() {
        List<Map<String, String>> ksiazki = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 20; i++) {
            Map<String, String> map = new HashMap<>();
            map.put(BOOKS_KEYS.TITLE.getValue(), "tytul" + i);
            map.put(BOOKS_KEYS.CENA.getValue(), "" + rand.nextInt(999));
            map.put(BOOKS_KEYS.AUTHOR.getValue(), "ID_" + rand.nextInt(5));
            ksiazki.add(map);
        }

        return ksiazki;
    }


    enum BOOKS_KEYS {
        TITLE("tytul"), CENA("cena"), AUTHOR("autor");
        String value;

        public String getValue() {
            return value;
        }

        BOOKS_KEYS(String v) {
            value = v;
        }
    }


    public KsiazkiFasada() {
    }

}
