package pl.kurs.marzec.interfejsy.zadania;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcja, x, y, wynik;
        do {
            System.out.println("Podaj opcję: ");
            System.out.println("1 - Dodawanie");
            System.out.println("2 - Odejmowanie");
            System.out.println("3 - Mnożenie");
            System.out.println("4 - Dzielenie");
            System.out.println("5 - Modulo");
            System.out.println("6 - Wyjście");

            opcja = scanner.nextInt();

            if (opcja > 6 || opcja < 1) {
                System.out.println("Niepoprawne działanie\nSpróbuj jeszcze raz");
                continue;
            } else if (opcja == 6) {
                return;
            }

            System.out.print("Podaj pierwszą liczbe: ");
            x = scanner.nextInt();
            System.out.print("Podaj drugą liczbe: ");
            y = scanner.nextInt();
            wynik = oblicz(opcja, x, y);
            System.out.println(String.format("Wynik %d dla liczb %d i %d wynosi %d",
                    opcja, x, y, wynik));


        } while (true);
    }

    private static int oblicz(int opcja, int liczba1, int liczba2) {
        switch (opcja) {
            case 1:

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


