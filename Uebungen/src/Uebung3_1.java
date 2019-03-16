import java.util.Scanner;

public class Uebung3_1 {

    public static void main(String[] args) {
        System.out.print("Bitte Zahl eingeben >");
        Scanner sc = new Scanner(System.in);
        int eingabe = sc.nextInt();
        if (eingabe == 3) {
            System.out.println("Ich schaffe die Prog Klausur!");
        }
    }
}