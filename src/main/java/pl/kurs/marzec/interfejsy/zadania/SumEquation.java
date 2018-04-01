package pl.kurs.marzec.interfejsy.zadania;

public class SumEquation implements ICalculable {
    protected double x;
    protected double y;

    public SumEquation(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public double calculate() {
        return x + y;
    }
}
