package Aufgabenblatt4;

import java.util.Scanner;

public class Uebung3 {

    public static void main(String[] args) {
        char buchstabe;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Raten von..?> ");
            int von = sc.nextInt();
            System.out.print("Raten bis..?> ");
            int bis = sc.nextInt();
            int zahl = (int) ((Math.random()) * bis + von);
            System.out.println("Errate eine Zahl zwischen " + von + " und " + bis);
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
            System.out.print("Du hast meine Zahl beim " + (i - 1) + ". Versuch erraten! Noch mal? (j=Ja, n=Nein)> ");
            buchstabe = sc.next().charAt(0);
        }
        while (buchstabe == 'j');
    }
}
