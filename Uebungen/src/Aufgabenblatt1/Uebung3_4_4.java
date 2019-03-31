package Aufgabenblatt1;

import java.util.Scanner;

public class Uebung3_4_4 {
    public static void main(String[] args) {
        String[] speicher = new String[1];
        for (int x = 1; x <= 30; x++) {
            if (x==10){
                System.out.println(x);
                System.out.print("Gib den Text ein> ");
                Scanner sc = new Scanner(System.in);
                String eingabe = sc.nextLine();
                speicher[0] = eingabe;
            }
            else if (x==12){
                System.out.println(x);
                System.out.println(speicher[0]);
            }
            else if (x%2== 0) {
                System.out.println(x);
            }
        }
    }
}