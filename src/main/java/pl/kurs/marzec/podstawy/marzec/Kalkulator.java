package pl.kurs.marzec.podstawy.marzec;

import java.util.Scanner;

public class Kalkulator {
    public Kalkulator() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            while(true) {
                System.out.println("Podaj opcję: ");
                System.out.println("1 - Dodawanie");
                System.out.println("2 - Odejmowanie");
                System.out.println("3 - Mnożenie");
                System.out.println("4 - Dzielenie");
                System.out.println("5 - Modulo");
                System.out.println("6 - Wyjście");
                int opcja = scanner.nextInt();
                if (opcja <= 6 && opcja >= 1) {
                    if (opcja == 6) {
                        return;
                    }

                    System.out.print("Podaj pierwszą liczbe: ");
                    int liczba1 = scanner.nextInt();
                    System.out.print("Podaj drugą liczbe: ");
                    int liczba2 = scanner.nextInt();
                    int wynik = oblicz(opcja, liczba1, liczba2);
                    System.out.println(String.format("Wynik %d dla liczb %d i %d wynosi %d", opcja, liczba1, liczba2, wynik));
                } else {
                    System.out.println("Niepoprawne działanie\nSpróbuj jeszcze raz");
                }
            }
        }
    }

    private static int oblicz(int opcja, int liczba1, int liczba2) {
        switch(opcja) {
            case 1:
                return liczba1 + liczba2;
            case 2:
                return liczba1 - liczba2;
            case 3:
                return liczba1 * liczba2;
            case 4:
                return liczba1 / liczba2;
            case 5:
                return liczba1 % liczba2;
            default:
                return 0;
        }
    }
}
