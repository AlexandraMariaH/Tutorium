package Aufgabenblatt2;

import java.util.Scanner;

public class Uebung2_10 {
    public static void main(String[] args){
        System.out.print("Was kostet es?> ");
        Scanner sc = new Scanner(System.in);
        double eingabe1 = sc.nextDouble();
        System.out.print("Was habe ich an Geld?> ");
        double eingabe2 = sc.nextDouble();
        if (eingabe1 <= eingabe2) {
            System.out.println("Alles okay!");
        }
        else if (0.95 * eingabe1  <= eingabe2) {
            System.out.println("Rabatt gewährt, kannst es trotzdem kaufen!");
        }
        else {
            System.out.println("Stock bitte deinen Geldbeutel auf und starte das Programm erneut!");
        }
    }
}