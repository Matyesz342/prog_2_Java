class MyArrayUtils
{
    public static boolean equals(int[] tomb1, int[] tomb2)
    {
        if (tomb1.length != tomb2.length)
        {
            return false;
        }
        else
        {
            for (int i = 0; i < tomb1.length; i++)
            {
                if (tomb1[i] != tomb2[i])
                {
                    return false;
                }
            }
        }
        return true;
    }

    public static int[] fill(int[] x, int y)
    {
        for(int i = 0; i < x.length; i++)
        {
            x[i] = y;
        }
        return x;
    }

    public static int[] sort(int[] x)
    {
        int tmp = 0;
        for (int i = 0; i < x.length; i++)
        {
            for (int j = i + 1; j < x.length; j++)
            {
                if(x[i] > x[j])
                {
                    tmp = x[i];
                    x[i] = x[j];
                    x[j] = tmp;
                }
            }
        }
        return x;
    }
}


public class Main {
    public static void main(String[] args)
    {
        int[] tomb1 = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] tomb2 = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] tomb3 = new int[4];
        int[] tomb4 = {2, 4, 1, 0, -1};
        boolean result = MyArrayUtils.equals(tomb1, tomb2);
        if(result)
        {
            System.out.println("A két tömb megyegyezik");
        }
        else
        {
            System.out.println("A két tömb nem egyezik meg");
        }
        tomb3 = MyArrayUtils.fill(tomb3, 7);
        for(int i = 0; i < tomb3.length; i++)
        {
            System.out.print(tomb3[i] + " ");
        }
        System.out.println("");
        tomb4 = MyArrayUtils.sort(tomb4);
        for(int i = 0; i < tomb4.length; i++)
        {
            System.out.print(tomb4[i] + " ");
        }
        System.out.println("");
    }
}
