import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Main
{
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(7);
        numbers.add(11);
        numbers.add(9);
        numbers.add(5);
        System.out.println(numbers);
        Collections.sort(numbers);
        Collections.reverse(numbers);
        System.out.println(numbers);
    }
}