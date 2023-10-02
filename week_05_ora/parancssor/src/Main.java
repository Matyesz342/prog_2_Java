public class Main {
    public  static  boolean isSzamtani(int[] tomb)
    {
        if (tomb.length == 1)
        {
            return true;
            // System.exit(0);
        }
        int diff = tomb[1] - tomb[0];
        for (int i = 1; i < tomb.length-1; i++) {
            if (tomb[i]+diff != tomb[i+1])
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] numbers = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            numbers[i] = Integer.parseInt(args[i]);
        }
        boolean valasz = isSzamtani(numbers);
        if (valasz)
        {
            System.out.println("A sorozat számtani.");
        }
        else
        {
            System.out.println("A sorozat nem számtani.");
        }
    }
}