package pl.kurs.marzec.interfejsy.zadania;

public class DivEquation implements ICalculable {
    protected double x;
    protected double y;

    public DivEquation(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public double calculate() {
        return x/y;
    }
}
