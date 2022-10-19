import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileUtils
{
    // input: a megnyitandó file neve
    // output: egy List<String> objektum, ami az egyes sorokat tartalmazza
    public static List<String> readLines(String fileName)
    {
        List<String> lines = new ArrayList<String>();

        try
        {
            String line;
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            while ((line = br.readLine()) != null)
            {
                lines.add(line);
            }
            br.close();
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
            System.exit(1);
        }
        catch (IOException e)
        {
            e.printStackTrace();
            System.exit(2);
        }

        return lines;
    }

    public static String readFirstLine(String fname)
    {
        return readLines(fname).get(0);
    }

    public static List<Integer> readFirstLineAsListOfDigits(String fname)
    {
        String line = readFirstLine(fname);
        List<Integer> numberz = new ArrayList<Integer>();
        for (int i = 0; i < line.length(); i++)
        {
            numberz.add(Character.getNumericValue(line.charAt(i)));
        }
        return numberz;
    }
}


