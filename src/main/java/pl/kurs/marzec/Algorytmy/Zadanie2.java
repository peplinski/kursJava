package pl.kurs.marzec.Algorytmy;

public class Zadanie2 {
    public static void main(String[] args) {
        System.out.println(multiply(12,2));
        System.out.println(power(2,3));
        System.out.println(power(2,4));
    }
    public static int multiply(int a,int b){
        int sum = 0;

        for (int i =0;i<b;i++){
            sum +=a;
        }
        return sum;
    }
    public static int power(int podstawa,int wykladnik){
        int power = podstawa;
        for (int i =0;i<wykladnik-1;i++){
            power =multiply(podstawa,power);
        }
        return power;
    }
}

