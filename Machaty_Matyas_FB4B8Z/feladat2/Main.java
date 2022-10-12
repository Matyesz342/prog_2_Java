import java.util.List;
import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        if(args.length != 3)
        {
            System.out.println("Hiba! Nem harom argumentumot adott meg.");
            System.exit(1);
        }
        for(int i = 0; i < args.length; i++)
        {
            System.out.println(args[i]);
        }
        else
        {
            String temp2 = args[2];
            String temp1 = args[1];
            String temp0 = args[0];
            List<String> character1 = args[0];
            List<String> character2 = args[1];
            List<String> character3 = args[2];
            /*for(int i = 0; i < temp1.length; i++)
            {
                character2.add(.get(i));
            }
            for(int i = 0; i < temp0.length; i++)
            {
                if(character2.contains(character1.get(i)))
                {
                    System.out.print(character1.get(i));
                }
            }
            System.out.println("");
            for(int i = 0; i < temp2.length; i++)
            {
                if(character1.contains(character3.get(i)))
                {
                    System.out.print(character3.get(i));
                }
            }
            System.out.println("");
        }
    }
}