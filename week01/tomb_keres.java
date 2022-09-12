import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class tomb_keres
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader olvaso = new BufferedReader(new InputStreamReader(System.in));
        int[] tomb = new int[5];
        tomb[0] = 1;
        tomb[1] = 2;
        tomb[2] = 3;
        tomb[3] = 4;
        tomb[4] = 5;
        System.out.print("Adjon meg egy szamot:");
        int keresett = Integer.parseInt(olvaso.readLine());
        int szamlalo = 0;
        for(int i=0; i<tomb.length; i++)
        {
            if(tomb[i] == keresett)
            {
                System.out.println("A keresett elem megtalalhato a tombben!");
                System.out.println(i+1 + " hely a tombben!");
                break;
            }
            else
            {
                szamlalo++;
            }
        }
        if(szamlalo == tomb.length)
        {
            System.out.println("A keresett nem eleme a tombnek!");
        }
    }
}