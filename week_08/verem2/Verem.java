import java.util.ArrayList;
import java.util.List;

public class Verem {
    private List<Integer> data;

    public Verem() {
        this.data = new ArrayList<>();
    }

    public void betesz(int val) {
        this.data.add(val);
    }

    @Override
    public String toString() {
        return "Verem(" + this.data.toString().replace("]", "") + ")";
    }

    public int meret() {
        return this.data.size();
    }

    public boolean ures() {
        return this.meret() == 0;
    }

    public int kivesz() {
        if(this.ures()) {
            System.err.println("Hiba! A verem üres!");
            System.exit(1);
        }
        int x = this.data.get(this.meret() - 1);
        this.data.remove(this.meret() - 1);
        return x;
    }
}
