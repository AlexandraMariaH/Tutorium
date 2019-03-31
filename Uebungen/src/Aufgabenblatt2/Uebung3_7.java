package Aufgabenblatt2;

import java.util.Scanner;

public class Uebung3_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Von wo sollen wir starten?> ");
        int eingabe = sc.nextInt();
        for (int n = eingabe; n <= 100; n++) {
            if (n == 20) {
                System.out.println("Wir haben 20 erreicht!");
            }
            if (n % 40 == 0 && n!=0) {
                System.out.println("Wir sind bei " + n + " angekommen");
            }
        }
    }
}