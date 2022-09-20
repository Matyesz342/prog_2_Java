package kör;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner olvaso = new Scanner(System.in);
        System.out.print("Adja meg a kör sugarát: ");
        Kor K1 = new Kor(olvaso.nextDouble());
        System.out.println("A kör területe: " + K1.terület());
        System.out.println("A kör kerülete: " + K1.kerület());
        olvaso.close();
    }
}
