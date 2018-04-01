package pl.kurs.marzec.podstawy.marzec;

import java.util.Scanner;

public class Potega {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");
        int x = scanner.nextInt();
        System.out.println("Podaj potegę:");
        int y = scanner.nextInt();
        int potega=1;

        for (int i = 0; i<y;i++){
            potega=potega*x;
        }
        System.out.println(potega);

    }
}
