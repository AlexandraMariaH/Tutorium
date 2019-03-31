package Aufgabenblatt2;

import java.util.Scanner;

public class Uebung2_5 {
    public static void main(String[] args){
        System.out.print("Bitte Zahl eingeben> ");
        Scanner sc = new Scanner(System.in);
        int eingabe = sc.nextInt();
        if (eingabe == 5) {
            System.out.println(eingabe + "!");
        }
    }
}
