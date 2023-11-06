import java.util.Random;

public class lift {
    private int emeletek_szama;
    private int akt_emelet;

    public lift(int emeletek_szama) {
        this.emeletek_szama = emeletek_szama;
        Random r = new Random();
        this.akt_emelet = r.nextInt(emeletek_szama)+1;
    }
    public void felfele() throws HibasIranyException, Exception{
        Random r = new Random();
        int limit = r.nextInt(100);
        if (limit == 99)
        {
            throw new Exception("A lift elromlott");
        }
        if (akt_emelet == emeletek_szama)
        {
            throw new HibasIranyException("Nem lehet felfelé menni");
        }
        else
        {
            this.akt_emelet++;
        }
    }
    public void lefele() throws HibasIranyException, Exception{
        Random r = new Random();
        int limit = r.nextInt(100);
        if (limit == 99)
        {
            throw new Exception("A lift elromlott");
        }
        if (akt_emelet == 1)
        {
            throw new HibasIranyException("Nem lehet felfelé menni");
        }
        else
        {
            this.akt_emelet--;
        }
    }

    @Override
    public String toString() {
        return "lift{" +
                "emeletek_szama=" + emeletek_szama +
                ", akt_emelet=" + akt_emelet +
                '}';
    }
}
