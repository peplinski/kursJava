package pl.kurs.marzec.interfejsy;

import java.util.Random;

public class Telefon implements Dzwoni {
    private String numerTel;
    private int lacznyCzasRozmow;

    public void zadzwon(String nrTel) {
        Random randomGenerator = new Random();
        int generatedNumber = randomGenerator.nextInt(100);

        //40% nie zadzwoni i 60% zadzwoni
        if (generatedNumber > 40) {
            // dzwoni
            numerTel = nrTel;
            // czas rozmowy to w minutach od 1 do 60 min.
            int czasRozmowy = randomGenerator.nextInt(59) + 1;
            lacznyCzasRozmow += czasRozmowy;

            System.out.println("czasRozmowy: " + czasRozmowy);
        } else {
            // nie dzwoni
            numerTel = null;
        }
    }

    public void zadzwonNaNrAlarmowy() {
        zadzwon(nrAlarmowy);
    }
}

