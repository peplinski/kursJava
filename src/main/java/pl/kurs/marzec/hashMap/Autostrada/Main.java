package pl.kurs.marzec.hashMap.Autostrada;

import pl.kurs.marzec.hashMap.Autostrada.Autostrada;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Autostrada autostrada = new Autostrada();

        Scanner scanner = new Scanner(System.in);
        boolean isWorking = true;

        while (isWorking) {
            String linia = scanner.nextLine();
            if (linia.startsWith("wjazd")) {
                //linia.split(" ")[1]; ====> drugie słowo
                String numeryTablic = linia.split(" ")[1];

                autostrada.wjazdPojazdu(numeryTablic);
            } else if (linia.startsWith("wyjazd")) {
                String numeryTablic = linia.split(" ")[1];

                autostrada.wyjazdPojazdu(numeryTablic);
            }
        }
    }
}
