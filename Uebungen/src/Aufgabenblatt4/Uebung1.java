package Aufgabenblatt4;

import java.util.Scanner;

public class Uebung1 {

    public static void main(String[] args) {
        int zahl = (int) ((Math.random()) * 128 + 1);
        Scanner sc = new Scanner(System.in);
        System.out.println("Errate eine Zahl zwischen 1 und 128");
        int i = 1;
        int eingabe = 0;
        while (eingabe != zahl) {
            System.out.print(i + ". Versuch: ");
            eingabe = sc.nextInt();
            if (eingabe < zahl) {
                System.out.println("Meine Zahl ist größer!");
            } else if (eingabe > zahl) {
                System.out.println("Meine Zahl ist kleiner!");
            }
            i++;
        }
        System.out.println("Du hast meine Zahl beim " + (i-1) + ". Versuch erraten!");
    }
}
