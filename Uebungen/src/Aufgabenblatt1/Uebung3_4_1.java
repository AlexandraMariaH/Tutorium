package Aufgabenblatt1;

public class Uebung3_4_1 {
    public static void main(String[] args) {
        int Zahl = 20;
        count(Zahl);
    }

    public static int count(int x) {
        x = x == 1 ? x :
                1 + count(x-1);
        System.out.println(x);
        return x;
    }
}