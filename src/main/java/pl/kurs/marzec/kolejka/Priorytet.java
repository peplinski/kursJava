package pl.kurs.marzec.kolejka;



import java.util.PriorityQueue;

public class   Priorytet {
    private String Name;
    private int id;

    public Priorytet(String name, int id) {
        Name = name;
        this.id = id;
    }

    public static void main(String[] args) {
        PriorityQueue<Priorytet> kolejka = new PriorityQueue<>((e1, e2) -> e1.id - e2.id);
        kolejka.add(new Priorytet("a",2));
        kolejka.add(new Priorytet("aaf",12));
        kolejka.add(new Priorytet("agtrhgrt",22));
        kolejka.add(new Priorytet("fffgfga",26));
        kolejka.add(new Priorytet("aaaaaa",24));


        System.out.println(kolejka);
    }
}

