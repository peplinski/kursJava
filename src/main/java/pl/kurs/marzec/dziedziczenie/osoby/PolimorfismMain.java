package pl.kurs.marzec.dziedziczenie.osoby;

public class PolimorfismMain {
    public static void main(String[] args) {
        Osoba tomek = new Student("Tomasz","Nowak",23,123234345);

        tomek.przedstawSie();
        Student student = (Student) tomek;
        //System.out.println(student.przedstawSie());
    }
}
