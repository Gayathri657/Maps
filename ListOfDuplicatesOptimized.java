import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class ListOfDuplicatesOptimized {

    public static void main(String[] args) {
        List<Integer> l = List.of(2, 3, 45, 2, 34, 7);
        var nm = new HashMap<Integer, Boolean>();
        boolean x = false;
        for (int i : l) {
            if (nm.containsKey(i)) {
                x = true;
            }
            nm.put(i, false);
        }
        System.out.println(x);

    }
}
