package saját;

/*
 * A programm bekér először egy Stringet, majd egy második Stringet (első String a vezetéknév, második a keresztnév).
 * Függetlenül attól, hogy helyesen adtuk e meg a 2 Stringet a program az első karaktert nagybetűssé alakítja, a
 * maradékot pedig kisbetűssé. Végül kiírja mindkét Stringet egymás után.
 */


import java.util.Scanner;

public class Main {

    static String Fuggveny(String name)
    {
        String first = name.substring(0,1);
        first = first.toUpperCase();
        String other = name.substring(1);
        other = other.toLowerCase();
        return first + other;
    }

    public static void main(String[] args) {
        Scanner olvaso = new Scanner(System.in);
        System.out.print("Vezetéknév: ");
        String N1 = new String(olvaso.nextLine());
        System.out.print("Keresztnév: ");
        String N2 = new String(olvaso.nextLine());
        System.out.println("Az ön neve: " + Fuggveny(N1) + " " + Fuggveny(N2));
        olvaso.close();
    }
}
