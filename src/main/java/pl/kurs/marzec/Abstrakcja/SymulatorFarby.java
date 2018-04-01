package pl.kurs.marzec.Abstrakcja;

public class SymulatorFarby{

    public static int obliczZapotrzebowanieNaFarbe(Figura[] figury, double wielkosPojemnika){

        double lacznaPow=0;

        for (Figura figura:figury){
            lacznaPow +=figura.obliczPole();
        }
        int iloscWiaderek = (int) (lacznaPow/wielkosPojemnika);
        if (lacznaPow % wielkosPojemnika !=0 ){
            iloscWiaderek++;
        }
        return iloscWiaderek;
    }

    public static void main(String[] args) {
        Kwadrat kwadrat =new Kwadrat(5);
        Prostokat prostokat = new Prostokat(10,24);
        Okreg okreg = new Okreg(3);


        Figura[] f = new Figura[]{kwadrat,prostokat,okreg};
        System.out.println(obliczZapotrzebowanieNaFarbe(f,5));
        System.out.println(obliczZapotrzebowanieNaFarbe(f,4));
    }

}

