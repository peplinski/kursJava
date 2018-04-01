package pl.kurs.marzec.Abstrakcja;

abstract class Czworakat extends Wielokat {
    private double[] boki;

    public Czworakat(double a,double b, double c, double d){
        boki = new double[]{a,b,c,d};
    }

    @Override
    protected double[] zwrocBoki() {
        return boki;
    }
}
