package pl.kurs.marzec.podstawy.marzec;

import java.util.Scanner;

public class SumaWszystkichLiczb {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Podaj liczbe: ");
        int liczba = scanner.nextInt();
        int licznik=1;
        int sum = 0;

        while (licznik<=liczba){
            sum=sum+licznik;
            System.out.println(sum);
            licznik++;
        }

    }
}

