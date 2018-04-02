package pl.kurs.marzec.hashMap.student;

import java.util.Objects;

public class Student {
    private String imie;
    private String nazwisko;
    private int nrIndexu;

    public Student(String imie, String nazwisko, int nrIndexu) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.nrIndexu = nrIndexu;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public int getNrIndexu() {
        return nrIndexu;
    }

    public void setNrIndexu(int nrIndexu) {
        this.nrIndexu = nrIndexu;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return nrIndexu == student.nrIndexu &&
                Objects.equals(imie, student.imie) &&
                Objects.equals(nazwisko, student.nazwisko);
    }

    @Override
    public int hashCode() {

        return nrIndexu;
    }

    @Override
    public String toString() {
        return "Student{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", nrIndexu=" + nrIndexu +
                '}';
    }
}
