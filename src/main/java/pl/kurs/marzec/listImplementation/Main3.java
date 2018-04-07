package pl.kurs.marzec.listImplementation;

public class Main3 {

    public static void main(String[] args) {
        MyArrayList words = new MyArrayList();
        words.add(4);
        words.add(3);
        words.add(5);
        words.add(10);
        words.add(4);
        words.add(7);
        words.add(8);
        words.add(4);

        System.out.println("init: ");
        for (int i = 0; i < words.size() - 1; i++) {
            System.out.print(words.get(i) + ", ");
        }

        words.removeRecurWithCopy(4);

        System.out.println();
        System.out.println("After remove `4`: ");
        for (int i = 0; i < words.size() - 1; i++) {
            System.out.print(words.get(i) + ", ");
        }

        System.out.println("Diff: ");
        MyArrayList otherList = new MyArrayList();
        otherList.add(1);
        otherList.add(2);
        otherList.add(4);
        otherList.add(10);

//        MyArrayList diff = words.diff(otherList);
//        for (int i = 0; i < diff.size() - 1; i++) {
//            System.out.println("diff: " + diff.get(i));
//        }
//
//        MyArrayList ct = new MyArrayList();
//        ct.add(99);
//        System.out.println("contains: " + words.contains(ct));

        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(3);

//        try {
//            System.out.println(myLinkedList.get(1));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }
}
