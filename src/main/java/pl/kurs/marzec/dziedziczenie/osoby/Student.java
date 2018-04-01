package pl.kurs.marzec.dziedziczenie.osoby;

public class Student extends Osoba {
    private long nrIndexu;

    public Student(String imie, String nazwisko, int wiek,long nrIndexu) {
        super(imie, nazwisko, wiek);
        this.nrIndexu = nrIndexu;
    }



    @Override
    public void przedstawSie() {
        System.out.println(String.format("Czesc, jestem %s i studiuje prawo", imie));
    }

    @Override
    public String toString() {
        return String.format("Student %s  lat %d",imie,wiek);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student){
            Student that = (Student) obj;
            if (this.nrIndexu == that.nrIndexu){
                return true;
            }
        }
        return false;
    }
}

