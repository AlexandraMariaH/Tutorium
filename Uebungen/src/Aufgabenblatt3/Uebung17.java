package Aufgabenblatt3;

import java.util.Scanner;

public class Uebung17 {

    public static void main(String[] args) {
        System.out.print("Soll das Array 3(true) oder 6 Felder(false) haben?>");
        Scanner sc = new Scanner(System.in);
        boolean eingabe = sc.nextBoolean();
        if (eingabe) {
            int[] arr = new int[3];
            int i;
            for (i = 0; i < arr.length; i++) {
                arr[i] = i * arr.length;
            }
            for (i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
        } else {
            int[] arr = new int[6];
            int i;
            for (i = 0; i < arr.length; i++) {
                arr[i] = i * arr.length;
            }
            for (i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
        }
    }
}
