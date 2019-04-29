package Aufgabenblatt3;

import java.util.Arrays;

public class Uebung13 {

    public static void main(String[] args) {
        int[] arr = new int[101];
        int i;
        for (i=0; i<=100; i++) {
            if (i>=39 && i<=59){
                arr[i]=-1;
            }
            else{
                arr[i] = i+1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
