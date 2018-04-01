package pl.kurs.marzec.enumy;

public enum Bilet {
    ULGOWY_GODZINNY(1.6,60),
    NORMALNY_GODZINNY(3.2,60),
    ULGOWY_CALODNIOWY(5.2,24*60),
    NORMALNY_CALODNIOWY(10.4,24*60),
    BRAK_BILETU(0.0,0);

    private int czas;
    private double cena;

    Bilet(double cena,int czas) {
        this.cena = cena;
        this.czas = czas;
    }


    public double pobierzCeneBiletu(){
        return cena;
    }

    public int pobierzCzasJazdy(){
        return czas;
    }

    public void wyswietlDaneOBilecie(){
        String tekst = this.toString().toLowerCase().replace("_", " ");
        System.out.println("Bilet "+tekst);
    }

}

