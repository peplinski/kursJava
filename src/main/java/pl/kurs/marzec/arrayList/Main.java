package pl.kurs.marzec.arrayList;

import java.util.Arrays;
import java.util.Scanner;

class MyArrayList {
    private static final int CAPACITY = 10;
    private Integer[] numbers = new Integer[CAPACITY];
    private int index = 0;

    public Integer get(int i) {
        return numbers[i];
    }

    private void copy(Integer newSize) {
        Integer[] temp = new Integer[newSize];
        int tabSize = size();
        int tempIndex = 0;
        for (int i = 0; i < tabSize - 1; i++) {
            if (get(i) != null) {
                temp[tempIndex++] = get(i);
            }
        }
        index = tempIndex;
        numbers = temp;
    }

    public void remove(Integer x) {
        for (int i = 0; i < size() - 1; i++) {
            if (x.equals(get(i))) {
                numbers[i] = null;
            }
        }
        copy(size());
    }

    public void removeRecurWithCopy(Integer x) {
        removeRecur(x, index);
        copy(size());
    }

    private void removeRecur(Integer x, int i) {
        if (i < 0) {
            return;
        }
        if (x.equals(get(i))) {
            numbers[i] = null;
        }
        removeRecur(x, i - 1);
    }

    public void remove(MyArrayList otherList) {
        for (int i = 0; i < otherList.size() - 1; i++) {
            Integer actualElement = otherList.get(i);
            remove(actualElement);
        }
        copy(size());
    }

    public MyArrayList diff(MyArrayList otherList) {
        MyArrayList different = new MyArrayList();

        for (int i = 0; i < this.size() - 1; i++) {
            boolean isExistInOthers = false;
            for (int j = 0; j < otherList.size() - 1; j++) {
                if (this.get(i).equals(otherList.get(j))) {
                    isExistInOthers = true;
                    break;
                }
            }

            if (!isExistInOthers) {
                different.add(get(i));
            }
        }

        for (int i = 0; i < otherList.size() - 1; i++) {
            boolean isExistInOthers = false;
            for (int j = 0; j < this.size() - 1; j++) {
                if (otherList.get(i).equals(this.get(j))) {
                    isExistInOthers = true;
                    break;
                }
            }

            if (!isExistInOthers) {
                different.add(otherList.get(i));
            }
        }

        return different;
    }

    public void add(Integer number) {
        if (index >= numbers.length) {
            copy(2 * numbers.length);
        }
        numbers[index++] = number;
    }

    public int size() {
        return index + 1;
    }


    public boolean contains(Integer x) {
        boolean isExist = true;
        for (int i = 0; i < size(); i++) {
            Integer actualElement = get(i);
            if (actualElement.equals(x)) {
                return true;
            }

        }
        return isExist;
    }

    public boolean contains(MyArrayList otherList) {
        boolean isExist = false;
        for (int i = 0; i < otherList.size() - 1; i++) {
            if (contains(otherList.get(i))) {
                isExist = true;
            }


        }
        return isExist;

    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MyArrayList words = new MyArrayList();
        // Scanner sc = new Scanner(System.in);
        words.add(2222);
        words.add(8);
        words.add(212);
        words.add(2);
        words.add(21);
        words.add(2);
        words.add(12);
        words.add(2);
        words.add(2);
        words.add(2);
        words.add(3);
        words.add(2);
        words.add(2);
        words.add(5);
        words.add(6);
        words.add(7);
        MyArrayList otherList = new MyArrayList();
        otherList.add(1);
        otherList.add(4444);
        otherList.add(2);
        otherList.add(3);
        otherList.add(34);
        otherList.add(2);
        otherList.add(4);
        otherList.add(3);
        otherList.add(555);
        otherList.add(6);
        otherList.add(7);
        otherList.add(3);

        MyArrayList alfabet = new MyArrayList();
        alfabet.add((int) 'a');
        alfabet.add((int) 'ą');
        alfabet.add((int) 'b');
        alfabet.add((int) 'c');
        alfabet.add((int) 'd');
//        for (int i = 0; i < 3; i++) {
//            System.out.println("Podaj liczbę ");
//            words.add(sc.nextInt());
//        }
        for (int i = 0; i < words.size() - 1; i++) {
            System.out.println(words.get(i));
        }
        // words.removeRecurWithCopy(2);
        System.out.println("After remove '2': ");
        for (int i = 0; i < words.size() - 1; i++) {
            System.out.println(words.get(i));
        }
        System.out.println("******");
        MyArrayList diff = words.diff(otherList);
        for (int i = 0; i < diff.size() - 1; i++) {
            System.out.println(diff.get(i));
        }

//        MyArrayList ct  = new MyArrayList();
//        ct.add(21);
//        System.out.println("containst "+words.contains(ct));



        System.out.println("/////////");

        for (int i = 0; i <alfabet.size()-1 ; i++) {
            System.out.println(alfabet.get(i));
        }
    }
}

