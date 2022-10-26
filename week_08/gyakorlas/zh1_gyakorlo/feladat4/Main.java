import java.util.ArrayList;
import java.util.List;

public class Main
{
    public static void main(String[] args) {
        String fname = "pelda.txt";
        List<String> lines = FileUtils.readLines(fname);
        int first;
        int second;
        int third;
        int result;
        for (String line : lines) {
            line.split("x");
            first = line.indexOf(0);
            second = line.indexOf(1);
            third = line.indexOf(2);
            result += 2 *  
        }
    }
}