package Machaty_Matyas_FB4B8Z_1_2_3;

public class Hallgato extends Szemely{
    private double atlag;

    public Hallgato(String nev, int eletkor, boolean ferfi, double atlag) {
        super(nev, eletkor, ferfi);
        this.atlag = atlag;
    }

    public double getAtlag() {
        return atlag;
    }
}
