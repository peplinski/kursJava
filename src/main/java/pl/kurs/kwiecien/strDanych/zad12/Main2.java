package pl.kurs.kwiecien.strDanych.zad12;


import java.util.*;

public class Main2 {
    public static List<Map<String, String>> pobierzAutorow() {
        List<Map<String, String>> autorzy = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Map<String, String> map = new HashMap<>();
            map.put("id", "ID_" + i);
            map.put("imie", "imie " + i);
            map.put("nazwisko", "nazwisko " + i);
            autorzy.add(map);
        }
        return autorzy;
    }
    public static List<Map<String, String>> pobierzKsiazki() {
        List<Map<String, String>> ksiazki = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 20; i++) {
            Map<String, String> map = new HashMap<>();
            map.put("tytul", "tutul" + i);
            map.put("cena", "" + rand.nextInt(999));
            map.put("autor", "ID_" + rand.nextInt(5));
            ksiazki.add(map);
        }
        return ksiazki;
    }
}
