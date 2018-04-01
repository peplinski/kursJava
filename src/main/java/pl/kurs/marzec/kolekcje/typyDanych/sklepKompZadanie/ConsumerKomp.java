package pl.kurs.marzec.kolekcje.typyDanych.sklepKompZadanie;

import java.util.function.Consumer;

public class ConsumerKomp implements Consumer<Komputer> {

    @Override
    public void accept(Komputer komputer) {
        System.out.println(komputer);
    }
}

