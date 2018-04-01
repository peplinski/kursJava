package pl.kurs.marzec.interfejsy.zadania.Zad2;

public class Daugther implements IFamilyMember {
    protected String name = "Magda";
    @Override
    public void introduce() {
        System.out.println("I am daughter :)");
    }

    @Override
    public boolean isAdult() {
        return false;
    }


}
