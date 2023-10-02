import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Személy
{
    private int sz;
    private String n;

    
}

public class Main {
    public static void main(String[] args) {
        List<Személy> t = new ArrayList<>();

        //int idx = 0;
        int sz;
        String n;
        Scanner olvaso = new Scanner(System.in);
        while((sz = olvaso.nextInt()) != 0)
        {
            n=olvaso.next();
            Személy sze = new Személy(sz,n);
            t.add(sze);
        }
        Személy min = t.get(0);
        for (int i = 0; i < t.size(); i++) {
            if (t.get(i).getSz_év(i)<min.getSz_év())
        }
    }
}