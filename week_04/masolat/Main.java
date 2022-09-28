import java.utils.Arrays;

class PairIntInt
{
    int a;
    int b;
}

public class Main
{
    public static int[] Minmax(int[] a)
    {
        int[] result = new int[2];
        int min = 1000, max = 0;
        for(int i = 0; i < a.length; i++)
        {
            if(a[i] < min)
            {
                min = a[i];
            }
            if(a[i] > max)
            {
                max = a[i];
            }
            result[0] = min;
            result[1] = max;

        }

        return result;
    }

    //Házi
    public static PairIntInt Minmax2(int[] a)
    {
        PairIntInt pair = new PairIntInt();
        pair.a = 3;
        pair.b = 7;
        return pair;
    }


    public static void main(String[] args)
    {
        int[] tomb = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] arr = tomb.clone();
        tomb[0] = 99;
        for(int e : tomb)
        {
            System.out.println(e);
        }
        System.out.println("================================");
        for(int e : arr)
        {
            System.out.println(e);
        }
        System.out.println("================================");
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        int[] result = Minmax(array);
        System.out.println(java.util.Arrays.toString(result));
        System.out.println("===============================");
        PairIntInt pair = Minmax2(tomb);
        System.out.println(pair.a);
        System.out.println(pair.b);
    }
}