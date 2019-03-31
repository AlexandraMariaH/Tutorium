package Aufgabenblatt2;

import java.util.Scanner;

public class Uebung3_9 {
    public static void main(String[] args) {
        String eingabe;
        Scanner sc = new Scanner(System.in);
        do {
            int zahl = (int)((Math.random()) * 100 + 20);
            System.out.println("Zufallszahl " + zahl);
            System.out.print("Geben Sie einen Satz ein, \"cool\" beendet das Programm> ");
            eingabe = sc.nextLine();
        }
        while (!eingabe.equals("cool"));
    }
}