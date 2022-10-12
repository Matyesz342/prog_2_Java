import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        String fname = "numbers.txt";
        int min = 1000;
        int minindex = 1;
        int max = 0;
        int maxindex = 1;
        int temp1 = 0;
        int temp2 = 0;
        List<String> lines = FileUtils.readFile(fname);
        for (String line : lines)
        {
            String[] tokens = line.split(" ");
            for(int i = 0; i < tokens.length(); i++)
            {
                temp1 += tokens.getNumericValue(i);
                temp2 += tokens.getNumericValue(i);
            }
            if(temp1 < min)
            {
                min = temp1;
                minindex = i+1;

            }
            if(temp2 > max)
            {
                max = temp2;
                maxindex = i+1;
            }
        }
        System.out.println("A legkisebb osszeg (%d) az %d. sorban talalhato.",min,minindex);
        System.out.println("A legnagyobb osszeg (%d) az %d. sorban talalhato.",max,maxindex);
    }
}