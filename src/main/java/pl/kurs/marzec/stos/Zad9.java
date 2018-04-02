package pl.kurs.marzec.stos;

import java.util.LinkedList;


public class Zad9 {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        String napis = "napis";
        for (int i = 0; i < napis.length() - 1; i++) {
            linkedList.push(String.valueOf(napis.charAt(i)));
        }

        int count = linkedList.size();

        for (int i = 0; i < count; i++) {
            System.out.println(linkedList.pop());
        }
    }
}

