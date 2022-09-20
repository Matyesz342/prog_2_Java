package kör;

public class Kor {
    public double sugar;
    public double kerület()
    {
        return 2 * sugar * Math.PI;
    }

    public double terület()
    {
        return sugar * sugar * Math.PI;
    }

    public Kor(double sugar)
    {
        this.sugar = sugar;
    }
}
