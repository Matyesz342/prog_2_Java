package week_02;

public class negyzetosszeg {
    public static void main(String[] args)
    {
        int kulombseg = 0;
        int negyzetosszeg = 0;
        int osszegnegyzet = 0;
        for (int i = 1; i <= 100; i++)
        {
            negyzetosszeg = negyzetosszeg + i * i;
            osszegnegyzet = osszegnegyzet + i;
        }
        kulombseg = osszegnegyzet * osszegnegyzet - negyzetosszeg;
        System.out.println(kulombseg);
    }
    
}
