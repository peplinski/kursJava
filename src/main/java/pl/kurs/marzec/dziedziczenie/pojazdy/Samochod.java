package pl.kurs.marzec.dziedziczenie.pojazdy;

public class Samochod {
    protected String marka;
    protected String kolor;
    protected int rocznik;
    private int predkosc;
    private boolean czySwiatlaWlaczone;

    public Samochod(String marka, String kolor, int rocznik) {
        this.marka = marka;
        this.kolor = kolor;
        this.rocznik = rocznik;
    }

    public void wlaczSwiatla(){
        if (czySwiatlaWlaczone == true){
            System.out.println("Juz wlaczone");
        }else {
            czySwiatlaWlaczone = true;
            System.out.println("Włączam światła");
        }
    }

    public void przyspiesz() {
        predkosc += 10;
        if (predkosc <= 120) {
            System.out.println(String.format("Predkosc = %d km/h", predkosc));

        } else {
            predkosc = 120;
            System.out.println("Szybciej nie pojadę");
        }
    }

    @Override
    public String toString() {
        return String.format("Samochód marki %s koloru %s rocznik %d",marka,kolor,rocznik);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Samochod){
            Samochod that = (Kabriolet) obj;
            if (this.marka.equals(that.marka)){
                if (this.kolor.equals(that.kolor)){
                    if (this.rocznik == that.rocznik){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}

