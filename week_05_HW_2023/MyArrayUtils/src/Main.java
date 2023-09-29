import java.util.Arrays;


public class Main
{
    public static void main(String[] args) {
        int[] tomb = {1, 4, 5, 2, 0};
        int[] array = {0, 2, 10 ,4 , 65};
        int[] tomb_2 = {1, 4, 5, 2, 0};
        int[] fill = new int[10];
        //MyArrayUtils.reverse(tomb);
        System.out.println(MyArrayUtils.equals(tomb,array));
        System.out.println(MyArrayUtils.equals(tomb,tomb_2));
        MyArrayUtils.fill(fill,10);
        System.out.println(Arrays.toString(fill));
        Arrays.sort(array);
        MyArrayUtils.reverse(array);
        Arrays.sort(tomb_2,2,4);
        System.out.println(Arrays.toString(tomb_2));
    }
}