import java.util.Arrays;

public class Kocsma extends VendglatoIE{
    private String[] sorlap;

    public Kocsma(String name, int ferohelyek_szama, String[] sorlap) {
        super(name, ferohelyek_szama, true);
        this.sorlap = sorlap;
    }

    public String[] getSorlap() {
        return sorlap;
    }

    @Override
    public String toString() {
        return super.getName() + " " + Arrays.toString(this.sorlap);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || !(o instanceof Kocsma)) return false;
        Kocsma kocsma = (Kocsma) o;
        return Arrays.equals(sorlap, kocsma.sorlap);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(sorlap);
    }
}
