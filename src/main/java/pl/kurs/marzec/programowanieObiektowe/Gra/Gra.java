package pl.kurs.marzec.programowanieObiektowe.Gra;

import java.util.Random;
import java.util.Scanner;

public class Gra {
    private int tajneHasło;
    private int podaneHaslo;



    public Gra() {
        Random random = new Random();
        tajneHasło = 1 + random.nextInt(99);
    }

    public void graj() {
        Scanner scanner = new Scanner(System.in);
        int licznik=0;



        do {
            if(licznik<=5){
                System.out.println("Podaj liczbę");
                this.podaneHaslo = scanner.nextInt();

                if (podaneHaslo > tajneHasło) {
                    System.out.println("Podana liczba jest za duża");
                } else if (podaneHaslo < tajneHasło) {
                    System.out.println("Podana liczba jest za mała");
                }
                licznik++;
                System.out.println("Próba "+licznik);
            }else if (licznik>5){
                break;
            }
        }while (podaneHaslo != tajneHasło) ;

        if (licznik<5)
            System.out.println("Gratulacje, odgadłeś tajne hasło: " + tajneHasło);



    }
}


