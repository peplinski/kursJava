package pl.kurs.marzec.hashMap.student;

public class Student2 {
    private String imie;
    private String nazwisko;
    private int nrIndexu;

    public Student2(String imie, String nazwisko, int nrIndexu) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.nrIndexu = nrIndexu;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public int getNrIndexu() {
        return nrIndexu;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", nrIndexu=" + nrIndexu +
                '}';
    }
    @Override
    public int hashCode() {

        return nrIndexu;
    }
}
