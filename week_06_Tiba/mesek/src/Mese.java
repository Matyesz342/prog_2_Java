import java.util.List;

public class Mese {
    private String cim;
    private List<String> hosok;

    public Mese(String cim, List<String> hosok) {
        this.cim = cim;
        this.hosok = hosok;
    }

    public String getCim() {
        return cim;
    }

    public void setCim(String cim) {
        this.cim = cim;
    }

    public List<String> getHosok() {
        return hosok;
    }

    public void setHosok(List<String> hosok) {
        this.hosok = hosok;
    }

    @Override
    public String toString() {
        return cim + ':';
    }
}
