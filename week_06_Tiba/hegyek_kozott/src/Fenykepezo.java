import java.util.ArrayList;
import java.util.List;

public class Fenykepezo {
    public String type;
    public int record;

    public Fenykepezo(String type, int record) {
        this.type = type;
        this.record = record;
    }

    public String getType() {
        return type;
    }

    public int getRecord() {
        return record;
    }

    @Override
    public String toString() {
        return type + "\n";
    }
    /*public int getPanoramaWidth()
    {
        int[] array = getHegyekSzama();
        int[] clone = array.clone();
        List<String> result = new ArrayList<>();
        int max = 0;
        int idx = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < clone.length; j++) {
                if (clone[j] > max)
                {
                    max = clone[i];
                    idx = i;
                }
            }
            String tmp = getType();
            result.add(clone[i],tmp);

        }
        return this.record;
    }*/

}
