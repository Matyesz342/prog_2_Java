package gömb;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner olvaso = new Scanner(System.in);
        System.out.print("Adja meg a gömb sugarát: ");
        Gomb G1 = new Gomb(olvaso.nextDouble());
        System.out.println("A gömb felszíne: " + G1.felszin());
        System.out.println("A gömb térfogata: " + G1.terfogat());
        olvaso.close();
    }
}
