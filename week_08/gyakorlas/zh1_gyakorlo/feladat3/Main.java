import java.util.Scanner;

public class Main
{
    public static String remove(String path)
    {

        StringBuilder result = new StringBuilder();
        char s;
        for(int i = 0; i < path.length(); i++)
        {
            s=path.charAt(i);
            if(Character.isLetter(s))
            {
                result.append(s);
            }
            else
            {
                result.append("_");
            }
        }
        
        return result.toString();
    }
    public static void main(String[] args) {
        Scanner olvaso = new Scanner(System.in);
        System.out.print("Adjon meg egy szöveget: ");
        String line = olvaso.nextLine();
        String result = remove(line);
        System.out.println("A megadott szöveg az átalakítás után: " + result);
    }
}