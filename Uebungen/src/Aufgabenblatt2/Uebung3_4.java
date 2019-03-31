package Aufgabenblatt2;

import java.util.Scanner;

public class Uebung3_4 {
    public static void main(String[] args) {
        String eingabe;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Buchstabe eingeben> ");
            eingabe = sc.nextLine();
        }
        while (!eingabe.equals("e"));
    }
}