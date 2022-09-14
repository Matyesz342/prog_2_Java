package week_02;

import java.util.Scanner;

public class String_input 
{
    static String input(String prompt)
    {
        Scanner input = new Scanner(System.in);
        System.out.print(prompt);
        String name = input.nextLine();
        input.close();
        return name;   
    } 
    public static void main(String[] args) 
    {
        String neved = input("Neved: ");
        System.out.println(neved);
    }

}
    

