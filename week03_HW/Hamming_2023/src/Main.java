import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner olvaso = new Scanner(System.in);
        System.out.println("Adjon megy egy szót: ");
        String String1 = olvaso.nextLine();
        System.out.println("Adjon megy egy szót: ");
        String String2 = olvaso.nextLine();
        Hamming tav = new Hamming(String1, String2);
        System.out.println(tav.getTav());
    }
}