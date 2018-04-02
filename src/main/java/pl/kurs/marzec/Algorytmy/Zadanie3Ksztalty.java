package pl.kurs.marzec.Algorytmy;

import java.io.IOException;
import java.util.Scanner;

class Zadanie3Kształty {

    public static void main(String[] args) throws IOException {
        start();

    }

    public static void start() throws IOException {
        Scanner scanner = new Scanner(System.in);
        int wybor = menu();
        int a = 0;
        while (wybor != 0) {

            if (wybor >= 1 && wybor <= 3) {
                System.out.println("Podaj obwód: ");
                a = scanner.nextInt();
            } else {
                System.out.println("Niepoprawny wybór. Wybierz od 1 do 3\n");
                menu();
            }
            switch (wybor) {
                case 1:
                    dlugoscBokuKwadratu(a);
                    break;
                case 2:
                    dlugoscBokuTrojkata(a);
                    break;
                case 3:
                    promienKoła(a);
                    break;
                default:
            }

            System.out.println("\n Wciśnij Enter, aby kontynuować...");
            System.in.read();
            wybor = menu();
        }
    }


    //********* Menu***************
    public static int menu() {
        System.out.println("1. Oblicz długość boku kwadratu");
        System.out.println("2. Oblicz długość boku trójkąta");
        System.out.println("3. Oblicz promien koła");
        System.out.println("0. Koniec");

        Scanner sc = new Scanner(System.in);
        int wybor = sc.nextInt();
        return wybor;
    }

    //********** Logika******************
    /*start 1 bok kwadratu
     * wpisz wielkość pola i przypisz do zmiennej P.
     * zainicjuj zmienną boku kwadratu double a,
     * wzor na pole kwadratu P=ax2
     * musimy otrzymać pierwiastek z wielkości pola
     * kozystamy z biblioteki Math.sqrt()i przypisujemy zmienną a
     * zapisujemy wynik do zmiennej int bok.
     * wypisujemy wynik w konsoli
     * koniec*/
    public static void dlugoscBokuKwadratu(int a) {
        double bok = (int) Math.sqrt(a);
        //System.out.println(bok);
        System.out.println("Długość boku kwadratu wynosi: " + String.format("%.2f", bok));
    }

    /* start bok trójkąta
     * Podaj powierzchnię pola double P.
     * pole to : (Math.sqrt(3)/4)*(bok*bok)"
     * pole trójkąta trzeba podzielić na 3
     * i zapisać do zmiennej double bok,
     * wyswietlić wynik
     *  */
    public static void dlugoscBokuTrojkata(double a) {
        double bok = ((4 * a * Math.sqrt(3)) / 3);
        // return bok;
        System.out.println("Bok trójkąta wynosi: " + String.format("%.2f", bok));
    }

    /*promien koła
    1. Wzrór na pole koła to P=PI*rx2.
    Pod wartości które są znane podstawiam zmienne(liczby).
    Pod pole P podstawiamy zmienną z którj chcemy obliczyć pole, Pi jest stałą 3.14.
    Zostaje do policzenia promień, wiec Pi po obu stronach się skraca i zostaje
    rx2=pole i kwadret zamieniam na pierwiastek i zosta do obliczenia pierwiastek z pola.

    utworzenie zmiennej
    wczytanie zmiennej
    promień to pierwiastek z obwodu
    tworzymy zmienną promien i przypisujemy wynik
    wyswietlamy wynik
    * */
    public static void promienKoła(double a) {
        double promien = Math.sqrt(a / Math.PI);
        System.out.println("Promien koła wynosi: " + String.format("%.2f", promien));
    }
}

