import java.util.Scanner;

public class Uebung3_2 {

    public static void main(String[] args) {
        System.out.print("Bitte Zahl eingeben >");
        Scanner sc = new Scanner(System.in);
        int eingabe = sc.nextInt();
        while (eingabe != 3) {
            System.out.println("Du sollst 3 eintippen!");
            System.out.print("Bitte Zahl eingeben >");
            eingabe = sc.nextInt();
        }
            System.out.println("Ich schaffe die Prog Klausur!");
    }
}