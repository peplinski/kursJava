package pl.kurs.marzec.Algorytmy;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static Map<Character, String> words = new HashMap<>();
    static {
        words.put('a', "ala");
        words.put('b', "basia");
        words.put('c', "centymetr");
        words.put('d', "dziura");
        words.put('e', "efemeryda");
        words.put('f', "firanka");
        words.put('g', "granica");
        words.put('h', "himalaje");
        words.put('i', "igła");
        words.put('j', "java");
        words.put('k', "krzesło");
        words.put('l', "lampa");
        words.put('m', "matryca");
        words.put('n', "noga");
        words.put('o', "okno");
        words.put('p', "pająk");
        words.put('q', "quidith");
        words.put('r', "rakieta");
        words.put('s', "sam");
        words.put('t', "tynk");
        words.put('u', "ustawa");
        words.put('v', "version");
        words.put('w', "wzór");
        words.put('x', "xanth");
        words.put('y', "yc");
        words.put('z', "zaraz");
    }
    private void showIntegers1(int n, int m) {
        showIntegers3(n, m, ",", ".");
    }
    private void showIntegers2(int n, int m) {
        int a = n, b = m;
        if (n > m) {
            a = m;
            b = n;
        }
        showIntegers1(a, b);
    }
    private void showIntegers3(int a, int b, String glue, String suffix) {
        System.out.print(a);
        for (int i = a + 1; i <= b; i++) {
            System.out.print(glue + " ");
            System.out.print(i);
        }
        System.out.println(suffix);
    }
    private void showChars4(char a, char b) {
        for (char i = a; i < b; i++) {
            System.out.print(i);
            System.out.print(", ");
        }
        System.out.print(b);
    }
    private void showChars5(char a, char b) {
        for (char i = a; i < b; i++) {
            System.out.print(words.get(i));
            System.out.print(", ");
        }
        System.out.print(words.get(b));
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Pierwsza liczba: ");
        int n = s.nextInt();
        System.out.print("Druga liczba: ");
        int m = s.nextInt();
        s.nextLine();

        Main main = new Main();
        System.out.println("--- Zadanie 1 ---");
        main.showIntegers1(n, m);
        System.out.println("\n--- Zadanie 2 ---");
        main.showIntegers2(n, m);
        System.out.println("\n--- Zadanie 3 ---");
        System.out.print("Znak pomiędzy: ");
        String glue = s.nextLine();
        System.out.print("Znak kończący: ");
        String suffix = s.nextLine();
        main.showIntegers3(n, m, glue, suffix);
        System.out.println("\n--- Zadanie 4 ---");
        System.out.print("Podaj pierwszą literę: ");
        char first = s.nextLine().charAt(0);
        System.out.print("Podaj ostatnią literę: ");
        char last = s.nextLine().charAt(0);
        main.showChars4(first, last);
        System.out.println("\n--- Zadanie 5 ---");
        main.showChars5(first, last);
    }


}
/*
 * Pobierz od użytkownika n im - liczba początkowa i końcowa
 * Założenie: liczby oddzielone są przecinkiem, na końcu kropka.
 * pętle sprawdzamy czy aktualny element jest ostatni.
 * Jeżeli nie to wyświetl liczbę i przecinek. Jeżeli tak to wyświetl kropkę*/
