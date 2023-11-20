package Machaty_Matyas_FB4B8Z_1_2_3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static java.util.HashSet.newHashSet;

public class Main {
    public static void main(String[] args) {
        //név,életkor,férfi_e,átlag
        String allomany_neve = "hallgatok.txt";
        Set<Hallgato> hallgatok = beolvas(allomany_neve);
        //System.out.println("Adatok sikeresen betöltve");
        List<Hallgato> Kulonbozo_hallgatok = new ArrayList<>(hallgatok);
        double atlag_eletkor = jo_kepessegu(Kulonbozo_hallgatok);
        System.out.println(atlag_eletkor);
    }

    public static double jo_kepessegu(List<Hallgato> hallgato) {
        if (hallgato.isEmpty())
        {
            return -1;
        }
        double avrege = 0.0;
        int counter = 0;
        for (Hallgato h: hallgato) {
            if (h.getAtlag() >= 4.0)
            {
                avrege +=h.getEletkor();
                counter++;
            }
        }
        avrege = (double) avrege / counter;
        if (avrege == 0.0)
        {
            return 0;
        } else
        {
            return avrege;
        }

    }

    public static Set<Hallgato> beolvas(String allomanyNave) {
        Set<Hallgato> lista = new HashSet<>();
        String line;
        try {
            BufferedReader br = new BufferedReader(new FileReader(allomanyNave));
            while ((line = br.readLine()) != null)
            {
                if (line.length() < 4)
                {
                    throw new HianyosSorException();
                }
                else
                {
                    String[] data = line.split(",");
                    String name = data[0];
                    int age = Integer.parseInt(data[1]);
                    boolean ferfi_e = Boolean.parseBoolean(data[2]);
                    double avrege = Double.parseDouble(data[3]);
                    lista.add(new Hallgato(name,age,ferfi_e,avrege ));
                }

            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return lista;
    }
}
