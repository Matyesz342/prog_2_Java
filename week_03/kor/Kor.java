package week_03.kor;

public class Kor {
    private double sugar;
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

    public boolean isSmallerthan(Kor other)
    {
        return this.sugar < other.sugar;
    }
}
