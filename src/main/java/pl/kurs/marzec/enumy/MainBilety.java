package pl.kurs.marzec.enumy;

import java.util.Scanner;

public class MainBilety {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Bilet bilet = Bilet.ULGOWY_GODZINNY;
        Bilet bilet2 = Bilet.ULGOWY_GODZINNY;

        //bilet.cena=5;

        System.out.println(bilet.pobierzCeneBiletu());
        System.out.println(bilet2.pobierzCeneBiletu());

        System.out.println(bilet2.pobierzCzasJazdy());
        // bilet.wyswietlDaneOBilecie();
//        bilet.wyswietlDaneOBilecie();

        kupBilet(70, 20, 50.0).wyswietlDaneOBilecie();

    }

    private static Bilet kupBilet(int wiek, int czasWMin, double kwota) {
        Bilet bilet = Bilet.BRAK_BILETU;

        if (wiek <= 18 || wiek >= 70) {
            if (czasWMin <= 60) {
                bilet = Bilet.ULGOWY_GODZINNY;
            } else {
                bilet = Bilet.ULGOWY_CALODNIOWY;
            }
        } else {
            if (czasWMin <= 60) {
                bilet = Bilet.NORMALNY_GODZINNY;
            } else {
                bilet = Bilet.NORMALNY_CALODNIOWY;
            }
        }

        if (bilet.pobierzCeneBiletu() <= kwota) {
            return bilet;
        } else {
            return Bilet.BRAK_BILETU;
        }
    }
}

