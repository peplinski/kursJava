package pl.kurs.marzec.kolekcje.typyDanych.comparator;

import java.util.*;

public class OfertaSprzMain {
    /*
    * 2.
Stwórz klasę OfertaSprzedaży(String nazwaProduktu, int cena)
a następnie stwórz komparator który sortuje OfertySprzedaży po
cenie rosnąco lub malejąco. Wskazówka : dodaj do klasy komparatora dodatkowe pole
(np. typu boolean) które w zależności od wartości inaczej sortuje obiekty.*/
    public static void main(String[] args) {
        CompareProduktow compareProduktow=new CompareProduktow();

        List <Sklepik> sklepikList = new ArrayList<>();
        sklepikList.add(new Sklepik("a",2));
        sklepikList.add(new Sklepik("ab",4));
        sklepikList.add(new Sklepik("aw",7));
        sklepikList.add(new Sklepik("abc",8));
        sklepikList.add(new Sklepik("aaa",12));
        sklepikList.add(new Sklepik("art",33));
        sklepikList.add(new Sklepik("qwa",22));

        Collections.sort(sklepikList,compareProduktow);


    }
    public static class CompareProduktow implements Comparator<Sklepik>{
        private boolean malejaco;


        @Override
        public int compare(Sklepik o1, Sklepik o2) {
            if (o1.getCena()>o2.getCena()){
                if (malejaco){
                    return 1;
                }else {
                    return -1;
                }

            }else if (o1.getCena()<o2.getCena()){
                if (malejaco){
                    return -1;
                }
                return 1;
            }
            return 0;
        }
    }
}
