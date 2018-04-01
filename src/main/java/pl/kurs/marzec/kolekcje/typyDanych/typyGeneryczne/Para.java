package pl.kurs.marzec.kolekcje.typyDanych.typyGeneryczne;

public class Para<L, P> {
    private L lewa;
    private P prawa;

    public Para(String name1, String name2) {
        this.lewa = lewa;
        this.prawa = prawa;
    }

    public L getLewa() {
        return lewa;
    }

    public void setLewa(L lewa) {
        this.lewa = lewa;
    }

    public P getPrawa() {
        return prawa;
    }

    public void setPrawa(P prawa) {
        this.prawa = prawa;
    }
}
