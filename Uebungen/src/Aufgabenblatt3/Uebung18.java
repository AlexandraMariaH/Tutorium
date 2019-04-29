package Aufgabenblatt3;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.*;

public class Uebung18 {

    public static void main(String[] args) {
        System.out.print("Wie viele Temperaturwerte möchten Sie eingeben?>");
        Scanner sc = new Scanner(System.in);
        int eingabe = sc.nextInt();
        double[] arr = new double[eingabe];
        int i;
        for (i = 0; i < arr.length; i++) {
            System.out.print("Geben Sie den " + (i + 1) + ". Temperaturwert ein>");
            double zahl = sc.nextDouble();
            arr[i] = zahl;
        }
        //System.out.println(Arrays.toString(arr));
        double sum = DoubleStream.of(arr).sum();
        System.out.println("Summe: " + sum);
        System.out.println("Durchschnitt: " + sum/arr.length);
        double min = Arrays.stream(arr).min().getAsDouble();
        System.out.println("Mindestwert: " + min);
        double max = Arrays.stream(arr).max().getAsDouble();
        System.out.println("Maximalwert: " + max);
    }
}