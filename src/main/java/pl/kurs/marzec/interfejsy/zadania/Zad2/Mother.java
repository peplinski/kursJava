package pl.kurs.marzec.interfejsy.zadania.Zad2;

public class Mother implements IFamilyMember {
    protected String name = "Zofia";

    @Override
    public void introduce() {
        System.out.println("Dzien dobry mam na imię" + name);
    }

    @Override
    public boolean isAdult() {
        return true;
    }

}
