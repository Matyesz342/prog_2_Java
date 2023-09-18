import static java.lang.Math.sqrt;

public class Masodfok {
    private double a;
    private double b;
    private double c;

    public Masodfok(double a,double b,double c)
    {
        this.a=a;
        this.b=b;
        this.c=c;
    }

    public double getA()
    {
        return this.a;
    }
    public double getB()
    {
        return this.b;
    }
    public double getC()
    {
        return this.c;
    }
    public double getDiscriminant()
    {
        return Math.pow(b,2) - 4 * a;
    }
    public double getRoot1()
    {
        if (getDiscriminant() == 0)
        {
            return 0;
        }
        else
        {
            return (-b + sqrt(getDiscriminant()))/2*a;
        }
    }
    public double getRoot2()
    {
        if (getDiscriminant() == 0)
        {
            return 0;
        }
        else
        {
            return (-b - sqrt(getDiscriminant()))/2*a;
        }
    }
    public String toString()
    {
        return "x1= "+getRoot1() + "\nx2: " + getRoot2();
    }
}
