package Aufgabenblatt3;

import java.util.Arrays;
import java.util.Scanner;

public class Uebung16 {

    public static void main(String[] args) {
        System.out.print("Länge des Arrays eingeben>");
        Scanner sc = new Scanner(System.in);
        int eingabe = sc.nextInt();
        int[] arr = new int[eingabe];
        int i;
        for (i = 0; i < arr.length; i++) {
            System.out.print("Geben Sie für den Index: " + i + " eine Zahl ein!>");
            int zahl = sc.nextInt();
            arr[i]=zahl;
        }
        //System.out.println(Arrays.toString(arr));
    }
}
