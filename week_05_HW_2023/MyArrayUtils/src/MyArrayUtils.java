import java.util.Arrays;

public class MyArrayUtils {
    static void reverse(int[] tomb)
    {
        int n = tomb.length;
        int t;
        for (int i = 0; i < n / 2; i++) {
            t = tomb[i];
            tomb[i] = tomb[n - i - 1];
            tomb[n - i - 1] = t;
        }
        /*for (int j = 0; j < n; j++) {
            System.out.print(tomb[j]);
        }*/
        System.out.println(Arrays.toString(tomb));
    }
    static boolean equals(int[] array_1, int[] array_2)
    {
        return Arrays.equals(array_1,array_2);
    }
    static void fill(int[] array, int number)
    {
        for (int i = 0; i < array.length; i++) {
            array[i] = number;
        }
    }


}
