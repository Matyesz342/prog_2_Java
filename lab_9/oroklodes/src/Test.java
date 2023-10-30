import java.util.HashSet;
import java.util.Set;

public class Test {
    public static Set<Kocsma> adottItalt(String ital, VendglatoIE[] t)
    {
        Set<Kocsma> h = new HashSet<>();
        for (VendglatoIE v : t)
        {
            if (v instanceof Kocsma)
            {
                Kocsma tmp = (Kocsma) v;

                for (String s : tmp.getSorlap())
                {
                    if (s.equals(ital))
                    {
                        h.add(tmp);
                    }
                }
            }
        }
        return h;
    }

    public static void main(String[] args) {
        VendglatoIE[] t = new VendglatoIE[6];
        t[0] = new Kocsma("Torik-szakad",23,new String[]{"Borsodi","Soproni"});
        t[1] = new Etterem("Csokonai",33,new String[]{"Turos csusza","Babgulyás"});
        t[2] = new Kocsma("Ibolya",13,new String[]{"Arany Aszok","Soproni"});
        t[3] = new Kocsma("Nagyablakos",81,new String[]{"Kobanyai","Soproni","Borsodi"});
        t[4] = new Etterem("Campus",55,new String[]{"Turos csusza","Babgulyás"});
        t[5] = new Kocsma("Torik-szakad",23,new String[]{"Borsodi","Soproni"});
        for (Kocsma k : adottItalt("Borsodi",t))
        {
            System.out.println(k);
        }
    }
}
