package pl.kurs.marzec.stos;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class Zad10Prom {


    public static void main(String[] args) {
        LinkedList<Samochod> prom = new LinkedList<>();
        //Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        //System.out.println("Podaj dane samochodu: \n nr rejestracyjny, marka, rok produkcji");

        Samochod audi = new Samochod("GA1234", "Audi", 1994);
        //scanner.nextLine();
        Samochod bmw = new Samochod("GD4321", "BMW", 2001);
        // scanner.nextLine();
        Samochod fiat = new Samochod("GPU009", "Fiat", 1995);
        // scanner.nextLine();
        Samochod ford = new Samochod("GWE4432", "Ford", 2015);
        Samochod bugatti = new Samochod("GA0000", "Bugatti", 2015);
        Samochod mercedes = new Samochod("GWE1111", "Mercedes", 2015);
        Samochod volvo = new Samochod("GWE4432", "Volvo", 2015);
        Samochod subaru = new Samochod("GWE4432", "Subaru", 2015);

        prom.push(audi);
        prom.push(bmw);
        prom.push(fiat);
        prom.push(ford);
        prom.push(bugatti);
        prom.push(mercedes);
        prom.push(volvo);
        prom.push(subaru);

        System.out.println(prom.indexOf(bmw));
        System.out.println("********");

        //prom.clear();
        System.out.println(prom.size());

        Integer size = prom.size();
        int z = random.nextInt(size);
        for (int i = 0; i < z; i++) {
            if (prom.size() != 0) {
                prom.pop();
                System.out.println("Wyjechał samochód" + prom.pop());

            }
        }


    }
}

