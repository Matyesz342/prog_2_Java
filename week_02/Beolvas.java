package week_02;

import java.util.Scanner;

public class Beolvas {
    
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Name: ");
        String name = input.nextLine();
        System.out.print("Hello:" + name + "!");
        input.close();
    }
}
