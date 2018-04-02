package pl.kurs.marzec.szybkoscList;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();

        LinkedList linkedList = new LinkedList();
        ArrayList<Double> arrayList = new ArrayList();

        long start = new Date().getTime();
        int counter = 10000;
        for (int i = 0; i < counter; i++) {
            arrayList.add(rand.nextDouble());
        }
        System.out.println("ArrayList" + (new Date().getTime() - start) + "ms");

        //linkedList
        start = new Date().getTime();
        for (int i = 0; i < counter; i++) {
            linkedList.add(rand.nextInt());
        }
        System.out.println("LinkedList" + (new Date().getTime() - start) + "ms");
        System.out.println(arrayList.size());
        start = new Date().getTime();
        Iterator<Double> iterator = arrayList.iterator();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.remove(0);
        }

        System.out.println("Remove Array" + (new Date().getTime() - start) + "ms");
        System.out.println("Po Usunieciu ArrayList" + arrayList.size());
        System.out.println("LinkedListSize" + linkedList.size());


        start = new Date().getTime();
        for (int i = 0; i < counter; i++) {
            linkedList.remove();
        }
        System.out.println("Remove Linked" + (new Date().getTime() - start) + "ms");
        System.out.println("LinkedListSize" + linkedList.size());
    }

}
