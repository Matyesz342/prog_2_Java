import java.util.*;

class Pair
{
    public int a;
    public int b;
}

public class Main {
    public static void main(String[] args) {
        /*int[] tomb = {1,6,5,4,9,1};
        int[] result = getFirstAndLast(tomb);
        List<Integer> result_V2 = getFirstAndLastV2(tomb);
        System.out.println(result_V2);
        Pair result_V3 = getFirtsAndLast_V3(tomb);
        int x = result_V3.a;
        int y = result_V3.b;

        System.out.println(Arrays.toString(result));*/

        List<Integer> list1 = new ArrayList<>();
        list1.add(3);
        list1.add(5);
        List<Integer> list2 = new ArrayList<>();
        list2.add(99);
        list2.addAll(list1);
        //Collections.sort(list2);
        //Collections.reverse(list2);
        //Collections.shuffle(list2);
        Collections.rotate(list2,1);
        System.out.println(list1);
        System.out.println(list2);

    }

    private static int[] getFirstAndLast(int[] tomb) {
        int[] result = new int[2];
        result[0] = tomb[0];
        result[1] = tomb[tomb.length-1];
        return result;
    }
    private static List<Integer> getFirstAndLastV2(int[] tomb)
    {
        List<Integer> result = new ArrayList<Integer>();
        result.add(tomb[0]);
        result.add(tomb[tomb.length-1]);
        return result;
    }
    private static Pair getFirtsAndLast_V3(int[] tomb)
    {
        Pair result = new Pair();
        result.a = tomb[0];
        result.b = tomb[tomb.length-1];
        return result;
    }
}