package pl.kurs.marzec.kolejka;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class KolejkaMain {

    private static Petent pobierzDaneOdUzytkownika() {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj imię petenta: ");
        String imie = in.nextLine();
        System.out.println("Podaj nazwisko petenta: ");
        String nazwisko = in.nextLine();
        System.out.println("Podaj pesel petenta: ");
        int pesel = in.nextInt();

//        return Petent.builder()
//                .imie(imie)
//                .nazwisko(nazwisko)
//                .pesel(pesel)
//                .build();
        return new Petent(pesel, imie, nazwisko);
    }
//    private static Petent pobierzDanePetenta(){
//
//    }

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner in = new Scanner(System.in);
        LinkedList<Petent> kolejka = new LinkedList<>();
        while (true) {
            //dodaj petenta
            Petent petent = pobierzDaneOdUzytkownika();
            kolejka.add(petent);
            System.out.println("Czy wprowadzić kolejnego[y/n");
            //jeżeli nie przechodzimy dalej
            if (in.nextLine().equals("n")) {
                break;
            }
        }

        while (!kolejka.isEmpty()) {
            //Jeżeli nie, poproś uzytkownika o liczbę petentów do dodania.
            System.out.println("Ilu dodać petentów: ");
            int iluPetentow = in.nextInt();
            //Następnie dodaj do kolejki tylu petentów ilu wpisał użytkownik
            while (iluPetentow>0){
                kolejka.add(pobierzDaneOdUzytkownika());
            }

        }
//Wylosuj liczbę i usuń z początku kolejki tylu petentów ile wylosowano w liczbie.
        int iluUsunac = rand.nextInt();


    }
}

