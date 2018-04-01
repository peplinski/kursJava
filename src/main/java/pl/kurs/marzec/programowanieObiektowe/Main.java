package pl.kurs.marzec.programowanieObiektowe;

public class Main {

    public static void main(String[] args) {
        /*KontoBankowe kontoAndrzeja = new KontoBankowe(222,3000);
        KontoBankowe kontoCwaniaczka = new KontoBankowe(1111,0);

        //kontoCwaniaczka.stanKonta = 1000000;

        kontoAndrzeja.wyswietlStanKonta();
        kontoCwaniaczka.wyswietlStanKonta();*/

        Superbohater bohater = new Superbohater("Spiderman","Pajęcza siec");
        Superbohater bohater2 = new Superbohater("Punisher","Zemsta");
        Superbohater bohater3 = new Superbohater("Supermen","niesmiertelnosc");
        Superbohater bohater4 = new Superbohater("Supermen","niesmiertelnosc");

        bohater=bohater2;
        bohater2=bohater;
        bohater=null;

        bohater=bohater2;
        bohater2=bohater;
        System.out.println(bohater2=null);

        // bohater3=bohater4;
        bohater4.equals(bohater3);
        bohater3.equals(bohater4);



    }
}

