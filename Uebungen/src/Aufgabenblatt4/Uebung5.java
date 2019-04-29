package Aufgabenblatt4;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.DoubleStream;

public class Uebung5 {

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
        System.out.println("### Starte Berechnungen! ###");
        double sum = DoubleStream.of(arr).sum();
        System.out.println("Der Durchschnitt ist: " + sum/arr.length);
        double min = Arrays.stream(arr).min().getAsDouble();
        System.out.println("Der kleinste Wert ist: " + min);
        double max = Arrays.stream(arr).max().getAsDouble();
        System.out.println("Der größte Wert ist: " + max);
        System.out.println("Die Summe ist: " + sum);
        System.out.println("Beginne mit finalem Schritt :) (: *_* >.> <.<");
        double[] arr2 = new double[10];
        for (int k=0; k<10; k++){
            arr2[k] = 2*k+min;
        }
        System.out.println(Arrays.toString(arr2));
        System.out.println("Durchschnitt errechnen!");
        double sum2 = 0;
        for (int l=0; l<5; l++){
            sum2 += arr2[2*l];
        }
        System.out.println("(Durchschnitt) sum / 5 = " + sum2/5);
        System.out.println("Und jetzt nur noch vom Durchschnitt Werte an ungeraden Indizes abziehen... Was für eine nervige");
        System.out.println("Aufgabe.. BOY");
        double sum3 = sum2/5;
        for(int m=0; m<5; m++){
            sum3 -= arr2[2*m+1];
        }
        System.out.println("Das Ergebnis lautet: " + sum3);
        System.out.println("GESCHAFFT BOOOOOOI");
    }
}
