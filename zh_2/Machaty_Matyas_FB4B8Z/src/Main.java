import Machaty_Matyas_FB4B8Z_4.jatek;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        if (args.length == 0)
        {
            System.exit(1);
        }
        String file_name = args[0];
        Set<String> tarsasjatekok=new HashSet<>();
        List<jatek> jatekok = new ArrayList<>();
        try {
            String line;
            BufferedReader br = new BufferedReader(new FileReader(file_name));
            while((line = br.readLine()) != null)
            {
                String[] sor = line.split(":");
                String name = sor[0];
                String game = sor[1];
                jatekok.add(new jatek(name,game));
                tarsasjatekok.add(game);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        List<String> rendezett_tarsasjatekok = new ArrayList<>(tarsasjatekok);
        List<Integer> darab = new ArrayList<>();
        for (int i = 0; i < tarsasjatekok.size(); i++) {
            int counter = 0;
            for (int j = 0; j < jatekok.size(); j++) {
                if (rendezett_tarsasjatekok.get(i).contains(jatekok.get(j).getGame()))
                {
                    counter++;
                }
            }
            darab.add(counter);
        }
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < rendezett_tarsasjatekok.size(); i++) {
            map.put(rendezett_tarsasjatekok.get(i), darab.get(i));
        }
        //System.out.println(map);

        List<String> sor = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < map.size(); i++) {
            sb.append(rendezett_tarsasjatekok.get(i)).append(": ");
            for (int j = 0; j < jatekok.size(); j++) {
                if (jatekok.get(j).getGame().equals(rendezett_tarsasjatekok.get(i)))
                {
                    sb.append(jatekok.get(j).getName()).append(", ");
                }
            }
            sb.delete(sb.length()-2, sb.length());
            sb.append("\n");
        }
        int counter = 0;
        try {
            PrintWriter writer = new PrintWriter(new File("ki_jatek.txt"));
            writer.println(sb.toString());
            writer.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }


}