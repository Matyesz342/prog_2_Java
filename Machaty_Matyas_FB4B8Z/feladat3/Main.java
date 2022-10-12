import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input: ");
        String n = scanner.nextLine();
        List<String> characters = new ArrayList<String>();
        List<String> copychar = new ArrayList<String>();
        for (int i = 0; i < n.length(); i++)
        {
            if(i == n.length() -1)
            {
                if(characters.contains(n.substring(i)))
                {
                    copychar.add(n.substring(i));
                }
                else
                {
                    characters.add(n.substring(i));
                    //System.out.print(n.substring(i));
                }
            }
            else 
            {
                if(characters.contains(n.substring(i, i+1)))
                {
                    copychar.add(n.substring(i, i+1));
                }
                else
                {
                    characters.add(n.substring(i, i+1));
                    //System.out.print(n.substring(i, i+1));
                }
            }
            
        }
        String temp;
        for(int i = 0; i < characters.size(); i++)
        {
            temp = characters.get(i);
            if(copychar.contains(temp))
            {

            }
            else
            {
                
                System.out.print(temp);
            }
        }
        System.out.println("");
    }
}