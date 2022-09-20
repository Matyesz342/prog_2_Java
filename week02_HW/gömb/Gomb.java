package gömb;

public class Gomb {
    public double sugar;
    public double felszin()
    {
        return 4 * Math.PI * (sugar * sugar);
    }

    public double terfogat()
    {
        return (4 * Math.PI / 3) * (sugar * sugar * sugar);
    }

    public Gomb(double sugar)
    {
        this.sugar = sugar;
    }
}
