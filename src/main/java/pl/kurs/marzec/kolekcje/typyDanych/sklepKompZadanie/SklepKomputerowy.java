package pl.kurs.marzec.kolekcje.typyDanych.sklepKompZadanie;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SklepKomputerowy {
    List<Komputer> listakomputerow = new ArrayList<>();//lista kompow tego sklepu
    List<OfertaSprzedazy> listaOfert = new ArrayList<>();//lista kompow tego sklepu


    //tworze sklep komuterowy
    //z produktami
    public SklepKomputerowy(List<Komputer> listaKomputerow, List<OfertaSprzedazy> listaOfert) {
        this.listakomputerow.addAll(listaKomputerow);
        this.listaOfert.addAll(listaOfert);

    }

    public SklepKomputerowy() {

    }


    public void wypiszWszystkieKomputery() {
        listakomputerow.stream().forEach((komputer) -> {
            System.out.println(komputer);
        });
        //z konsumerkomp
//        ConsumerKomp consumerKomp = new ConsumerKomp();
//        listakomputerow.stream().forEach(consumerKomp);
    }

    public void wypiszKomputeryOMocyWyższejNiż(int moc) {
        listakomputerow.stream().filter(komputer -> {
            return komputer.getPobieranaMoc() > moc;
        }).forEach((k) -> {
            System.out.println(k);
        });
    }

    public void wypiszCenyNazwyIIdentyfikatoryWszystkichKomputerow() {
        listakomputerow.stream().forEach(komputer -> {
            System.out.println(komputer.getIdentyfikatorProduktu() + " "
                    + komputer.getCena() + " " + komputer.getNazwa());
        });
    }


    public List<Komputer> zwróćWszystkieKomputery() {
        return listakomputerow.stream().collect(Collectors.toList());

    }

    public void wypiszWszystkieKomputeryZDwomaProcesorami(int procesory) {
        listakomputerow.stream().filter(komputer -> {
            return komputer.getIlośćProcesorów() == procesory;
        }).forEach((k) -> {
            System.out.println(k);
        });

    }

    public void zwróćKomputeryZPamięciąORozmiarze(int rozmPa) {
        listakomputerow.stream().filter(komputer -> komputer.getWielkośćPamięciRAM() == rozmPa)
                .forEach(komputer -> System.out.println(String.format(komputer.getNazwa(), komputer.getWielkośćPamięciRAM())));
        return;
    }

    List<Komputer> zwróćTylkoKomputeryZTurboIProcesoremPowyzej4() {
        return listakomputerow.stream()
                .filter(komputer -> komputer.isCzyProcesorMaTurbo() && komputer.getIlośćProcesorów() > 2)
                .collect(Collectors.toList());
    }

    ////  Sort  //////
//    public Komputer zwróćOfertyWszystkichKomputerówBezRabatów() {
//        return listakomputerow.stream().sorted((o1, o2) -> {
//            if (o1.getWielkośćDysku() < o2.getWielkośćDysku()) {
//                return -1;
//            } else if (o1.getWielkośćDysku() > o2.getWielkośćDysku()) {
//                return 1;
//            }
//            return 0;
//        }).collect(Collectors.toList()).get(0);
//    }

    public List<Komputer> zwróćKomputeryPosortowaniePoCenieRosnąco() {
        return listakomputerow.stream().sorted((o1, o2) -> {
            if (o1.getCena() > o2.getCena()) return 1;
            else if (o1.getCena() < o2.getCena()) return -1;
            else return 0;
        }).collect(Collectors.toList());
    }

    public Komputer zwróćNajbardziejOpłacalnyKomputer() {
        return listakomputerow.stream().sorted((o1, o2) -> {
            double ratio;
            ratio = (o1.getCzęstotliwośćProcesora() * o1.getWielkośćPamięciRAM() * o1.getWielkośćDysku()) - (o2.getCzęstotliwośćProcesora() * o2.getWielkośćPamięciRAM() * o2.getWielkośćDysku());
            if (ratio > 0) return 1;
            else if (ratio < 1) return -1;
            return 0;
        }).findFirst().get();


    }

    public List<OfertaSprzedazy> zwróćOfertyWszystkichKomputerówBezRabatów() {
        return listaOfert.stream()
                .filter(ofertaSprzedazy -> ofertaSprzedazy.getRabatProcentowo() == (0.0))
                .collect(Collectors.toList());
    }


}
