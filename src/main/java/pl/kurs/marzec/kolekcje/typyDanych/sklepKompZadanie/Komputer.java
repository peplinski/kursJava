package pl.kurs.marzec.kolekcje.typyDanych.sklepKompZadanie;

public class Komputer {
    private int identyfikatorProduktu;
    private double częstotliwośćProcesora;
    private boolean czyProcesorMaTurbo;
    private double wielkośćPamięciRAM;
    private double wielkośćDysku;
    private double cena;
    private int ilośćProcesorów;
    private String nazwa; //model/nazwa/marka
    private int pobieranaMoc;

    public Komputer(int identyfikatorProduktu, double częstotliwośćProcesora
            , boolean czyProcesorMaTurbo, double wielkośćPamięciRAM, double wielkośćDysku
            , double cena, int ilośćProcesorów, String nazwa, int pobieranaMoc) {
        this.identyfikatorProduktu = identyfikatorProduktu;
        this.częstotliwośćProcesora = częstotliwośćProcesora;
        this.czyProcesorMaTurbo = czyProcesorMaTurbo;
        this.wielkośćPamięciRAM = wielkośćPamięciRAM;
        this.wielkośćDysku = wielkośćDysku;
        this.cena = cena;
        this.ilośćProcesorów = ilośćProcesorów;
        this.nazwa = nazwa;
        this.pobieranaMoc = pobieranaMoc;
    }

    public Komputer() {
    }

    public int getIdentyfikatorProduktu() {
        return identyfikatorProduktu;
    }

    public void setIdentyfikatorProduktu(int identyfikatorProduktu) {
        this.identyfikatorProduktu = identyfikatorProduktu;
    }

    public double getCzęstotliwośćProcesora() {
        return częstotliwośćProcesora;
    }

    public void setCzęstotliwośćProcesora(double częstotliwośćProcesora) {
        this.częstotliwośćProcesora = częstotliwośćProcesora;
    }

    public boolean isCzyProcesorMaTurbo() {
        return czyProcesorMaTurbo;
    }

    public void setCzyProcesorMaTurbo(boolean czyProcesorMaTurbo) {
        this.czyProcesorMaTurbo = czyProcesorMaTurbo;
    }

    public double getWielkośćPamięciRAM() {
        return wielkośćPamięciRAM;
    }

    public void setWielkośćPamięciRAM(double wielkośćPamięciRAM) {
        this.wielkośćPamięciRAM = wielkośćPamięciRAM;
    }

    public double getWielkośćDysku() {
        return wielkośćDysku;
    }

    public void setWielkośćDysku(double wielkośćDysku) {
        this.wielkośćDysku = wielkośćDysku;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public int getIlośćProcesorów() {
        return ilośćProcesorów;
    }

    public void setIlośćProcesorów(int ilośćProcesorów) {
        this.ilośćProcesorów = ilośćProcesorów;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public int getPobieranaMoc() {
        return pobieranaMoc;
    }

    public void setPobieranaMoc(int pobieranaMoc) {
        this.pobieranaMoc = pobieranaMoc;
    }

    @Override
    public String toString() {
        return "Komputer{" +
                "index= " + identyfikatorProduktu +
                ", Mhz= " + częstotliwośćProcesora +
                ", Turbo= " + czyProcesorMaTurbo +
                ", RAM= " + wielkośćPamięciRAM +
                ", Dysk =" + wielkośćDysku +
                ", cena= " + cena +
                ", Procesory= " + ilośćProcesorów +
                ", nazwa='" + nazwa + '\'' +
                ", pobMoc=" + pobieranaMoc +
                '}';
    }
}
