package pl.kurs.marzec.kolejka;


import java.util.PriorityQueue;


 class Wiadomość {
    private int id;
    private String tekst;
    private int priorytet;

    public Wiadomość(int id, String tekst, int priorytet) {
        this.id = id;
        this.tekst = tekst;
        this.priorytet = priorytet;
    }

    public static void main(String[] args) {
        Wiadomość wiadomość1 = new Wiadomość(1,"pierwszy",2);
        Wiadomość wiadomość2= new Wiadomość(1,"234",2);
        Wiadomość wiadomość3 = new Wiadomość(1,"343",5);
        Wiadomość wiadomość4 = new Wiadomość(1,"454",6);
        Wiadomość wiadomość5 = new Wiadomość(1,"446",10);
        Wiadomość wiadomość6 = new Wiadomość(1,"55",9);
        Wiadomość wiadomość7 = new Wiadomość(1,"66",23);
        Wiadomość wiadomość8 = new Wiadomość(1,"66",23);

        PriorityQueue<Wiadomość>queueByPriorytet = new PriorityQueue<Wiadomość>
                ((w1,w2)->w1.tekst.length()-w2.tekst.length());
        queueByPriorytet.add(wiadomość1);
        queueByPriorytet.add(wiadomość2);
        queueByPriorytet.add(wiadomość3);
        queueByPriorytet.add(wiadomość4);
        queueByPriorytet.add(wiadomość5);
        queueByPriorytet.add(wiadomość6);
        queueByPriorytet.add(wiadomość7);
        queueByPriorytet.add(wiadomość8);
        PriorityQueue<Wiadomość>queueByPriorytet1 = new PriorityQueue<Wiadomość>
                ((w1,w2)->w1.priorytet-w2.priorytet);
        System.out.println("Kolejka po dlugości");
        while (queueByPriorytet.size()>0){
            System.out.println(queueByPriorytet.poll().tekst);
        }

        System.out.println();
        System.out.println("Kolejka po priorytecie: ");
        while (queueByPriorytet1.size()>0){
            System.out.println(queueByPriorytet1.poll().priorytet);
        }

    }
}

