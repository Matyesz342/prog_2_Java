import java.util.List;

public class Main
{
    public static void main(String[] args) {
        String fname = "day01.txt";
        List<Integer> numbers = FileUtils.readFirstLineAsListOfDigits(fname);
        int sum = 0;
        for (int i = 1; i <= numbers.size(); i++) 
        {
            if(i == numbers.size())
            {
                if(numbers.get(i) == numbers.get(0))
                {
                    sum += numbers.get(i);
                }
            }
            if(numbers.get(i-1) == numbers.get(i))
            {
                sum += numbers.get(i);
            }
        }
        System.out.println("sum: " + sum);
    }
}