package pl.kurs.marzec.kolekcje.typyDanych.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorKomputerow {
    public static class Komputer {
        private String nazwa;
        private double moc;
        public Komputer(String nazwa, double moc) {
            this.nazwa = nazwa;
            this.moc = moc;
        }
        public String getNazwa() {
            return nazwa;
        }
        public void setNazwa(String nazwa) {
            this.nazwa = nazwa;
        }
        public double getMoc() {
            return moc;
        }
        public void setMoc(double moc) {
            this.moc = moc;
        }
        @Override
        public String toString() {
            return "Komputer{" +
                    "nazwa='" + nazwa + '\'' +
                    ", moc=" + moc +
                    '}';
        }
    }
    public static void main(String[] args) {
        List<Komputer> komputers = new ArrayList<>();
        komputers.add(new Komputer("a", 23.0));
        komputers.add(new Komputer("b", 2.0));
        komputers.add(new Komputer("c", 13.0));
        komputers.add(new Komputer("d", 25.0));
        komputers.add(new Komputer("e", 66.0));
        komputers.add(new Komputer("f", 3.0));
        ComparatorKomp comparatorKomputerow = new ComparatorKomp();
        System.out.println(komputers);
        Collections.sort(komputers, comparatorKomputerow);
        System.out.println(komputers);
    }
    public static class ComparatorKomp implements Comparator<Komputer> {
        // -1 o1>o2
        // 0 o1 == o2
        // 1 o1<o2
        @Override
        public int compare(Komputer o1, Komputer o2) {
            if (o1.getMoc() > o2.getMoc()) {
                return 1;
            } else if (o1.getMoc() < o2.getMoc()) {
                return -1;
            }
            return 0;
        }
    }
}
