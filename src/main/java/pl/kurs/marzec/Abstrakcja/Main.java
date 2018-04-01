package pl.kurs.marzec.Abstrakcja;

public class Main {
    public static void main(String[] args) {
        Okreg okreg =new Okreg(5);
        //String.format("%.2f",okreg.obliczObwod() zaokragla do 2 miejsc po przecinku

        System.out.println(String.format("%.2f",okreg.obliczObwod()));
        System.out.println(okreg.obliczPole());

        Kwadrat kwadrat = new Kwadrat(5);
        System.out.println(kwadrat.obliczPole());
        System.out.println(kwadrat.obliczObwod());

        Figura figura = new Prostokat(2,5);
        System.out.println(figura.obliczObwod());

        Figura[] figury = new Figura[]{kwadrat,okreg,okreg,kwadrat,figura};

        System.out.println("łączny obwód figór");
        double obwod =0;
        for (Figura f:figury){
            obwod+= f.obliczObwod();
        }
        System.out.println(String.format("Obwód wyniesie %.2f",obwod));


    }
}
