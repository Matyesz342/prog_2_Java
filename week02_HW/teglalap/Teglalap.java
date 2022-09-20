package teglalap;

public class Teglalap {
    public double oldala;
    public double oldalb;
    public double kerület()
    {
        return 2 * oldala + 2 * oldalb;
    }

    public double terület()
    {
        return oldalb * oldala;
    }

    public Teglalap(double oldala , double oldalb)
    {
        this.oldala = oldala;
        this.oldalb = oldalb;
    }
    
}
