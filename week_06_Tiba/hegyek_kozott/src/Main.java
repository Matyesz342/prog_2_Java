import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        List<Fenykepezo> fenykepezok = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String sor;
        int n = Integer.parseInt(sc.nextLine());
        int counter = 0;
        while(counter < n)
        {
            sor = sc.nextLine();
            /*if (sor.length() == 0)
            {
                break;
            }*/
            String[] tmp = sor.split(":");
            fenykepezok.add(new Fenykepezo(tmp[0],getHegyekSzama(tmp[1])));
            counter++;
        }
        int max = 0;
        for (int i = 0; i < fenykepezok.size()-1; i++) {
            for (int j = i+1; j < fenykepezok.size(); j++) {
                if (fenykepezok.get(i).getRecord() < fenykepezok.get(j).getRecord())
                {
                    Fenykepezo tmp = new Fenykepezo(fenykepezok.get(i).getType(),fenykepezok.get(i).getRecord());
                    fenykepezok.set(i,fenykepezok.get(j));
                    fenykepezok.set(j,tmp);
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(fenykepezok.get(i).toString());
        }


    }
    public static int getHegyekSzama(String szoveg)
    {
        int counter = 0;
        for (int i = 0; i < szoveg.length(); i++) {
            if (szoveg.charAt(i) == '/')
            {
                counter++;
            }
        }
        return  counter;
    }
}