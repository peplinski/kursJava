package pl.kurs.marzec.kolekcje.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Metoda generyczna i statyczna która jako parametr przyjmuje Varargs T. Wynikiem metody jest :
 * a) Lista
 * b) Zbiór
 * zawierający wszystkie te elementy.
 * List<String> list = Arrays.asList("awdawd", "awawd" , "awdawd");
 */
public class MainVarArgsSet {
    public static void main(String[] args) {
        List<Double> strings = dodajDoListy();
    }

    public static <T> List<T> dodajDoListy(T... elementy) {
        List<T> lista = new ArrayList<>();
        for (T element : elementy) {
            lista.add(element);
        }
        return lista;
    }

    public static <T> Set<T> dodajDoZbioru(T... elementy) {
        Set<T> zbiór = new HashSet<>();
        for (T element : elementy) {
            zbiór.add(element);
        }
        return zbiór;

    }
}

