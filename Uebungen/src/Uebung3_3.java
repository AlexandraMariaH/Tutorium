import java.util.Scanner;

public class Uebung3_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String eingabe = "initial";
        while (!eingabe. equals("e")) {
            System.out.print("Bitte den Char eingeben >");
            eingabe = sc.nextLine();
            char eingabef = eingabe.charAt(0);
            int eingabeff = (int) eingabef;
            System.out.print("Der Buchstabe " + eingabe);
            System.out.printf(" ist als Oktalzahl %o \n", eingabeff);
        }
    }
}