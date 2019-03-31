package Aufgabenblatt2;

import java.util.Scanner;

public class Uebung2_8 {
    public static void main(String[] args){
        System.out.print("Wie viel Geld ist noch im Geldbeutel?> ");
        Scanner sc = new Scanner(System.in);
        int eingabe = sc.nextInt();
        if (eingabe < 30) {
            System.out.println("Dieser Fuchs hat sich wohl am Geld bedient. MS NIVEAU WIR SINKEN!");
        }
        else if (eingabe == 30) {
            System.out.println("Alles noch im Geldbeutel. Danke unbekannte Person.");
        }
        else {
            System.out.println("Der Finder war sehr gütig. Wäre ich christlich, würde ich sagen: Gott sei mit Ihm");
        }
    }
}
