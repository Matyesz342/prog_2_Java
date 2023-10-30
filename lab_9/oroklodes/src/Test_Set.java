import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test_Set {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Alma");
        set.add("Korte");
        set.add("Szilva");
        Set<String> set1 = new HashSet<>(List.of("Alma","Korte","Szilva","dd"));
        List<String> lst = new ArrayList<>(set);
        /*set.addAll(set1);

        System.out.println("Benne van e egy elem: " + lst.contains("Alma"));
        System.out.println("Mennyi a merete: " + lst.size());*/
        //set.retainAll(set1);
        //set.removeAll(set1);
        System.out.println(set.remove("Alma"));
    }
}
