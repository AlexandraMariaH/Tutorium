package Aufgabenblatt1;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Uebung4 {
    public static void main(String[] args) {
        int[] count = new int[3];

        System.out.print("Bist du motiviert?(Ja/Nein)> ");
        Scanner sc = new Scanner(System.in);
        String eingabe = sc.nextLine();
        if (eingabe.equals("Ja")) {
            count[0] = 1;
        }

        System.out.print("Macht dir das hier noch Spaß?(Ja/Nein)> ");
        String eingabe2 = sc.nextLine();
        if (eingabe2.equals("Ja")) {
            count[1] = 1;
        }

        System.out.print("Gibst du auf?(Ja/Nein)> ");
        String eingabe3 = sc.nextLine();
        if (eingabe3.equals("Ja")) {
            count[2] = 1;
        }

        int sum = IntStream.of(count).sum();

        if (sum >= 2) {
            System.out.println("Jeder Weg ist steinig. Du schaffst das!");
        } else {
            System.out.print("Bist du traurig?(Ja/Nein)> ");
            String eingabe4 = sc.nextLine();
            while (eingabe4.equals("Ja")) {
                System.out.println("Nicht traurig sein!");
                System.out.print("Bist du traurig?(Ja/Nein)> ");
                eingabe4 = sc.nextLine();
            }
        }
    }
}
