package pl.kurs.marzec.katalogi;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        File f = new File(".");
        f.exists();//czy istnieje
        //System.out.println(f.getAbsolutePath());//wyswietli scieżkę absolutną

        f.listFiles();

        File[] files = f.listFiles();
        for (File child : files) {
            System.out.println("Child: " + child.getAbsolutePath());
            System.out.println("isDirectory: " + child.isDirectory() + " name " + child.getAbsolutePath());
        }
    }
}

