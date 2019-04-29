package Aufgabenblatt4;

import java.util.Arrays;

public class Uebung6 {

    public static void main(String[] args) {
        int[][] arr = new int[10][10];
        for (int i=0; i<10; i++){
            arr[i][0] = i+1;
        }
        for (int j=0; j<10; j++){
            arr[0][j] = j+1;
        }
        for (int i=1; i<10; i++) {
            for (int j=1; j<10; j++) {
                arr[i][j] = arr[i][0] * arr[0][j];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] < 10){
                    System.out.print("|  " + arr[i][j] + "|");
                }
                else if (arr[i][j] == 100){
                    System.out.print("|" + arr[i][j] + "|");
                }
                else {
                    System.out.print("| " + arr[i][j] + "|");
                }
            }
            System.out.println("");
        }
    }
}
