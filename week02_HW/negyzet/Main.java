package negyzet;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner olvaso = new Scanner(System.in);
        System.out.print("Adja meg a négyzet oldalát: ");
        Negyzet N1 = new Negyzet(olvaso.nextDouble());
        System.out.println("A négyzet területe: " + N1.terület());
        System.out.println("A négyzet kerülete: " + N1.kerület());
        olvaso.close();
    }
}
