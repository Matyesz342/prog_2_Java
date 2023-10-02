import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        /*Scanner olvaso = new Scanner(System.in);
        System.out.print("Adjon meg egy értéket: ");
        String sor = olvaso.nextLine();
        int sum = 0;
        for (int i = 0; i < sor.length(); i++) {
            /*if (sor.charAt(i) - 48 < 10 && sor.charAt(i) - 48 >= 0)
            {
                sum += Integer.parseInt(sor.substring(i,i+1));
            }
            sum += Character.getNumericValue(sor.charAt(i));

        }
        System.out.println(sum);*/
        char a = 'A';
        System.out.println(Character.isLetter(a));
        System.out.println(Character.isDigit(a));
        System.out.println(Character.isUpperCase(a));
        System.out.println(Character.isLowerCase(a));
        System.out.println(Character.toLowerCase(a));
        System.out.println(Character.toUpperCase(a));
        System.out.println(Character.getName(9654));
    }
}