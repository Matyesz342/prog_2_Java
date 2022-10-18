public class StringUtils {
    public static void randomCase(String line)
    {
        double random;
        for (int i = 1; i <= line.length(); i++)
        {
            random = Math.random();
            if (random > 0.5)
            {
                System.out.print(line.substring(i-1, i).toUpperCase());
            }
            else
            {
                System.out.print(line.substring(i-1,i).toLowerCase());
            }
        }
    }
}
