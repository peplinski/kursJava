package pl.kurs.marzec.kolejka;

import java.util.LinkedList;

public class Quene {
    public static void main(String[] args) {
        LinkedList<Integer> quene = new LinkedList<>();

        quene.add(12);
        quene.offer(13);
        quene.offer(14);
        quene.offer(15);

        Integer size = quene.size();
        for (int i = 0; i <size ; i++) {
            System.out.println(quene.poll());
        }
        System.out.println(quene.size());
    }
}

