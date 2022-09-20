package teglalap;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner olvaso = new Scanner(System.in);
        System.out.print("Adja meg a téglalap egyik oldalát, majd white space-szel elválasztva a másik oldalt: ");
        //System.out.print("Adja meg a téglalap másik oldalát: ");
        Teglalap T1 = new Teglalap(olvaso.nextDouble(), olvaso.nextDouble());
        //Teglalap t1Teglalap = new Teglalap(olvaso.nextDouble());
        System.out.println("A téglalap területe: " + T1.terület());
        System.out.println("A téglalap kerülete: " + T1.kerület());
        olvaso.close();
    }
}
