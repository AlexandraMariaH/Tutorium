public class Uebung3_4_2 {
    public static void main(String[] args) {
        int Zahl = 20;
        count(Zahl);
    }

    public static int count(int x) {
        x = x == 1 ? x :
                1 + count(x-1);
        System.out.println(x+2);
        return x;
    }
}