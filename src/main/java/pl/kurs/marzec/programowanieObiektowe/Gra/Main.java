package pl.kurs.marzec.programowanieObiektowe.Gra;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Czy chcesz zagrać w grę?");
        if (scanner.nextLine().contains("t")) {
            Gra gra = new Gra();
            gra.graj();

        }
        System.out.println("Koniec!");
    }
}


