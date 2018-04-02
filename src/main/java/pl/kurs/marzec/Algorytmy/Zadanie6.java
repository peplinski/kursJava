package pl.kurs.marzec.Algorytmy;

public class Zadanie6 {
    public static void main(String[] args) {

        //trojkatPelny();
        // trojkatPusty();
        //kwadrat();
    }

    public static void trojkatPelny() {
        for (int i = 1; i <= 10; ++i) {
            for (int x = 1; x <= i; ++x)
                System.out.print("*");

            System.out.println(" ");
        }
    }

    public static void trojkatPusty() {
        for (int i = 1; i <= 10; ++i) {
            for (int x = 1; x <= i; ++x)
                System.out.print(" ");
            System.out.println("*");
        }
        for (int y = 1; y <= 12; y++) {
            System.out.print("*");
        }
    }

    public static void kwadrat() {
        for (int i=0; i<7; i++) {
            System.out.println();
            for (int j=0; j<4; j++) {
                System.out.print("*");
                System.out.print("");
            }
        }
        System.out.println();

        for(int i=1; i<=5; i++){
            for(int j=1; j<=5; j++){
                if(i==1 || i==5 || j==1 || j==5){
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void trojkatCaly(){
        for (int i=1; i<10; i += 2) {
            for (int k=0; k < (4 - i / 2); k++) {
                System.out.print(" ");
            }
            for (int j=0; j<i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    public static void trojkatCaly2(){
        for (int i=1; i<10; i += 2) {
            for (int k=0; k < (4 - i / 2); k++) {
                System.out.print(" ");
            }
            for (int j=0; j<i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

}
