package pl.kurs.marzec.interfejsy.zadania.Zad2;

public class Main2 {
    public static void main(String[] args) {
        IFamilyMember[] members = new IFamilyMember[4];

        members[0] = new Father();
        members[1] = new Mother();
        members[2] = new Son();
        members[3] = new Daugther();
        for (IFamilyMember member : members) {
            member.introduce();
//sprawdzac przez instatOf czy jest członkiem
            if (member instanceof Father) {
                Father memberAsFather = (Father) member;
                memberAsFather.screamAtSon();
            }
        }
    }
}

