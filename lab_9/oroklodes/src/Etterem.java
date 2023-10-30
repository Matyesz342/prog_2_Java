import java.util.Arrays;

public class Etterem extends VendglatoIE {
    private String[] etlap;

    public Etterem(String name, int ferohelyek_szama, String[] etlap) {
        super(name, ferohelyek_szama, false);
        this.etlap = etlap;
    }

    public String[] getEtlap() {
        return etlap;
    }

    @Override
    public String toString() {
        return super.getName()+ " " + Arrays.toString(this.etlap);
    }
}
