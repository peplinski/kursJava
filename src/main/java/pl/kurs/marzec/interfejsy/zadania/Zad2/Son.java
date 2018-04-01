package pl.kurs.marzec.interfejsy.zadania.Zad2;

public class Son implements IFamilyMember {
    protected String name = "Krzysiek";

    @Override
    public void introduce() {
        System.out.println("Siema jestem " + name);
    }

    @Override
    public boolean isAdult() {
        return false;
    }


}
