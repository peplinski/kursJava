package pl.kurs.marzec.annotation;


public class Main {
    public static void main(String[] args) {
        TeddyBear misio = new TeddyBear("imie", 5);

        misio.setWiek(11);
        System.out.println(misio);
    }
}
