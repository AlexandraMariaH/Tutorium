package Aufgabenblatt3;

import java.util.Arrays;

public class Uebung12 {

    public static void main(String[] args) {
        double[] arr = new double[21];
        int i;
        for (i=0; i<=20; i++) {
            arr[i] = (double) i/2;
        }
        System.out.println(Arrays.toString(arr));
    }
}
