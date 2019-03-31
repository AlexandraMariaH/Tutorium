package Aufgabenblatt2;

import java.util.Scanner;

public class Uebung2_6 {
    public static void main(String[] args){
        System.out.print("Text eingeben> ");
        Scanner sc = new Scanner(System.in);
        String eingabe = sc.next();
        if (eingabe.equals("Hallo")) {
            System.out.println(eingabe + " zurück!");
        }
    }
}