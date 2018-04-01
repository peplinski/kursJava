package pl.kurs.marzec.podstawy;

import java.util.Scanner;

public class LiczbyParzyste {
    public static void main(String[] args) {

        System.out.print("Podaj liczbę (wprowadzenie znaku innego niż liczba całkowita zakończy działanie programu: ");
        Scanner scanner = new Scanner(System.in);
        int liczba;
        do {
            if (scanner.hasNextInt()) {
                liczba = scanner.nextInt();
                drukujParzystoscLiczb(liczba);
            } else {
                System.out.println("Podany znak nie jest liczbą całkowitą!");
            }
        } while (scanner.hasNextInt());
        System.out.println("Koniec!");
    }

    private static boolean czyLiczbaJestParzysta(int liczba) {
        return liczba % 2 == 0;
    }

    private static void drukujParzystoscLiczb(int liczba) {
        if (czyLiczbaJestParzysta(liczba)) {
            System.out.println("Liczba " + liczba + " jest parzysta");

        } else System.out.println("Liczba " + liczba + " jest nieparzysta");

    }
}
