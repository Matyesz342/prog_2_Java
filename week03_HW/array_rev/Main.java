import java.util.Arrays;

class MyArrayUtils
{
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
}

public class Main
{
    public static void main(String[] args) {
        int[] tomb = {1, 4, 5, 2, 0};
        MyArrayUtils.reverse(tomb);
    }
}