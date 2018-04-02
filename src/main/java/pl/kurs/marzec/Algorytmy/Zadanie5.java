package pl.kurs.marzec.Algorytmy;

import java.util.Scanner;

public class Zadanie5 {
    public static void main(String[] args) {
        /*
        * Pobierz od użytkownika liczbę jako String
Pobierz pierwszą "cyfrę" i sprawdź czy taka sama jak ostatnia
Pobierz drugą "cyfrę" i  sprawdź czy taka sama jak druga od końca
Pobierz trzecia "cyfrę" i  sprawdź czy taka sama jak trzecia od końca
Pobierz czwarta "cyfrę" i  sprawdź czy taka sama jak czwarta od końca
Pobierz piąta "cyfrę" i  sprawdź czy taka sama jak piąta od końca
i tak dalej.
nie musimy przechodzic po wszystkich elementach tylko sprawdzamy polowe*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj słowo");
        String word = scanner.nextLine();

        isPalidrom(word);


    }

    public static void isPalidrom(String word) {

        for (int i = 0; i < word.length(); i++) {
            char first = word.charAt(i);
            char last = word.charAt(word.length() - 1 - i);
            if (first == last) {
                System.out.println("Jest palidromem");
                break;
            } else {
                System.out.println("Nie jest palidromem");
                break;
            }
        }
    }
}
