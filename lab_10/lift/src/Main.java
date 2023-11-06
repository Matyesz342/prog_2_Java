import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader(new File("input.txt"));
            BufferedReader br = new BufferedReader(fr);
            List<lift> list = new ArrayList<>();

            int lift_number = Integer.parseInt(br.readLine());
            int count = 0;
            String line;
            while (br.readLine() != null)
            {
                line = br.readLine();
                if (count <  lift_number)
                {
                    lift lit = new lift(Integer.parseInt(line));
                    list.add(lit);
                    count++;

                }
                else
                {
                    String[] line_split = line.split(";");
                    int lift_szama = Integer.parseInt(line_split[0])-1;
                    if (line_split[1].equals("fel"))
                    {
                        list.get(lift_szama).felfele();
                        System.out.println(list.get(lift_szama));
                    } else if (line_split[1].equals("le")) {
                        list.get(lift_szama).lefele();
                        System.out.println(list.get(lift_szama));
                    }
                }

            }
        }
        catch (HibasIranyException ex)
        {
            System.out.println(ex.toString());
        }
        catch (FileNotFoundException ex)
        {
            System.out.println(ex.toString());
        }
        catch (Exception ex)
        {
            System.out.println(ex.toString());
        }
    }
}