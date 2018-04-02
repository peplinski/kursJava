package pl.kurs.marzec.hashMap.student;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StudentMain {
    public static void main(String[] args) {
        Student student1=new Student("bbb","ccc",1);
        Student student2=new Student("aaa","bbb",2);
        Student student3=new Student("aaa","bbb",2);
        Student student4=new Student("ccc","bbb",2);
        Student student5=new Student("aaa","ccc",3);

        Map<Student,Integer>studentHashMap = new HashMap<>();
        studentHashMap.put(student1,2);
        studentHashMap.put(student2,2);
        studentHashMap.put(student3,2);
        studentHashMap.put(student4,2);
        studentHashMap.put(student5,2);

        Map<Student,Integer>studentIntegerMap=new HashMap<>();
        studentIntegerMap.put(student1,10);
        studentIntegerMap.put(student2,20);

        System.out.println(student1.equals(student2));
        System.out.println(student1.hashCode());

        for (Map.Entry<Student,Integer> godzinyStudenta:
                studentHashMap.entrySet()){
            System.out.println("Imie"+godzinyStudenta.getKey()+
                    ", nazwisko "+godzinyStudenta.getKey().getNazwisko()+
                    ",numer Indeksu"+godzinyStudenta.getKey().getNrIndexu()+
                    ": "+godzinyStudenta.getValue());
        }
        //tu wyświetla po imionach
        for (Student s:studentHashMap.keySet()){
            System.out.println(s.getImie());
        }

        //tu zwracamy klucze
        for (Integer i:studentHashMap.values()){
            System.out.println(i);
        }

    }
}

