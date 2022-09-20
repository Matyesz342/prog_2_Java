package negyzet;

public class Negyzet {
    public double oldal;
    public double kerület()
    {
        return 2 * oldal;
    }

    public double terület()
    {
        return oldal * oldal;
    }

    public Negyzet(double oldal)
    {
        this.oldal = oldal;
    }

}
