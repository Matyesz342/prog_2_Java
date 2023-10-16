import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Mese> mesek = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int counter = 0;
        String szereplo = args[0];//sc.nextLine();
        String sor;
        while(true)
        {
            sor = sc.nextLine();
            if (sor.length() == 0)
            {
                break;
            }
            String[] tmp = sor.split(":");
            mesek.add(new Mese(tmp[0],getMeseHosok(tmp[1])));
            counter++;
        }
        for (int i = 0; i < mesek.size(); i++) {
            if (mesek.get(i).getHosok().contains(szereplo))
            {
                System.out.println(mesek.get(i) +" " + mesek.get(i).getHosok().size());
            }

        }
    }

    private static List<String> getMeseHosok(String s) {
        List<String> result = new ArrayList<>();
        String[] sor = s.split(",");
        for (int i = 0; i < sor.length; i++) {
            result.add(sor[i]);
        }
        return result;
    }
}