package pl.kurs.marzec.kolekcje.typyDanych.sklepKompZadanie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainSklepKomputerowy {

    public static void main(String[] args) {

        Komputer komputer1 = new Komputer(1, 2.3, true, 32.0, 512.0, 2300.0, 5, "Acer turbo", 300);
        Komputer komputer2 = new Komputer(2, 2.5, false, 16.0, 256.0, 1300.0, 3, "Acer not turbo", 350);
        Komputer komputer3 = new Komputer(5, 3.1, false, 8.0, 128.0, 1530.0, 9, "Acer 9 turbo", 1350);
        Komputer komputer4 = new Komputer(10, 1.1, true, 12.0, 60.0, 5130.0, 10, "Acer 10 turbo", 650);
        Komputer komputer5 = new Komputer(7, 4.1, true, 64.0, 30.0, 5000.0, 4, "Acer k4990 turbo", 500);
        Komputer komputer6 = new Komputer(3, 4.4, false, 30.0, 15.0, 4000.0, 3, "Acer 300 turbo", 200);
        Komputer komputer7 = new Komputer(15, 4.4, false, 50.0, 15.0, 5000.0, 3, "Acer 301 turbo", 250);
        Komputer komputer8 = new Komputer(33, 1.2, false, 90.0, 16.0, 6000.0, 2, "Acer 302 turbo", 270);
        Komputer komputer9 = new Komputer(34, 4.5, true, 32.0, 60.0, 7000.0, 2, "Acer 303 turbo", 320);
        Komputer komputer10 = new Komputer(35, 3.4, false, 10.0, 512.0, 13000.0, 2, "Acer 304 turbo", 500);
        Komputer komputer11 = new Komputer(36, 3.3, true, 13.0, 300.0, 300.0, 1, "Acer 305 turbo", 100);
        Komputer komputer12 = new Komputer(37, 2.5, false, 30.0, 365.0, 500.0, 1, "Acer 306 turbo", 400);
        Komputer komputer13 = new Komputer(38, 2.5, false, 7.0, 400.0, 1500.0, 5, "Acer 307 turbo", 40);
        Komputer komputer14 = new Komputer(39, 3.3, true, 8.0, 423.0, 12000.0, 3, "Acer 308 turbo", 260);
        Komputer komputer15 = new Komputer(40, 4.5, true, 4.0, 566.0, 4500.0, 2, "Acer 309 turbo", 270);
        Komputer komputer16 = new Komputer(41, 2.6, true, 2.0, 50.0, 4333.0, 1, "Acer 310 turbo", 270);
        Komputer komputer17 = new Komputer(42, 1.6, false, 6.0, 30.0, 2300.0, 4, "Acer 311 turbo", 240);
        Komputer komputer18 = new Komputer(43, 0.9, false, 30.0, 400.0, 1235.0, 4, "Acer 312 turbo", 240);

        List<Komputer> list = new ArrayList<Komputer>(Arrays.asList(komputer1,
                komputer2, komputer3, komputer4, komputer5, komputer6, komputer7,
                komputer8, komputer9, komputer10, komputer12, komputer13, komputer14,
                komputer15, komputer16, komputer17, komputer18));


        OfertaSprzedazy ofertaSprzedazy1 = new OfertaSprzedazy(komputer1, 40.00);
        OfertaSprzedazy ofertaSprzedazy2 = new OfertaSprzedazy(komputer2, 12.00);
        OfertaSprzedazy ofertaSprzedazy3 = new OfertaSprzedazy(komputer3, 13.00);
        OfertaSprzedazy ofertaSprzedazy4 = new OfertaSprzedazy(komputer4, 0.0);
        OfertaSprzedazy ofertaSprzedazy5 = new OfertaSprzedazy(komputer5, 0.0);
        OfertaSprzedazy ofertaSprzedazy6 = new OfertaSprzedazy(komputer6, 15.00);
        OfertaSprzedazy ofertaSprzedazy7 = new OfertaSprzedazy(komputer7, 19.00);
        OfertaSprzedazy ofertaSprzedazy8 = new OfertaSprzedazy(komputer8, 5.0);
        OfertaSprzedazy ofertaSprzedazy9 = new OfertaSprzedazy(komputer9, 10.00);
        OfertaSprzedazy ofertaSprzedazy10 = new OfertaSprzedazy(komputer10, 0.0);
        OfertaSprzedazy ofertaSprzedazy11 = new OfertaSprzedazy(komputer11, 0.0);
        OfertaSprzedazy ofertaSprzedazy12 = new OfertaSprzedazy(komputer12, 33.00);
        OfertaSprzedazy ofertaSprzedazy13 = new OfertaSprzedazy(komputer13, 30.00);
        OfertaSprzedazy ofertaSprzedazy14 = new OfertaSprzedazy(komputer14, 0.0);
        OfertaSprzedazy ofertaSprzedazy15 = new OfertaSprzedazy(komputer15, 15.00);
        OfertaSprzedazy ofertaSprzedazy16 = new OfertaSprzedazy(komputer16, 25.00);
        OfertaSprzedazy ofertaSprzedazy17 = new OfertaSprzedazy(komputer17, 0.0);
        OfertaSprzedazy ofertaSprzedazy18 = new OfertaSprzedazy(komputer18, 12.00);
        List<OfertaSprzedazy> oferta = new ArrayList<>(Arrays.asList(ofertaSprzedazy1,
                ofertaSprzedazy2, ofertaSprzedazy3, ofertaSprzedazy4, ofertaSprzedazy5, ofertaSprzedazy6,
                ofertaSprzedazy7, ofertaSprzedazy8, ofertaSprzedazy9, ofertaSprzedazy10,
                ofertaSprzedazy11, ofertaSprzedazy12, ofertaSprzedazy13, ofertaSprzedazy14, ofertaSprzedazy15,
                ofertaSprzedazy16, ofertaSprzedazy17, ofertaSprzedazy18));

        SklepKomputerowy sklepKomputerowy = new SklepKomputerowy(list, oferta);
        sklepKomputerowy.wypiszWszystkieKomputery();

        sklepKomputerowy.wypiszKomputeryOMocyWyższejNiż(1000);
        sklepKomputerowy.wypiszCenyNazwyIIdentyfikatoryWszystkichKomputerow();

//        List<Komputer> zwrocona = sklepKomputerowy.zwróćWszystkieKomputery();
//        System.out.println(zwrocona);
        sklepKomputerowy.zwróćWszystkieKomputery();
        sklepKomputerowy.wypiszWszystkieKomputeryZDwomaProcesorami(2);
        System.out.println("********");
        sklepKomputerowy.zwróćKomputeryZPamięciąORozmiarze(30);
        sklepKomputerowy.zwróćKomputeryZPamięciąORozmiarze(4);
        System.out.println("** sort **");
        System.out.println(sklepKomputerowy.zwróćKomputeryPosortowaniePoCenieRosnąco());
        //       sklepKomputerowy.zwróćNajbardziejOpłacalnyKomputer();
        System.out.println("**promocje**");
        //System.out.println(oferta.size());
        List<OfertaSprzedazy> ofertaSprzedazies = sklepKomputerowy.zwróćOfertyWszystkichKomputerówBezRabatów();
        System.out.println(ofertaSprzedazies);

    }
}
