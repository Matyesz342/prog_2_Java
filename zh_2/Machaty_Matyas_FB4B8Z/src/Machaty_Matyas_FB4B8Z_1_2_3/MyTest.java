package Machaty_Matyas_FB4B8Z_1_2_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import static Machaty_Matyas_FB4B8Z_1_2_3.Main.beolvas;
import static Machaty_Matyas_FB4B8Z_1_2_3.Main.jo_kepessegu;

public class MyTest {
    public static void main(String[] args) {
        String allomany_neve = "hallgatok.txt";
        Set<Hallgato> hallgatok = beolvas(allomany_neve);
        //System.out.println("Adatok sikeresen betöltve");
        List<Hallgato> Kulonbozo_hallgatok = new ArrayList<>(hallgatok);
        double atlag_eletkor = jo_kepessegu(Kulonbozo_hallgatok);
        assert(atlag_eletkor == 0);
        assert(atlag_eletkor == -1);
    }
}
