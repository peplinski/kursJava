package pl.kurs.marzec.stos;

public class Samochod {
    private String numerRejestracyjny;
    private String marka;
    private double rokProdukcji;

    public Samochod(String numerRejestracyjny, String marka, double rokProdukcji) {
        this.numerRejestracyjny = numerRejestracyjny;
        this.marka = marka;
        this.rokProdukcji = rokProdukcji;
    }

    public String getNumerRejestracyjny() {
        return numerRejestracyjny;
    }

    public String getMarka() {
        return marka;
    }

    public double getRokProdukcji() {
        return rokProdukcji;
    }

    @Override
    public String toString() {
        return "Samochod{" +
                "nrRej='" + numerRejestracyjny + '\'' +
                ", marka='" + marka + '\'' +
                ", rokProdukcji=" + rokProdukcji +
                '}';
    }

}

