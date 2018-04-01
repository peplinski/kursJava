package pl.kurs.marzec.interfejsy.zadania.Zad2;

public class Father implements IFamilyMember {
    protected String name = "Wiktor";

    @Override
    public void introduce() {
        System.out.println("I am your father!");
    }

    @Override
    public boolean isAdult() {
        return true;
    }

    public void screamAtSon() {
        System.out.println("Son youre bad!");
    }


}
