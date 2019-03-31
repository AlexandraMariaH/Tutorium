package Aufgabenblatt2;

import java.util.Scanner;

public class Uebung2_7 {
    public static void main(String[] args){
        System.out.print("Gibt es Streitigkeiten?> ");
        Scanner sc = new Scanner(System.in);
        boolean eingabe = sc.nextBoolean();
        if (eingabe) {
            System.out.println("Keine Streitigkeiten mehr, oder es.. gibt Ärger..");
        }
        else {
            System.out.println("Yay, mal kein Streit!");
        }
    }
}