package week_02;

public class kisebb {
    public static void main(String[] args)
    {
        int szam = 0;
        for (int i = 0; i < 1000; i++)
        {  
            if (i % 3 == 0 || i % 5 == 0)
            {
                szam = szam + i;
            }
        }
        System.out.println(szam);
    }
    
}
