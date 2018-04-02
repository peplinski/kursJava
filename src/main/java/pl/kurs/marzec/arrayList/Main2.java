package pl.kurs.marzec.arrayList;

class Node {
    public Integer element;
    public Node next;

    public Node(Integer e) {
        element = e;
    }
}

class MyLinkedList {
    private Node firstElement;
    private int index = 0;

    public int get(int i) throws Exception {
        Node n = firstElement;
        for (int j = 0; i != j && n != null; j++) {
            n = n.next;
        }

        if (n == null) {
            throw new Exception("Brak elementów");
        }

        return n.element;
    }

    public void add(Integer x) {
        System.out.println("Początek");
        if (firstElement == null) {
            System.out.println("Pierwszy element");
            firstElement = new Node(x);
        } else {
            Node n = firstElement;
            for (; n.next != null; ) {
                System.out.println("For: " + n.element);
                n = n.next;
            }

            System.out.println("Last.e: " + n.element);
            System.out.println("Last.n: " + n.next);
            n.next = new Node(x);
        }
    }
}

public class Main2 {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(3);
        myLinkedList.add(4);
        myLinkedList.add(5);
        myLinkedList.add(6);
        myLinkedList.add(7);
        myLinkedList.add(8);
        myLinkedList.add(9);
        myLinkedList.add(10);
        myLinkedList.add(11);
        myLinkedList.add(12);
        myLinkedList.add(13);
        myLinkedList.add(14);
    }

}

