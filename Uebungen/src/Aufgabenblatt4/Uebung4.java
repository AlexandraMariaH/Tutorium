package Aufgabenblatt4;

import java.util.Arrays;
import java.util.Scanner;

public class Uebung4 {

    public static void main(String[] args) {
        double[] zahlen = new double[100];
        char buchstabe;
        Scanner sc = new Scanner(System.in);
        int i = 0;
        do {
            System.out.print("Geben Sie eine Zahl für den Indizes: " + i + " ein!> ");
            zahlen[i] = sc.nextInt();
            System.out.print("Weitere Zahl einlesen? (j = ja, e = ende)> ");
            buchstabe = sc.next().charAt(0);
            i++;
            }
        while (buchstabe != 'e');
        double[] arr = new double[i];
        for (int j=0; j<i; j++){
            arr[j] = zahlen[j];
        }
        System.out.println(Arrays.toString(arr));
    }
}
