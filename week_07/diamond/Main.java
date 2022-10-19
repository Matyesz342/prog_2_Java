import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        
        Scanner olvaso = new Scanner(System.in);
        System.out.print("Number: ");
        int number = olvaso.nextInt();
        assert number % 2 == 0 : "Number must be odd";
        int spaces_elso=number/2;

        for(int i=1; i<=number; i=i+2)
        {
            int star=i;

            for(int e=1; e<=spaces_elso; e++)
            {
               
               
                System.out.print(" ");
            }
            for(int j=0; j<star; j++)
            {
                System.out.print("*");
            }
            for(int u=1; u<=spaces_elso; u++)
            {
                System.out.print(" ");
            }

            System.out.print("\n");
            spaces_elso--;

        }

        int spaces=1;

        for(int i=number-2; i>0; i=i-2)
        {
            int star_mas=i;

            for(int e=0; e<spaces; e++)
            {
                System.out.print(" ");
            }
            for(int j=0; j<star_mas; j++)
            {
                System.out.print("*");
            }
            for(int u=0; u<spaces; u++)
            {
                System.out.print(" ");
            }

            System.out.print("\n");

            spaces++;
        }
    }
}