package pl.kurs.marzec.dziedziczenie.pojazdy;

public class Kabriolet extends Samochod {
    protected boolean czyDachSchowany;

    public Kabriolet(String marka, String kolor, int rocznik) {
        super(marka, kolor, rocznik);
    }

    public void schowajDach() {
        if(czyDachSchowany == true){
            System.out.println("Dach już jest schowany!");
        }else {
            czyDachSchowany = true;
            System.out.println("Chowam dach");
        }
    }

    @Override
    public void przyspiesz() {
        int predkosc = 0;
        if (predkosc < 180) {
            System.out.println(String.format("Predkosc = %d km/h", predkosc));

        } else {
            predkosc = 180;
            System.out.println("Szybciej nie pojadę");
        }
    }

    @Override
    public String toString() {
        return String.format("%s samochód marki %s rocznik %d z rozsuwanych dachem",kolor,marka,rocznik);
    }
}

