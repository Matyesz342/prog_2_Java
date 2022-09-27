import java.util.Arrays;

class MyArrayUtils
{
    static int[] sortDescending(int[] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            array[i] = array[i] * -1;
        }
        Arrays.sort(array);
        for(int i = 0; i < array.length; i++)
        {
            array[i] = array[i] * -1;
        }
        return array;
    }
}

public class Main
{
    public static void main(String[] args)
    {
        int[] tomb = {2, 5, 1, 4, 3};
        System.out.println(Arrays.toString(tomb));
        MyArrayUtils.sortDescending(tomb);
        System.out.println(Arrays.toString(tomb));
    }

}