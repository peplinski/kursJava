package pl.kurs.marzec.hashMap.student;


import java.util.*;


public class StudentMain {
    public static void main(String[] args) {
//        Student student1=new Student("bbb","ccc",1);
//        Student student2=new Student("aaa","bbb",2);
//        Student student3=new Student("aaa","bbb",2);
//        Student student4=new Student("ccc","bbb",2);
//        Student student5=new Student("aaa","ccc",3);
//
//        Map<Student,Integer>studentHashMap = new HashMap<>();
//        studentHashMap.put(student1,2);
//        studentHashMap.put(student2,2);
//        studentHashMap.put(student3,2);
//        studentHashMap.put(student4,2);
//        studentHashMap.put(student5,2);
//
//        Map<Student,Integer>studentIntegerMap=new HashMap<>();
//        studentIntegerMap.put(student1,10);
//        studentIntegerMap.put(student2,20);
//
//        System.out.println(student1.equals(student2));
//        System.out.println(student1.hashCode());
//
//        for (Map.Entry<Student,Integer> godzinyStudenta:
//                studentHashMap.entrySet()){
//            System.out.println("Imie"+godzinyStudenta.getKey()+
//                    ", nazwisko "+godzinyStudenta.getKey().getNazwisko()+
//                    ",numer Indeksu"+godzinyStudenta.getKey().getNrIndexu()+
//                    ": "+godzinyStudenta.getValue());
//        }
//        //tu wyświetla po imionach
//        for (Student s:studentHashMap.keySet()){
//            System.out.println(s.getImie());
//        }
//
//        //tu zwracamy klucze
//        for (Integer i:studentHashMap.values()){
//            System.out.println(i);
//        }
        List<Student2> student2list = new ArrayList<>();
        while (true) {
            student2list.add(pobierzStudentów());
            System.out.println("Czy powierać dalej: ?");
            if (new Scanner(System.in).nextLine().equals("n")) {
                break;
            }
        }

        Map<Student2, Integer> iloscGodzin = new HashMap<>();
        while (true) {
            Integer nrIndexu = pobierzIndeks();
            System.out.println("Czy pobwierać dalej: ?");
            if (new Scanner(System.in).nextLine().equals("n")) {
                break;
            }
            Student2 cache = null;
            for (Student2 student2 : student2list) {
                if (student2.getNrIndexu() == nrIndexu) {
                    cache = student2;
                    break;
                }
            }
            if (cache == null) {
                System.out.println("Nie znaleziono studenta");
            } else {
                iloscGodzin.putIfAbsent(cache, 0);
                System.out.println("ile godzin opuscil:");
                int godzina = new Scanner(System.in).nextInt();
                iloscGodzin.put(cache, iloscGodzin.get(cache) + godzina);
            }

            //wyswietl wszystkich studentow z iloscia godzin
        }
        Set<Map.Entry<Student2, Integer>> entries = iloscGodzin.entrySet();// zwraca nam wszystkie pary w mapie
        for(Map.Entry<Student2,Integer> entry: entries) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        //mateusza
//        Set<Map.Entry<Student2, Integer>> entries = iloscGodzin.entrySet();
//        for (Map.Entry<Student2, Integer> entry : entries) {
//            Student2 student2 = entry.getKey();
//            Integer godzina = entry.getValue();
//            System.out.println(student2.getImie() + " " + student2.getNazwisko());
//            System.out.println(" = " + godzina);
//        }
        Map<Student2,Integer> studenci1 = new HashMap<>();
        Map<Student2,Integer> studenci2 = new HashMap<>();

        studenci1.put(new Student2("a","a",1),1);
        studenci1.put(new Student2("a","b",2),2);
        studenci1.put(new Student2("a","c",3),3);
        studenci1.put(new Student2("a","d",4),2);
        studenci1.put(new Student2("a","b",5),5);

        studenci2.put(new Student2("a","b",1),2);
        studenci2.put(new Student2("a","b",2),5);
        studenci2.put(new Student2("a","b",3),4);
        studenci2.put(new Student2("a","b",4),3);
        studenci2.put(new Student2("a","b",5),2);

        //studenci1.putAll(studenci2);


//        Integer result = studenci1.putIfAbsent(new Student2("a","b",4),2);
//        /*
//         * code logic to test if the values has been inserted
//         * to the student database.
//         */
//        if(result!=null){ System.out.println("Id number taken of "+result); }
//        else{ System.out.println("Successfully inseerted to the database"); }
//        studenci1.putIfAbsent(new Student2("b","c",3),2);

        for (Map.Entry<Student2,Integer>entry:studenci2.entrySet()){
            studenci1.putIfAbsent(entry.getKey(),entry.getValue());
        }
        System.out.println(studenci1);
    }






    public static Student2 pobierzStudentów() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Imie Studenta: ");
        String imie = scanner.nextLine();

        System.out.println("Nazwisko Studenta: ");
        String nazwisko = scanner.nextLine();

        System.out.println("Numer indexu:");
        Integer nrIndexu = scanner.nextInt();

        return new Student2(imie, nazwisko, nrIndexu);
    }

    public static int pobierzIndeks() {
        Scanner in = new Scanner(System.in);
        System.out.println("Nr Indeksu Studenta: ");
        return in.nextInt();
    }


}

