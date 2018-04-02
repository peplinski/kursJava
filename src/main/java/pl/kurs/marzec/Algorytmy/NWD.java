package pl.kurs.marzec.Algorytmy;

import sun.applet.Main;
public class NWD {


        /*
        * Algorytm Euklidesa
Mając dane dwie liczby naturalne a i b znaleźć ich największy wspólny dzielnik.
1. Przedstaw opis słowny problemu
2. Przedstaw schemat blokowy
3. Zaimplementuj algorytm.
Rozwinięcie:
2. Pobierz dane od użytkownika.
3. Jeżeli użytkownik wpisze ujemną liczbę wyświetl błąd.
4. Pobieraj błędne dane dopóki użytkownik nie wpisze poprawnego wyniku.
5. Zrób z tego grę:
   - Komputer losuje dwie duże liczby (10000 < n < 50000)
   - Użytkownik wpisuje NWD
   - Komputer oblicza NWD, a następnie wyświetla czy użytkownik zgadł liczbę czy nie*/
        /*
         * Pobieramy pierwszą liczbe i tworzymy ja jako tymczasowa
         * dopóki nie uda się podzielic bez reszty, to dziel z resztą
         * Jeżeli uda się podzielic bez reszty przejdz di kolejnej liczby
         *
         * Sprawdzamy kiedy dzielnik jest równy liczbie
         * Jeżeli jest równy liczbie sprawdzamy czy pierwszą liczbę podzielic przez dzielnik*/

        /*
         * 15
         * 5
         * 15/2 sprawdzamy czy bez reszty
         * 15/3 sprawdzamy czy bez reszty
         * udało podzielic sie bez reszty, wynik dzielimy przez trzy
         * 5/3 podzielilo sie bez reszty*/

        //założenie a>b
        //podprogram b=/0
        //c:= reszta z dzielenia a przez b
        //a:=b
        //b:=c


        public static void main(String[] args) {

            System.out.println(NWD(15, 3));

        }

        public static int NWD(int a, int b) {
            for (; b != 0; ) {
                int c = a % b;
                a = b;
                b = c;
            }
            return a;
        }
    }

