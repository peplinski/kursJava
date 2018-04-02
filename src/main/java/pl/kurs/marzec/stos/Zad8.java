package pl.kurs.marzec.stos;

import java.util.LinkedList;

//liczba binarna
public class Zad8 {
    //    func bin(n)
////    dopóki n > 0
////    odłóż na stos n % 2
////    n = n / 2
////    zwróć stos
    public static LinkedList<Integer> bin(Integer n) {
        LinkedList<Integer> stos = new LinkedList<>();
        Integer m = n;
        for (; m > 0; ) {
            stos.push(m % 2);
            m = m / 2;
        }
        return stos;
    }

    public static void main(String[] args) {
        System.out.println(bin(26));

    }
}

