// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static boolean Palindrom(int number)
    {
        int copy = number;
        int new_number = 0;
        int digit;
        while(number > 0)
        {
            digit = number % 10;
            new_number = new_number *10 +digit;
            number = number / 10;
        }
        if (new_number == copy)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String[] args) {
        boolean result = Palindrom(12131);
        System.out.println(result);
    }
}