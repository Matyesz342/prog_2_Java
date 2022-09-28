class Proba
{
    public int add(int a, int b)
    {
        System.out.println("# v1, int");
        return a + b;
    }

    public double add(double a, double b)
    {
        System.out.println("# v2, double");
        return a + b;
    }
}

public class Main
{
    public static void main(String[] args) {
        Proba p = new Proba();
        System.out.println(p.add(2,3));
        System.out.println(p.add(2,3.1));
    }
}