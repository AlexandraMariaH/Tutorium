package Aufgabenblatt2;

import java.util.Scanner;

public class Uebung3_8 {
    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("a ist true/false?> ");
        boolean eingabe1 = sc.nextBoolean();
        System.out.print("b ist true/false?> ");
        boolean eingabe2 = sc.nextBoolean();
        System.out.print("c ist true/false?> ");
        boolean eingabe3 = sc.nextBoolean();
        if (eingabe1) {
            count++;
        }
        if (eingabe2) {
            count++;
        }
        if (eingabe3) {
            count++;
        }
        if (count >= 2) {
            for (int i=1; i<=30*count; i++) {
                System.out.println("Zählen!: " + i);
            }
        }
    }
}
