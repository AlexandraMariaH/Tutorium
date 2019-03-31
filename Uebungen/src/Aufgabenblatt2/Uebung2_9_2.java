package Aufgabenblatt2;

import java.util.Scanner;

public class Uebung2_9_2 {
    public static void main(String[] args){
        System.out.print("Ist Schalter 1 an?> ");
        Scanner sc = new Scanner(System.in);
        boolean eingabe1 = sc.nextBoolean();
        System.out.print("Ist Schalter 2 an?> ");
        boolean eingabe2 = sc.nextBoolean();
        if (!eingabe1 && !eingabe2) {
            System.out.println("Das Licht ist aus! Nay");
        }
        else if (!eingabe1 || !eingabe2) {
            System.out.println("Das Licht flackert!");
        }
        else {
            System.out.println("Das Licht ist an!");
        }
    }
}
