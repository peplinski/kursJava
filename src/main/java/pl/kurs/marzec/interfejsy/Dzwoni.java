package pl.kurs.marzec.interfejsy;

public interface Dzwoni {


    static String nrAlarmowy = "112";

    void zadzwon(String nrTel);

    void zadzwonNaNrAlarmowy();
}
