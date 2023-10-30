public class VendglatoIE
{
    private String name;
    private int ferohelyek_szama;
    private boolean dohanyzo;

    public VendglatoIE(String name, int ferohelyek_szama, boolean dohanyzo) {
        this.name = name;
        this.ferohelyek_szama = ferohelyek_szama;
        this.dohanyzo = dohanyzo;
    }

    public String getName() {
        return name;
    }


    public int getFerohelyek_szama() {
        return ferohelyek_szama;
    }


    public boolean isDohanyzo() {
        return dohanyzo;
    }

    public void setDohanyzo(boolean dohanyzo) {
        this.dohanyzo = dohanyzo;
    }

    @Override
    public String toString() {
        return "VendglatoIE{" +
                "name='" + name + '\'' +
                ", ferohelyek_szama=" + ferohelyek_szama +
                ", dohanyzo=" + dohanyzo +
                '}';
    }
}
