import java.lang.Math;

public class Main
{
    public static void vonal()
    {
        for(int i = 0; i < 15; i++)
        {
            System.out.print("-");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        System.out.println("Az abs(int) metódus egy szám abszolút értékével tér vissza!");
        int szam = -1414;
        System.out.println("Az eredeti szám: " + szam);
        System.out.println("Az eredeti szám abszolút értéke: " + Math.abs(szam));
        vonal();
        System.out.println("Az min(int ,int ) metódus két szám közül a kisebbet adja meg!");
        int Value1 = 1414;
        int Value2 = 1524;
        System.out.println("Az eredeti számok: " + Value1 + ", "+ Value2);
        System.out.println("A két szám közül a kisebb: " + Math.min(Value1,Value2));
        vonal();
        System.out.println("Az max(int ,int) metódus két szám közül a nagyobbat adja meg!");
        System.out.println("Az eredeti számok: " + Value1 +", " + Value2);
        System.out.println("A két szám közül a kisebb: " + Math.max(Value1,Value2));
        vonal();
        double Sqrt = 16;
        System.out.println("Az sqrt(double) metódus egy szám négyzetgyökét adja meg!");
        System.out.println("Az eredeti szám: " + Sqrt);
        System.out.println("Az eredeti szám négyzetgyöke: "+ Math.sqrt(Sqrt));
        vonal();
        int x = 4;
        int y = 5;
        System.out.println("Az multiplyExact(int x,int y) metódus két számot megszoroz egymással!");
        System.out.println("Az eredeti számok: "+ x +", " + y);
        System.out.println("Az eredeti számok szorzata: "+ Math.multiplyExact(x,y));
    }
}