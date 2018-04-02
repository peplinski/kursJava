package pl.kurs.marzec.hashMap.urzadMiasta;

import java.util.List;

public class UmMain {
    public static void main(String[] args) {
        RejestrObywateli rejestrOb =new RejestrObywateli();
        rejestrOb.dodajObywatela("90092804282","Jan","Nowak");
        rejestrOb.dodajObywatela("71012717503","Jan","Nowakowki");
        rejestrOb.dodajObywatela("39091200804","Jan","Kowalski");
        rejestrOb.dodajObywatela("65121806074","Donald","Kaczor");
        rejestrOb.dodajObywatela("71081219331","Bugs","Bunny");
        rejestrOb.dodajObywatela("12241908201","Jerry","Kowal");
        rejestrOb.dodajObywatela("89051501586","Tom","Kowalski");
        rejestrOb.dodajObywatela("14290617820","Simba","Jezioranski");
        rejestrOb.dodajObywatela("2406251353","Julian","Król");
        rejestrOb.dodajObywatela("85022416516","Zbigniew","Kulfon");

        System.out.println(rejestrOb.znajdzObywateliUrodzonychPrzed(1925));
        System.out.println(rejestrOb.znajdźObywatelaPoNazwisku("Kaczor"));
        System.out.println(rejestrOb.znajdźObywateliZRokuZImieniem(1971,"Bugs"));
        System.out.println(rejestrOb.znajdźObywatelaPoPeselu("65121806074"));
    }
}

