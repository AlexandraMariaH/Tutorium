package Aufgabenblatt2;

import java.util.Scanner;

public class Uebung3_5 {
    public static void main(String[] args) {
        int eingabe;
        boolean b = true;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Bitte geben Sie die Zahl 7 ein!");
            System.out.print("Zahl eingeben> ");
            eingabe = sc.nextInt();
            if (eingabe == 7) {
                b = false;
            } else {
                System.out.println("Das Textverständnis lässt zu wünschen übrig!");
            }
        }
        while (b);
    }
}