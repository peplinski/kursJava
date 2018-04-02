package pl.kurs.marzec.hashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

 class HashMapKom {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>(); // default: 16, 0.75F
        Map<String, String> map2 = new HashMap<>(10, 0.5f); // capacity + factor

        map.put("key", "value"); // dodawanie elementu, klucz => wartość
        map.putAll(map2);

        boolean aa = map.containsKey("aa");// czy jest element o kluczu
        boolean cz = map.containsValue("cz");// czy jest element o takiej wartości

        Set<Map.Entry<String, String>> entries = map.entrySet();// zwraca nam wszystkie pary w mapie
        Set<String> keys = map.keySet();//zwraca nam Set wszystkich kluczy
        Collection<String> values = map.values();// zwraca nam listę wszystkich wartości

        map.remove("aaa"); // usuń element o danym kluczu
        map.remove("aaa", "bbb"); // usuń element o kluczu `aaa`, który ma wartość `bbb`

        map.putIfAbsent("www", "lll"); // dodaj element tylko jeżeli nie istnieje w mapie.
    }
}

