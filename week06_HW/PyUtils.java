import java.util.Scanner;

public class PyUtils {
    public static String input()
    {
        Scanner olvaso = new Scanner(System.in);
        System.out.print("Text: ");
        String line = olvaso.nextLine();
        return line;
    }
}
