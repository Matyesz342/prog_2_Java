package week_03.kor;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args)
    {
        Scanner olvaso = new Scanner(System.in);
        //System.out.print("Adja meg a kör sugarát: ");
        Kor K1 = new Kor(5.1);
        System.out.println("A kör területe: " + K1.terület());
        System.out.println("A kör kerülete: " + K1.kerület());
        Kor K2 = new Kor(2.4);
        Kor K3 = new Kor(9.6);

        if(K2.isSmallerthan(K3))
        {
            System.out.println("A kör kerülete: " + K2.terület());
        }
        
        olvaso.close();
    }
}
